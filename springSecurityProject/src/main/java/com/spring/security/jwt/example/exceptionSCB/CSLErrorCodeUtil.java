package com.spring.security.jwt.example.exceptionSCB;

public class CSLErrorCodeUtil {
    public static String convertToString(ErrorCode errorCode) {
        return errorCode.getCode()+ " : "+errorCode.getTitle()+" : "+
               errorCode.getDescription();
    }
}
