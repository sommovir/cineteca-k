/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBUserController;

import it.lule.cineteca.logic.enums.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;

/**
 * @author lele
 */
public class DBUser_CreateException extends DBAbstractControllerException {

    public DBUser_CreateException() {
        super(ErrorCodeEnum.DB_USER_CREATE);
    }
}
