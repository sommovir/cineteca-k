/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db;

import it.lule.cineteca.logic.db.entities.CUserEntity;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBCreateException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBFindException;
import it.lule.cineteca.logic.db.controller.DBCUserController;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBIsNullException;

/**
 *
 * @author lele
 */
public class MainDB {

    private static String value = "lele";

    public static void main(String[] args) throws DBIsNullException, DBCreateException, DBFindException {
        create();
//        read();
//        directorEntity()
//        movieEntity();
//        Search.byUserName(value);
//        String userName = QueryEnum.BY_USER_NAME.byUserName(value);
//        System.out.println("QueryEnum "+userName);
    }

    public static void create() throws DBIsNullException, DBCreateException {
//        CUserEntity userEntity = new CUserEntity();
//        userEntity.setPassword("password");
//        userEntity.setUser(value);
//        DBCUserController.getInstance().createEntity(userEntity);

        CUserEntity userEntity = null;
        DBCUserController.getInstance().createEntity(userEntity);
    }

    public static void read() throws DBIsNullException, DBFindException {
        CUserEntity userEntity = new CUserEntity();

        userEntity = DBCUserController.getInstance().getUserName(value);

        System.out.println("User: " + userEntity.getUser()
                + "\nPassword: " + userEntity.getPassword());
    }

}
