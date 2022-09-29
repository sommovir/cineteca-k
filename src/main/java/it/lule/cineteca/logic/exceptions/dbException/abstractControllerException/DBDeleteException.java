/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.dbException.abstractControllerException;

import it.lule.cineteca.logic.enums.ErrorCodeEnum;

/**
 *
 * @author lele
 */
public class DBDeleteException extends DBAbstractControllerException {

    public DBDeleteException() {
        super(ErrorCodeEnum.DB_DELETE);
    }
}
