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
    
    PASSWORD_DO_NOT_MATCH(5,"PASSWORD_DO_NOT_MATCH"),
    PASSWORD_IS_EMPTY(6,"PASSWORD_IS_EMPTY"),
    PASSWORD_IS_LENGTH(7,"PASSWORD_IS_LENGTH"),
    PASSWORD_IS_EQUAL(8,"PASSWORD_IS_EQUAL"),
    PASSWORD_IS_UPPER_CASE(9,"PASSWORD_IS_UPPER_CASE");

    private int code;
    private String message;
    
    private ErrorCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }
}
