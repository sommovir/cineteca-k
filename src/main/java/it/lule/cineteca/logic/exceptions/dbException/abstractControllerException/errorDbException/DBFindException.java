/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDbException;

import it.lule.cineteca.logic.enums.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;

/**
 * Troppo generico, valuto di eliminarli
 * @deprecated 
 * @author lele
 */
public class DBFindException extends DBAbstractControllerException {

    public DBFindException() {
        super(ErrorCodeEnum.DB_USER_GET_All);
    }
}
