/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.dbException;

import it.lule.cineteca.logic.enums.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;

/**
 *
 * @author Luca
 */
public class DBGenericException extends DBAbstractControllerException {

    public DBGenericException() {
        super(ErrorCodeEnum.DB_GENERIC_ERROR);
    }
    
}
