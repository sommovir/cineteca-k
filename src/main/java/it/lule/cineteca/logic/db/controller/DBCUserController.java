/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.db.entities.CUserEntity;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBCreateException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBDeleteException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBFindException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBIsNullException;
import java.util.List;

/**
 *
 * @author lele
 */
public class DBCUserController extends DBAbstractController<CUserEntity> {
    private static DBCUserController instance = null;

    public static DBCUserController getInstance(){
        if ( instance == null ){
            instance = new DBCUserController();
        }
        return instance;
    }    
    
    protected DBCUserController() {
        super(CUserEntity.class);
    }

    public void deleteUser(CUserEntity userEntity) throws DBIsNullException, DBDeleteException{
        deleteEntity(userEntity);
    }
    
    public void editUser(CUserEntity userEntity) throws DBIsNullException, DBCreateException{
        createEntity(userEntity);
    }
    
    public CUserEntity getUserName(String user) throws DBIsNullException, DBFindException {
        return (CUserEntity) getEntityByQuery(Search.userByUserName(user));    
    }
    
    public CUserEntity getUserID(CUserEntity userEntity) throws DBIsNullException, DBFindException {
        return getById(userEntity);
//        throw new UnsupportedOperationException();
    }
    
    public List<CUserEntity> getAllUser(){
        return getAllEntites(Search.userAllUsers());
    }    
    
}
