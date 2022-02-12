package com.spring.security.jwt.example.exceptionSCB;

public class BusinessException extends RuntimeException{
    private ErrorCode errorCode;
    private Throwable cause;

    public BusinessException(ErrorCode errorCode){
        super(errorCode.getDescription());
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode, Throwable cause){
        super(errorCode.getDescription());
        this.errorCode = errorCode;
        this.cause = cause;
    }
}
