/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.fakeDB;

import it.lule.cineteca.logic.db.controller.DBFilmDirectorController;
import it.lule.cineteca.logic.db.controller.DBMovieController;
import it.lule.cineteca.logic.db.entities.FilmDirectorEntity;
import it.lule.cineteca.logic.db.entities.MovieEntity;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lele
 */
public class FakeFilm {

    public FakeFilm() {
        write();
//        read();
    }

    private void read() {
        List<MovieEntity> movies = DBMovieController.getInstance().getAllMovie();

        for (MovieEntity movy : movies) {
            System.out.println(""+movy.getOriginalTitle());
        }
//        for (MovieEntity movie : movies) {
//            System.out.println(""+ movie.getOriginalTitle());
//        }
    }

    private void write() {
        writeOnDb("film1", "regista1", true);
        writeOnDb("film2", "regista2", true);
        writeOnDb("film3", "regista3", false);
        writeOnDb("film4", "regista4", false);
    }

    private void writeOnDb(String originalTitle, String nameDirector, boolean favorite) {
        try {
            MovieEntity movieEntity = new MovieEntity();
            movieEntity.setOriginalTitle(originalTitle);
            movieEntity.setFavorite(favorite);

            FilmDirectorEntity directorEntity = new FilmDirectorEntity();
            directorEntity.setName(nameDirector);
            movieEntity.setFilmDirectorEntity(directorEntity);

            DBFilmDirectorController.getInstance().createFilmDirector(directorEntity);
            DBMovieController.getInstance().createMovie(movieEntity);
        } catch (DBAbstractControllerException ex) {
            Logger.getLogger(FakeFilm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
