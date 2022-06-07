/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.dbX;

import it.lule.cineteca.logic.entities.FilmDirectorEntity;
import it.lule.cineteca.logic.entities.MovieEntity;
import it.lule.cineteca.logic.entities.UserEntity;
import it.lule.cineteca.logic.exceptions.DBBadParamaterException;
import it.lule.cineteca.logic.exceptions.DBUniqueViolationException;

/**
 *
 * @author lele
 */
public class Main002 {

    public static void main(String[] args) throws DBUniqueViolationException, DBBadParamaterException {
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setMainActor("Lele");

        FilmDirectorEntity filmDirectorEntity = new FilmDirectorEntity();
        filmDirectorEntity.setName("Lele");
        filmDirectorEntity.setSurname("Raru");

        it.lule.cineteca.logic.db.DbManager.getInstance().createFilmDirector(filmDirectorEntity);
//        it.lule.cineteca.logic.db.DbManager.getInstance().createMovie(movieEntity);
    }
}
