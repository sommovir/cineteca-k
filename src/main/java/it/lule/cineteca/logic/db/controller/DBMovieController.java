/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.db.entities.MovieEntity;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;
import java.util.List;



/**
 *
 * @author lele
 */
public class DBMovieController extends DBAbstractController<MovieEntity>{
    private static DBMovieController instance = null;
    
    public static DBMovieController getInstance(){
        if (instance == null){
            instance = new DBMovieController();
        }
        return instance;
    }        

    private DBMovieController() {
        super(MovieEntity.class);
    }
    
    public void createMovie(MovieEntity movieEntity) throws DBAbstractControllerException {
        createEntity(movieEntity);
    }       
    
    public void deleteMovie(MovieEntity movieEntity) throws DBAbstractControllerException{
        deleteEntity(movieEntity);
    }
    
    public void editMovie(MovieEntity userEntity) throws DBAbstractControllerException{
        createEntity(userEntity);
    }
    
    public MovieEntity getMovieByoriginalTitle(String movie) throws DBAbstractControllerException{
        return (MovieEntity) getEntityByQuery(Search.movieByoriginalTitle(movie));    
    }
    
    public MovieEntity getMovieID(MovieEntity movieEntity) throws DBAbstractControllerException {
        return getById(movieEntity);

    }
    
    public List<MovieEntity> getAllMovie(){
        return getAllEntites(Search.movieAllMovies());
    } 
       
    public List<MovieEntity> getFavorites(String favorite) {
        return getAllEntites(Search.movieByFavorite(favorite));
    }

    /**
     * @deprecated 
     * @param favorites 
     */
    public void setFavorites(List<MovieEntity> favorites) {
        throw new UnsupportedOperationException();
    }
        
}
