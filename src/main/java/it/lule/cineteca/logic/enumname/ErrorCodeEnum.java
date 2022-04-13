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
    DB_USER_NOT_EXISTS(1,"DB_USER_NOT_EXISTS"),
    DB_USER_ALREADY_EXISTS(2,"DB_USER_ALREADY_EXISTS"),
    DB_USER_ALREADY_CONNECTED(3,"DB_USER_ALREADY_CONNECTED"),
    DB_WRONG_PASSWORD(4,"DB_WRONG_PASSWORD"),
    
    PASSWORD_DOES_NOT_MATCH(5,"PASSWORD_DOES_NOT_MATCH"),
    PASSWORD_IS_EMPTY(6,"PASSWORD_IS_EMPTY"),
    PASSWORD_TOO_SHORT(7,"PASSWORD_IS_TOO_SHORT"),
    PASSWORD_TOO_LONG(8,"PASSWORD_IS_TOO_LONG"),
    PASSWORD_HAS_NOT_EQUAL(9,"PASSWORD_HAS_NOT_EQUAL"),
    PASSWORD_HAS_NOT_UPPER_CASE(10,"PASSWORD_HAS_NOT_UPPER_CASE"),
    
    USER_EMPTY(11,"USER_IS_EMPTY");

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
