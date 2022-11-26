/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.db.entities.MovieEntity;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBFilmdirectorController.DBFilmDirector_GetAllException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBMovieController.DBMovie_CreateException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBMovieController.DBMovie_DeleteException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBMovieController.DBMovie_EditException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBMovieController.DBMovie_GetAllException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBMovieController.DBMovie_GetByIdException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBMovieController.DBMovie_GetByNameException;
import java.util.List;

/**
 * @author lele
 */
public class DBMovieController extends DBAbstractController<MovieEntity> {

    private static DBMovieController instance = null;

    public static DBMovieController getInstance() {
        if (instance == null) {
            instance = new DBMovieController();
        }
        return instance;
    }

    private DBMovieController() {
        super(MovieEntity.class);
    }

    public void createMovie(MovieEntity movieEntity) throws DBAbstractControllerException {
        try {
            createEntity(movieEntity);
        } catch (DBAbstractControllerException ex) {
            throw new DBMovie_CreateException();
        }

    }

    public void deleteMovie(MovieEntity movieEntity) throws DBAbstractControllerException {
        try {
            deleteEntity(movieEntity);
        } catch (DBAbstractControllerException ex) {
            throw new DBMovie_DeleteException();
        }

    }

    public void editMovie(MovieEntity userEntity) throws DBAbstractControllerException {
        try {
            editEntity(userEntity);
        } catch (DBAbstractControllerException ex) {
            throw new DBMovie_EditException();
        }

    }

    public MovieEntity getMovieByoriginalTitle(String movie) throws DBAbstractControllerException {
        try {
            return (MovieEntity) getEntityByQuery(Search.movieByoriginalTitle(movie));
        } catch (DBAbstractControllerException ex) {
            throw new DBMovie_GetByNameException();
        }
    }

    public MovieEntity getMovieID(MovieEntity movieEntity) throws DBAbstractControllerException {
        try {
            return getEntityById(movieEntity);
        } catch (DBAbstractControllerException e) {
            throw new DBMovie_GetByIdException();
        }
    }

    public List<MovieEntity> getAllMovie() throws DBAbstractControllerException {
        try {
            return getAllEntites(Search.movieAllMovies());
        } catch (DBAbstractControllerException e) {
            throw new DBMovie_GetAllException();
        }
    }

    public List<MovieEntity> getFavorites() throws DBAbstractControllerException {
        try {
            return getAllEntites(Search.movieByFavorite());
        } catch (DBAbstractControllerException e) {
            throw new DBFilmDirector_GetAllException();
        }
    }
}
