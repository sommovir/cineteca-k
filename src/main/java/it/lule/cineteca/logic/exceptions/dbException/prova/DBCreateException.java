/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.dbException.prova;

import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.*;
import it.lule.cineteca.logic.enumname.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.dbException.prova.GrandfatherException;

/**
 *
 * @author lele
 */
public class DBCreateException extends DBAbstractControllerException{   
    public DBCreateException() {
        super(ErrorCodeEnum.DB_CREATE);
    }   
}
