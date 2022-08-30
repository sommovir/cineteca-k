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
public class IsNullException extends AbstractControllerException{    

    public IsNullException() {
    }

    public IsNullException(String message) {
        super(message);
    }

    public IsNullException(ErrorCodeEnum errorCode) {
        super(errorCode);
    }
    
}
