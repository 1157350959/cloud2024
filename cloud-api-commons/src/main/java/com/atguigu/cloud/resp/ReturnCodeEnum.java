package com.atguigu.cloud.resp;

import lombok.Getter;

/**
 * ClassName: ReturnCodeEnum
 * Package: com.atguigu.cloud.resp
 * Description:
 *
 * @Author HL
 * @Create 10/1/2024 5:52 PM
 * @Version:
 */
@Getter
public enum ReturnCodeEnum {
    RC999("999","opertaion xxx failed"),
    RC200("200","success"),
    RC403("403","no privilege"),
    RC404("404","not found"),
    RC500("505","server error"),
    RC375("375","arithematic error"),
    INVALID_TOKEN("2001","invalid token"),
    ACCESS_DENIED("2003","no privilege for this resource"),
    CLIENT_AUTHENTICATION_FAILED("1001","client validation fail"),
    USERNAME_OR_PASSWORD_ERROR("1002","username or password error"),
    BUSINESS_ERROR("1004","business logic error"),
    UNSUPPORTED_GRANT_TYPE("1003","unsupported validation type");

    private final String code;
    private final String mesasge;


    ReturnCodeEnum(String code, String mesasge) {
        this.code = code;
        this.mesasge = mesasge;
    }

    public static ReturnCodeEnum getReturnCodeEnum(String code){
        for(ReturnCodeEnum returnCodeEnum : ReturnCodeEnum.values()){
            if(returnCodeEnum.getCode().equalsIgnoreCase(code)){
                return returnCodeEnum;
            }
        }
        return null;
    }
    /*
    public static ReturnCodeEnum getReturnCodeEnum(String code){
        return Arrays.stream(ReturnCodeEnum.values()).filter(x->x.getCode().equalsIgnoreCase(code)).findFirst().orElse(null);
    }
    */
}
