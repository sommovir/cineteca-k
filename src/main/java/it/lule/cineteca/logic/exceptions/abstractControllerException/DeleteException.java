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
public class DeleteException extends AbstractControllerException{

    public DeleteException() {
    }

    public DeleteException(String message) {
        super(message);
    }

    public DeleteException(ErrorCodeEnum errorCode) {
        super(errorCode);
    }
    
}
