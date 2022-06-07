/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.enumname;

/**
 *
 * @author lele
 */
public enum ErrorCodeEnum {
    DB_USER_NOT_EXISTS(1,"User not exists"),
    DB_USER_ALREADY_EXISTS(2,"User already exists"),
    DB_USER_ALREADY_CONNECTED(3,"User already connected"),
//    DB_WRONG_PASSWORD(4,"DB_WRONG_PASSWORD"),
    
    PASSWORD_ARE_NOT_EQUALS(5,"Password are not equals"),
    PASSWORD_IS_EMPTY(6,"Password is empty"),
    PASSWORD_TOO_SHORT(7,"Password is too short"),
    PASSWORD_TOO_LONG(8,"Password is too long"),
    PASSWORD_IS_NOT_EQUAL(9,"Password has not equal"),
    PASSWORD_HAS_NOT_UPPER_CASE(10,"Password has not upper case"),
    
    USER_EMPTY(11,"user is empty");

    private int code;
    private String message;
    
    private ErrorCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    
}
