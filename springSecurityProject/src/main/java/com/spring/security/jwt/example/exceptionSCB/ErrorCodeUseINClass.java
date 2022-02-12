package com.spring.security.jwt.example.exceptionSCB;

public class ErrorCodeUseINClass {

    public String checkMethod(){
        int i = 10;
        if(i==11){
            throw new BusinessException(CSLErrorCodes.DEFAULT_ERROR_CODE);
        }
        return null;
    }
}
