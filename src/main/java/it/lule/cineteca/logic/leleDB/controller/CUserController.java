/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.leleDB.controller;

import it.lule.cineteca.logic.entities.CUserEntity;
import it.lule.cineteca.logic.exceptions.abstractControllerException.CreateException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.DeleteException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.FindException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.IsNullException;
import it.lule.cineteca.logic.leleDB.logicDb.AbstractController;
import it.lule.cineteca.logic.enumname.QueryEnum;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.query.Query;

/**
 *
 * @author lele
 */
public class CUserController extends AbstractController {
    private static CUserController instance = null;
    
    public static CUserController getInstance(){
        if (instance == null){
            instance = new CUserController();
        }
        return instance;
    }
 
    /* Controlalre */
    public CUserEntity getUserName(String user) throws IsNullException, FindException{
        return (CUserEntity) getByQuery(Search.userByUserName(user), new CUserEntity() );
 
//        return (CUserEntity) getByQueryX02
//        (Search.byUserName(user), new CUserEntity() );
    }
    
    public CUserEntity getUserID() throws IsNullException, FindException{
        throw new UnsupportedOperationException();
    }
    
    
    
    public CUserEntity getByQueryX(String value) throws IsNullException, FindException{
        return (CUserEntity) getByQuery(QueryEnum.BY_USER_NAME.byUserName(value), new CUserEntity() );
    }
    
    /*
        public CUserEntity getFind(String value) throws IsNullException, FindException {
        session.beginTransaction();new CUserEntity() 

        Query<CUserEntity> createQuery = 
                session.createQuery(QueryEnum.QUERY_USER.getQuery(value), CUserEntity.class);
        
        CUserEntity cUserEntity = createQuery.getSingleResult();
        session.close();
        return cUserEntity;
    }
    */


}
