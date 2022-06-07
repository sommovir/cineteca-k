/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.dbX2;

import it.lule.cineteca.logic.entities.FilmDirectorEntity;
import it.lule.cineteca.logic.entities.UserEntity;

/**
 *
 * @author lele
 */
public class Main001 {

//    private static FilmDirectorEntity filmDirector;
//    private static MovieEntity movie;

    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUser("lele");
        userEntity.getPassword();
        createUser(userEntity);

        FilmDirectorEntity filmDirectorEntity = new FilmDirectorEntity();
        filmDirectorEntity.setName("Lele");
        filmDirectorEntity.setSurname("Raru");
        filmDirector(filmDirectorEntity);

    }

    public static void filmDirector(FilmDirectorEntity directorEntity) {
//        DbManager.getInstance().filmDirector().create(directorEntity);
        DbManager dbManager = new DbManager();
        dbManager.filmDirector().create(directorEntity);
    }

    public static void createUser(UserEntity userEntity) {
//        DbManager.getInstance().user().create(userEntity);
        DbManager dbManager = new DbManager();
        dbManager.user().create(userEntity);
    }
}
