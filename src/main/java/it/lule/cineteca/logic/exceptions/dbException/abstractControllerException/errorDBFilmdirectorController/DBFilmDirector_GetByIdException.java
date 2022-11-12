/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBFilmdirectorController;

import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBUserController.*;
import it.lule.cineteca.logic.enums.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;

/**
 * @author lele
 */
public class DBFilmDirector_GetByIdException extends DBAbstractControllerException {

    public DBFilmDirector_GetByIdException() {
        super(ErrorCodeEnum.DB_FILM_DIRECTOR_GET_BY_ID);
    }
}
