package com.spring.security.jwt.example.exceptionSCB;

import lombok.Getter;

import static com.spring.security.jwt.example.exceptionSCB.CSLErrorCodeUtil.convertToString;

@Getter
public enum CSLErrorCodes implements ErrorCode{

    DEFAULT_ERROR_CODE("","","");

    private String code;
    private String title;
    private String description;


    public String toString() {
        return convertToString(this);
    }

    CSLErrorCodes(String code, String title, String description){
        this.code = code;
        this.title = title;
        this.description = description;
    }
}
