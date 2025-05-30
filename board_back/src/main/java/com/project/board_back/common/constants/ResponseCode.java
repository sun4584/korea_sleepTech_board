package com.project.board_back.common.constants;

public interface ResponseCode {

    // 공통
    String SUCCESS = "SU"; // Success
    String FAIL = "FA"; // General Fail
    String DATABASE_ERROR = "DBE"; // Database Error

    // 인증/인가 관련
    String SIGN_IN_FAIL = "SF"; // Sign in failed
    String AUTHENTICATION_FAIL = "AF"; // 인증 실패
    String AUTHORIZATION_FAIL = "AUF"; // 인가 실패
    String NO_PERMISSION = "NP"; // 권한 없음
    String TOKEN_CREATE_FAIL = "TCF"; // 토큰 생성 실패
    String TOKEN_EXPIRED = "TE"; // 토큰 만료
    String INVALID_TOKEN = "IT"; // 잘못된 토큰

    // 유효성 검사 관련
    String VALIDATION_FAIL = "VF"; // Validation failed
    String INVALID_INPUT = "IV"; // Invalid input
    String REQUIRED_FIELD_MISSING = "RM"; // 필수값 누락
    String FORMAT_ERROR = "FE"; // 형식 오류

    // 사용자 관련
    String DUPLICATED_USER_ID = "DI"; // 중복된 아이디
    String DUPLICATED_EMAIL = "DE"; // 중복된 이메일
    String DUPLICATED_TEL_NUMBER = "DT"; // 중복된 전화번호
    String NO_EXIST_USER_ID = "NI"; // 존재하지 않는 사용자
    String USER_NOT_FOUND = "UNF";
    String USER_ALREADY_EXISTS = "UAE";

    // 리소스 관련
    String NO_EXIST_TOOL = "NT"; // 존재하지 않는 도구
    String NO_EXIST_CUSTOMER = "NC"; // 존재하지 않는 고객
    String TOOL_INSUFFICIENT = "TI"; // 도구 부족
    String RESOURCE_NOT_FOUND = "RNF";

    // 인증번호 / 메시지 관련
    String TEL_AUTH_FAIL = "TAF"; // 전화 인증 실패
    String MESSAGE_SEND_FAIL = "TF"; // 메시지 전송 실패
    String VERIFICATION_CODE_INVALID = "VCI";
    String VERIFICATION_CODE_EXPIRED = "VCE";

    // 파일 관련
    String FILE_UPLOAD_FAIL = "FUF";
    String FILE_NOT_FOUND = "FNF";

    // 서버 오류
    String INTERNAL_SERVER_ERROR = "ISE";
    String SERVICE_UNAVAILABLE = "SUA";
    String REQUEST_TIMEOUT = "RT";

    // 데이터 오류
    String DATA_INTEGRITY_VIOLATION = "DIV";
    String CONSTRAINT_VIOLATION = "CV";
    String DUPLICATE_ENTRY = "DUP";

}