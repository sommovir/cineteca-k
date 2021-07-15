/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.prova.logic.enumname;

/**
 *
 * @author lele
 */
public enum ErrorCodeEnum {
    DB_USER_NOT_EXISTS(1),
    DB_USER_ALREADY_EXISTS(2),
    DB_USER_ALREADY_CONNECTED(3),
    DB_WRONG_PASSWORD(4),
    
    PASSWORD_DO_NOT_MATCH(5),
    PASSWORD_IS_EMPTY(6),
    PASSWORD_IS_LENGTH(7),
    PASSWORD_IS_EQUAL(8),
    PASSWORD_IS_UPPER_CASE(9);

    private int code;

    private ErrorCodeEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
