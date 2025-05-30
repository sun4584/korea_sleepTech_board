import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

EX) enums 패키지에 명시된 enum 타입을 entity 필드에 적용하는 경우

public class user {

    // EnumType.STRING 설정 시 DB에 VARCHA로 저장되어 가독성 및 변경 용이성
    // DB 내에서 직접적으로 ENUM 타입 사용 X (유지보수 측면에서 불리)
    // +) ENUM 타입을 사용하는 DTO 또는 다른 파일에서 import 사용 가능
    @Enumerated(EnumType.STRING)
    @Column
    private userRole userRole;
}