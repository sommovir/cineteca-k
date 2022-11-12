/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.db.entities.FilmDirectorEntity;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBFilmdirectorController.DBFilmDirector_CreateException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBFilmdirectorController.DBFilmDirector_DeleteException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBFilmdirectorController.DBFilmDirector_EditException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBFilmdirectorController.DBFilmDirector_GetAllException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBFilmdirectorController.DBFilmDirector_GetByIdException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBFilmdirectorController.DBFilmDirector_GetByNameException;
import java.util.List;

/**
 * @deprecated @author lele
 */
public class DBFilmDirectorController extends DBAbstractController<FilmDirectorEntity> {

    private static DBFilmDirectorController instance = null;

    public static DBFilmDirectorController getInstance() {
        if (instance == null) {
            instance = new DBFilmDirectorController();
        }
        return instance;
    }

    private DBFilmDirectorController() {
        super(FilmDirectorEntity.class);
    }

    public void createFilmDirector(FilmDirectorEntity filmDirectorEntity) throws DBAbstractControllerException {
        try {
            createEntity(filmDirectorEntity);
        } catch (DBAbstractControllerException ex) {
            throw new DBFilmDirector_CreateException();
        }
    }

    public void deleteFilmDirector(FilmDirectorEntity filmDirectorEntity) throws DBAbstractControllerException {
        try {
            deleteEntity(filmDirectorEntity);
        } catch (DBAbstractControllerException ex) {
            throw new DBFilmDirector_DeleteException();
        }
    }

    public void editFilmDirector(FilmDirectorEntity filmDirectorEntity) throws DBAbstractControllerException {
        try {
            editEntity(filmDirectorEntity);
        } catch (DBAbstractControllerException ex) {
            throw new DBFilmDirector_EditException();
        }
    }

    public FilmDirectorEntity getFilmDirectorByName(String filmDirectorName) throws DBAbstractControllerException {
        try {
            return (FilmDirectorEntity) getEntityByQuery(Search.filmDirectorByName(filmDirectorName));
        } catch (DBAbstractControllerException ex) {
            throw new DBFilmDirector_GetByNameException();
        }

    }

    public FilmDirectorEntity getFilmDirectorByID(FilmDirectorEntity filmDirectorEntity) throws DBAbstractControllerException {
        try {
            return (FilmDirectorEntity) getEntityByQuery(Search.userByID(filmDirectorEntity.getId().toString()));
        } catch (DBAbstractControllerException e) {
            throw new DBFilmDirector_GetByIdException();
        }
    }

    /**
     * @return
     * @throws DBAbstractControllerException 
     */
    public List<FilmDirectorEntity> getfilmDirectorEntity() throws DBAbstractControllerException {
        try {
         return getAllEntites(Search.filmDirectorAllFilmDirectors());
        } catch (DBAbstractControllerException e) {
            throw new DBFilmDirector_GetAllException();
        }
    }
}
