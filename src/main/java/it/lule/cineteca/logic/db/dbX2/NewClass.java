/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.dbX2;

import it.lule.cineteca.logic.entities.FilmDirectorEntity;
import it.lule.cineteca.logic.entities.MovieEntity;
import it.lule.cineteca.logic.entities.UserEntity;

/**
 *
 * @author lele
 */
public class NewClass {
    private static FilmDirectorEntity filmDirector;
    private static MovieEntity movie;
    
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUser("lele");
        userEntity.getPassword();
        createUser(userEntity);
        

//        DbManager dbManager = new DbManager();
        
//        dbManager.filmDirector().create(filmDirector);
//        dbManager.filmDirector().edit(filmDirector);
//        dbManager.filmDirector().delete(filmDirector);
//                
//        dbManager.movie().create(movie);
//        dbManager.movie().edit(movie);
//        dbManager.movie().delete(movie);
//                
//        dbManager.user().create(userEntity);
//        dbManager.user().edit(userEntity);
//        dbManager.user().delete(userEntity);

    }
    
    public static void createUser(UserEntity userEntity){
        DbManager dbManager = new DbManager();
        dbManager.user().create(userEntity);
    }
}
