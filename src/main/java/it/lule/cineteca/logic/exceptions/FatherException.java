/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions;

import it.lule.cineteca.logic.enumname.ErrorCodeEnum;

/**
 *
 * @author lele
 */
public class FatherException extends Exception {
    protected ErrorCodeEnum errorCode;

    public FatherException(ErrorCodeEnum errorCode) {
        this.errorCode = errorCode;
    }
    
    public ErrorCodeEnum getErrorCode() {
        return errorCode;
    }
    
}
