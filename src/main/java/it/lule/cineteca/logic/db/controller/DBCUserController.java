/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.db.entities.CUserEntity;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBUserController.DBUser_CreateException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBUserController.DBUser_DeleteException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBUserController.DBUser_EditException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBUserController.DBUser_GetAllException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBUserController.DBUser_GetByIdException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDBUserController.DBUser_GetByNameException;
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
        try {
            createEntity(userEntity);
        } catch (DBAbstractControllerException ex) {
            throw new DBUser_CreateException();
        }

    }

    public void deleteUser(CUserEntity userEntity) throws DBAbstractControllerException {
        try {
            deleteEntity(userEntity);
        } catch (DBAbstractControllerException ex) {
            throw new DBUser_DeleteException();
        }
    }

    public void editUser(CUserEntity userEntity) throws DBAbstractControllerException {
        try {
            editEntity(userEntity);
        } catch (DBAbstractControllerException e) {
            throw new DBUser_EditException();
        }
    }

    public CUserEntity getUserByName(CUserEntity userEntity) throws DBAbstractControllerException {
        try {
            return (CUserEntity) getEntityByQuery(Search.userByName(userEntity.getUser()));
        } catch (DBAbstractControllerException e) {
            throw new DBUser_GetByNameException();
        }
    }

    public CUserEntity getUserByID(CUserEntity userEntity) throws DBAbstractControllerException {
        try {
            return (CUserEntity) getEntityByQuery(Search.userByID(userEntity.getId().toString()));
        } catch (DBAbstractControllerException e) {
            throw new DBUser_GetByIdException();
        }
    }

    /**
     * @return
     * @throws DBAbstractControllerException 
     */
    public List<CUserEntity> getAllUser() throws DBAbstractControllerException {
        try {
            return getAllEntites(Search.userAllUsers());
        } catch (DBAbstractControllerException e) {
            throw new DBUser_GetAllException();
        }
    }

}
