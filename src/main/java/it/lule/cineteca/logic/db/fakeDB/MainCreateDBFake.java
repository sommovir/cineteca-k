/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.fakeDB;

import it.lule.cineteca.logic.db.controller.DBCUserController;
import it.lule.cineteca.logic.db.entities.CUserEntity;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lele
 */
public class MainCreateDBFake {

    public static void main(String[] args) {
        try {
            //        FakeFilm fakeFilm = new FakeFilm();
            CUserEntity userEntity = new CUserEntity("a", "b");
            DBCUserController.getInstance().createUser(userEntity);
//            CUserEntity userByName = DBCUserController.getInstance().getUserByName("a");
        } catch (DBAbstractControllerException ex) {
            Logger.getLogger(MainCreateDBFake.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
