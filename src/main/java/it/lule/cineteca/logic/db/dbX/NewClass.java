/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.dbX;

import it.lule.cineteca.logic.entities.FilmDirectorEntity;
import it.lule.cineteca.logic.entities.MovieEntity;
import it.lule.cineteca.logic.entities.UserEntity;

/**
 *
 * @author lele
 */
public class NewClass {

    public NewClass() {
        UserEntity userEntity = new UserEntity();
        FilmDirectorEntity director = new FilmDirectorEntity();
        MovieEntity movieEntity = new MovieEntity();
        
        DbManager dbManager = new DbManager();
        dbManager.user().createUser(userEntity);
        dbManager.user().deleteUser(userEntity);
        dbManager.user().editUser(userEntity);

        dbManager.filmDirector().createFilmDirector(director);

        dbManager.movie().deleteMovie(movieEntity);
    }

}
