/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.abstractControllerException;

import it.lule.cineteca.logic.enumname.ErrorCodeEnum;

/**
 *
 * @author lele
 */
public class AbstractControllerException extends Exception {
    protected ErrorCodeEnum errorCode;
    protected String message;

    public AbstractControllerException() {
    }

    public AbstractControllerException(String message) {
        this.message = message;
    }
    
    public AbstractControllerException(ErrorCodeEnum errorCode) {
        this.errorCode = errorCode;
    }
    
    public ErrorCodeEnum getErrorCode() {
        return errorCode;
    }
    
}
