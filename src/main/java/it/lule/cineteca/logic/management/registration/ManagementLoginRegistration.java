/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.management.registration;

import it.lule.cineteca.logic.db.controller.DBCUserController;
import it.lule.cineteca.logic.db.entities.CUserEntity;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;
import it.lule.cineteca.logic.exceptions.password.PasswordException;
import it.lule.cineteca.logic.management.password.ManagementPassword;

/**
 * @author lele
 */
public class ManagementLoginRegistration {

    private static ManagementLoginRegistration instance = null;

    public static ManagementLoginRegistration getInstance() {
        if (instance == null) {
            instance = new ManagementLoginRegistration();
        }
        return instance;
    }

    /**
     * Register User
     *
     * @param password
     * @param passwordConfrim
     * @param user
     * @throws DBAbstractControllerException
     * @throws PasswordException
     */
    public void registrationAccount(String user, char[] password, char[] passwordConfrim) 
            throws DBAbstractControllerException, PasswordException {

        ManagementPassword.getInstance().RulePasswordRegistration(user, password, passwordConfrim);

        CUserEntity userEntity = new CUserEntity(user, new String(password));

        boolean alreadyExits_DBG = DBCUserController.getInstance().isAlreadyExits_DBG(userEntity.getUser());
        System.out.println(""+ alreadyExits_DBG);
        DBCUserController.getInstance().createUser(userEntity);
    }

    /**
     * Delete Account
     *
     * @param user
     * @throws it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException
     */
    public void deleteAccount(String user) throws DBAbstractControllerException {
        CUserEntity userEntity = new CUserEntity();
        userEntity.setUser(user);

        DBCUserController.getInstance().deleteUser(userEntity);
    }

    /**
     * login
     *
     * @param user
     * @param password
     * @throws DBAbstractControllerException
     * @throws PasswordException
     */
    public void login(String user, char[] password) throws DBAbstractControllerException, PasswordException  {
        ManagementPassword.getInstance().RulePasswordLogin(user, password);

        CUserEntity userEntity = new CUserEntity(user, new String(password));

        DBCUserController.getInstance().getUserByName(userEntity);
    }
}
