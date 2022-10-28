/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.db.entities.CUserEntity;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;
import java.util.List;

/**
 *
 * @author lele
 */
public class DBCUserController extends DBAbstractController<CUserEntity> {

    private static DBCUserController instance = null;

    public static DBCUserController getInstance() {
        if (instance == null) {
            instance = new DBCUserController();
        }
        return instance;
    }

    protected DBCUserController() {
        super(CUserEntity.class);
    }

    public void createUser(CUserEntity userEntity) throws DBAbstractControllerException {
        createEntity(userEntity);
    }

    public void deleteUser(CUserEntity userEntity) throws DBAbstractControllerException {
        deleteEntity(userEntity);
    }

    public void editUser(CUserEntity userEntity) throws DBAbstractControllerException {
        editEntity(userEntity);
    }

    public CUserEntity getUserByName(String user) throws DBAbstractControllerException {
        return (CUserEntity) getEntityByQuery(Search.userByName(user));
    }

    public CUserEntity getUserID(CUserEntity userEntity) throws DBAbstractControllerException {
        return getById(userEntity);
//        throw new UnsupportedOperationException();
    }

    public List<CUserEntity> getAllUser() {
        return getAllEntites(Search.userAllUsers());
    }

}
