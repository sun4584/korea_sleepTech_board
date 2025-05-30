package com.project.board_back.provider;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class JwtProvider {
    private final Key key;
    private final int jwtExpirationMs;
    private final long jwtEmailExpirationMs;

    public int getExpiration() {
        return jwtExpirationMs;
    }

    public JwtProvider(
            @Value("${jwt.secret}") String secret,
            @Value("${jwt.expiration}") int jwtExpirationMs,
            @Value("${jwt.email-expiration-ms}") long jwtEmailExpirationMs
    ) {
        this.key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secret));
        this.jwtExpirationMs = jwtExpirationMs;
        this.jwtEmailExpirationMs = jwtEmailExpirationMs;
    }

    public String generateJwtToken(String username, Set<String> roles) {
        return Jwts.builder()
                .claim("username", username)
                .claim("roles", roles)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + jwtExpirationMs))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    public String generateEmailValidToken(String username) {
        return Jwts.builder()
                .claim("username", username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + jwtEmailExpirationMs))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    public String removeBearer(String bearerToken) {
        if (bearerToken == null || !bearerToken.startsWith("Bearer ")) {
            throw new RuntimeException("Invalid JWT token format");
        }
        return bearerToken.substring("Bearer ".length());
    }

    public boolean isValidToken(String token) {
        try {
            getClaims(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Claims getClaims(String token) {
        JwtParser jwtParser = Jwts.parserBuilder()
                .setSigningKey(key)
                .build();
        return jwtParser.parseClaimsJws(token).getBody();
    }

    public String getUsernameFromJwt(String token) {
        Claims claims = getClaims(token);
        return claims.get("username", String.class);
    }

    public Set<String> getRolesFromJwt(String token) {
        Claims claims = getClaims(token);
        return new HashSet<>((List<String>) claims.get("roles"));
    }
}