/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.fakeDB;

import it.lule.cineteca.logic.db.controller.DBFilmDirectorController;
import it.lule.cineteca.logic.db.controller.DBMovieController;
import it.lule.cineteca.logic.db.entities.FilmDirectorEntity;
import it.lule.cineteca.logic.db.entities.MovieEntity;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDbException.DBCreateException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDbException.DBIsNullException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lele
 */
public class FakeFilm {

    public FakeFilm() {
        initFilm("film1", "regista1", true);
        initFilm("film2", "regista2", true);
        initFilm("film3", "regista3", false);
        initFilm("film4", "regista4", false);
    }
 
    public void initFilm(String originalTitle, String nameDirector, boolean favorite){
        try {
            MovieEntity movieEntity = new MovieEntity();
            movieEntity.setOriginalTitle(originalTitle);
            movieEntity.setFavorite(favorite);
            
            FilmDirectorEntity directorEntity = new FilmDirectorEntity();
            directorEntity.setName(nameDirector);
            
            DBFilmDirectorController.getInstance().createEntity(directorEntity);
            DBMovieController.getInstance().createEntity(movieEntity);
        } catch (DBIsNullException ex) {
            Logger.getLogger(FakeFilm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DBCreateException ex) {
            Logger.getLogger(FakeFilm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
}
