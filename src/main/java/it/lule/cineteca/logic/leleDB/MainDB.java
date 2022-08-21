/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.leleDB;

import it.lule.cineteca.logic.entities.CUserEntity;
import it.lule.cineteca.logic.entities.FilmDirectorEntity;
import it.lule.cineteca.logic.entities.MovieEntity;
import it.lule.cineteca.logic.exceptions.abstractController.CreateException;
import it.lule.cineteca.logic.exceptions.abstractController.FindException;
import it.lule.cineteca.logic.leleDB.controller.CUserController;
import it.lule.cineteca.logic.leleDB.controller.FilmDirectorController;
import it.lule.cineteca.logic.leleDB.controller.MovieController;
import it.lule.cineteca.logic.exceptions.abstractController.IsNullException;

/**
 *
 * @author lele
 */
public class MainDB {
    private static String value = "lele";
    public static void main(String[] args) throws IsNullException, CreateException, FindException {
//        create();
        read();
//        directorEntity()
//        movieEntity();
    }

    public static void create() throws IsNullException, CreateException {
        CUserEntity userEntity = new CUserEntity();
        userEntity.setPassword("password");
        userEntity.setUser(value);
        
        CUserController.getInstance().create(userEntity);
    }

    public static void read() throws IsNullException, FindException {
        CUserEntity userEntity = new CUserEntity();
        
        userEntity = CUserController.getInstance().getFind(value);

        System.out.println("User: " + userEntity.getUser()
                + "\nPassword: " + userEntity.getPassword());
    }



}
