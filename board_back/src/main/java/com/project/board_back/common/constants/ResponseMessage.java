package com.project.board_back.common.constants;

public interface ResponseMessage {

    // 공통
    String SUCCESS = "Success.";
    String FAILED = "Failed.";
    String DATABASE_ERROR = "Database error.";

    // 인증/인가 관련
    String SIGN_IN_FAIL = "Sign in failed.";
    String AUTHENTICATION_FAIL = "Authentication failed.";
    String AUTHORIZATION_FAIL = "Authorization failed.";
    String NO_PERMISSION = "No permission.";
    String TOKEN_CREATE_FAIL = "Token creation failed.";
    String TOKEN_EXPIRED = "Token has expired.";
    String INVALID_TOKEN = "Invalid token.";

    // 유효성 검사 관련
    String VALIDATION_FAIL = "Validation failed.";
    String INVALID_INPUT = "Invalid input value.";
    String REQUIRED_FIELD_MISSING = "Required field is missing.";
    String FORMAT_ERROR = "Input format is incorrect.";

    // 사용자 관련
    String DUPLICATED_USER_ID = "Duplicated user ID.";
    String DUPLICATED_EMAIL = "Duplicated email.";
    String DUPLICATED_TEL_NUMBER = "Duplicated user phone number.";
    String NO_EXIST_USER_ID = "User ID does not exist.";
    String USER_NOT_FOUND = "User not found.";
    String USER_ALREADY_EXISTS = "User already exists.";

    // 리소스 관련
    String NO_EXIST_TOOL = "Tool does not exist.";
    String NO_EXIST_CUSTOMER = "Customer does not exist.";
    String RESOURCE_NOT_FOUND = "Requested resource not found.";
    String TOOL_INSUFFICIENT = "This tool is insufficient in number.";

    // 인증번호 / 메시지 관련
    String TEL_AUTH_FAIL = "Phone number authentication failed.";
    String MESSAGE_SEND_FAIL = "Failed to send message.";
    String VERIFICATION_CODE_INVALID = "Invalid verification code.";
    String VERIFICATION_CODE_EXPIRED = "Verification code expired.";

    // 서버 오류
    String INTERNAL_SERVER_ERROR = "Internal server error occurred.";
    String SERVICE_UNAVAILABLE = "Service is temporarily unavailable.";
    String REQUEST_TIMEOUT = "Request timeout.";

    // 데이터 관련
    String DATA_INTEGRITY_VIOLATION = "Data integrity violation.";
    String CONSTRAINT_VIOLATION = "Constraint violation.";
    String DUPLICATE_ENTRY = "Duplicate entry.";

    // 파일 관련
    String FILE_UPLOAD_FAIL = "File upload failed.";
    String FILE_NOT_FOUND = "File not found.";
}