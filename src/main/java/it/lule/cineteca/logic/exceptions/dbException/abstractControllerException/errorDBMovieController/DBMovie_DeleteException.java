/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBMovieController;

import it.lule.cineteca.logic.enums.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;

/**
 * @author lele
 */
public class DBMovie_DeleteException extends DBAbstractControllerException {

    public DBMovie_DeleteException() {
        super(ErrorCodeEnum.DB_MOVIE_DELETE);
    }
}
