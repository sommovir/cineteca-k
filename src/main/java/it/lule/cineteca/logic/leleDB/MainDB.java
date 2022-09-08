/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.leleDB;

import it.lule.cineteca.logic.entities.CUserEntity;
import it.lule.cineteca.logic.exceptions.abstractControllerException.CreateException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.FindException;
import it.lule.cineteca.logic.leleDB.controller.CUserController;
import it.lule.cineteca.logic.exceptions.abstractControllerException.IsNullException;

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
//        Search.byUserName(value);
//        String userName = QueryEnum.BY_USER_NAME.byUserName(value);
//        System.out.println("QueryEnum "+userName);
    }

    public static void create() throws IsNullException, CreateException {
        CUserEntity userEntity = new CUserEntity();
        userEntity.setPassword("password");
        userEntity.setUser(value);
        
        CUserController.getInstance().createEntity(userEntity);
    }

    public static void read() throws IsNullException, FindException {
        CUserEntity userEntity = new CUserEntity();
        
        userEntity = CUserController.getInstance().getUserName(value);

        System.out.println("User: " + userEntity.getUser()
                + "\nPassword: " + userEntity.getPassword());
    }



}
