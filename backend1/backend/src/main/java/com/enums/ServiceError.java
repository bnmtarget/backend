package com.enums;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor 
@Getter
public enum ServiceError {

    
    CREDENTIAL_MISMATCH("ERR_06", "INVALID EMAIL/PASSWORD", HttpStatus.UNAUTHORIZED),
    USER_NOT_VERIFIED("ERR_07", "Please verify yourself using email sent", HttpStatus.UNAUTHORIZED),
    USER_NOT_FOUND("ERR_08", "No user found with this email id, check for typos and try again. " +
            "Please make sure your account is verified before resetting your password.", HttpStatus.NOT_FOUND);
    

    private final String errorCode;
    private final String errorMessage;
    private final HttpStatus httpStatus;
}