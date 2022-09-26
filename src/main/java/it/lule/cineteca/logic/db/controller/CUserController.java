/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.db.entities.CUserEntity;
import it.lule.cineteca.logic.exceptions.abstractControllerException.CreateException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.DeleteException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.FindException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.IsNullException;
import java.util.List;

/**
 *
 * @author lele
 */
public class CUserController extends AbstractController<CUserEntity> {
    private static CUserController instance = null;

    public static CUserController getInstance(){
        if ( instance == null ){
            instance = new CUserController();
        }
        return instance;
    }    
    
    protected CUserController() {
        super(CUserEntity.class);
    }

    public void deleteUser(CUserEntity userEntity) throws IsNullException, DeleteException{
        deleteEntity(userEntity);
    }
    
    public void editUser(CUserEntity userEntity) throws IsNullException, CreateException{
        createEntity(userEntity);
    }
    
    public CUserEntity getUserName(String user) throws IsNullException, FindException {
        return (CUserEntity) getEntityByQuery(Search.userByUserName(user));    
    }
    
    public CUserEntity getUserID(CUserEntity userEntity) throws IsNullException, FindException {
        return getById(userEntity);
//        throw new UnsupportedOperationException();
    }
    
    public List<CUserEntity> getAllUser(){
        return getAllEntites(Search.userAllUsers());
    }    
    
}
