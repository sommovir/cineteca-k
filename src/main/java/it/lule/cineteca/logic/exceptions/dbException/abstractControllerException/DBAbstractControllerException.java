/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.dbException.abstractControllerException;

import it.lule.cineteca.logic.enums.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.dbException.CinetecaException;

/**
 *
 * @author lele
 */
public class DBAbstractControllerException extends CinetecaException {

    public DBAbstractControllerException(ErrorCodeEnum errorCode) {
        super(errorCode);
    }
    
}
