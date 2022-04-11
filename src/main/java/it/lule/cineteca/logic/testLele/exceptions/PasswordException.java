/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.testLele.exceptions;

import it.lule.cineteca.logic.enumname.ErrorCodeEnum;

/**
 *
 * @author sommovir
 */
public class PasswordException extends Exception {

    private ErrorCodeEnum errorCode;

    public PasswordException(ErrorCodeEnum errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCodeEnum getErrorCode() {
        return errorCode;
    }

}
