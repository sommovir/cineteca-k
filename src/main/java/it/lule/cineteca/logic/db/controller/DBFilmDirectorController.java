/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.db.entities.FilmDirectorEntity;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;
import java.util.List;

/**
 * @deprecated 
 * @author lele
 */
public class DBFilmDirectorController extends DBAbstractController<FilmDirectorEntity>{
    private static DBFilmDirectorController instance = null;
    
    public static DBFilmDirectorController getInstance(){
        if (instance == null){
            instance = new DBFilmDirectorController();
        }
        return instance;
    }    

    private DBFilmDirectorController() {
        super(FilmDirectorEntity.class);
    }

    public void createFilmDirector(FilmDirectorEntity filmDirectorEntity) throws DBAbstractControllerException {
        createEntity(filmDirectorEntity);
    }    
    
    public void deleteFilmDirector(FilmDirectorEntity filmDirectorEntity) throws DBAbstractControllerException{
        deleteEntity(filmDirectorEntity);
    }
    
    public void editFilmDirector(FilmDirectorEntity filmDirectorEntity) throws DBAbstractControllerException{
        editEntity(filmDirectorEntity);
    }
    
    public FilmDirectorEntity getFilmDirectorByName(String filmDirectorName) throws DBAbstractControllerException{
        return (FilmDirectorEntity) getEntityByQuery(Search.filmDirectorByName(filmDirectorName));    
    }
    
    public FilmDirectorEntity getUserID(FilmDirectorEntity movieEntity) throws DBAbstractControllerException {
          return getById(movieEntity);
//        throw new UnsupportedOperationException();
    }
    
    public List<FilmDirectorEntity> getfilmDirectorEntity(){
//        return getAllEntites(Search.filmDirectorAllFilmDirectors());
        throw new UnsupportedOperationException();
    }  
}
