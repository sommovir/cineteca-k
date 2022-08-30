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
public class CreateException extends AbstractControllerException{   

    public CreateException() {
    }

    public CreateException(String message) {
        super(message);
    }

    public CreateException(ErrorCodeEnum errorCode) {
        super(errorCode);
    }
  
}
