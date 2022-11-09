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
            System.out.println("" + movy.getOriginalTitle());
        }
//        for (MovieEntity movie : movies) {
//            System.out.println(""+ movie.getOriginalTitle());
//        }
    }

    private void write() {
        boolean flag = false;

        for (int i = 0; i < 20; i++) {
            if (i <= 10) {
                flag = true;
            }
            writeOnDb("film"+i, "regista"+i, flag);
            flag = false;
        }
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
