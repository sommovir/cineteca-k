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
    private static UserEntity userEntity;
    private static FilmDirectorEntity filmDirector;
    private static MovieEntity movie;
    
    public static void main(String[] args) {
        DbManager dbManager = new DbManager();
        dbManager.filmDirector().create(filmDirector);
        dbManager.filmDirector().edit(filmDirector);
        dbManager.filmDirector().delete(filmDirector);
                
        dbManager.movie().create(movie);
        dbManager.movie().edit(movie);
        dbManager.movie().delete(movie);
                
        dbManager.user().create(userEntity);
        dbManager.user().edit(userEntity);
        dbManager.user().delete(userEntity);

    }
}
