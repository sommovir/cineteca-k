/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.dbException.prova;

import it.lule.cineteca.logic.enumname.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.dbException.prova.GrandfatherException;

/**
 *
 * @author lele
 */
public class DBAbstractControllerException extends GrandfatherException{

    public DBAbstractControllerException(ErrorCodeEnum errorCode) {
        super(errorCode);
    }
    
}
