/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.leleDB.controller;

import it.lule.cineteca.logic.entities.CUserEntity;
import it.lule.cineteca.logic.exceptions.abstractControllerException.FindException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.IsNullException;
import it.lule.cineteca.logic.leleDB.logicDb.AbstractController;

/**
 *
 * @author lele
 */
public class CUserController extends AbstractController<CUserEntity> {

    private static CUserController instance = null;

    private CUserController() {
        super(CUserEntity.class);
    }

    public static CUserController getInstance() {
        if (instance == null) {
            instance = new CUserController();
        }
        return instance;
    }

    /* Controlalre */
    public CUserEntity getUserName(String user) throws IsNullException, FindException {
        return (CUserEntity) getEntityByQuery(Search.userByUserName(user));
        
//        throw new UnsupportedOperationException();

//        return (CUserEntity) getByQueryX02
//        (Search.byUserName(user), new CUserEntity() );
    }

    public CUserEntity getUserID() throws IsNullException, FindException {
        throw new UnsupportedOperationException();
    }

    public CUserEntity getByQueryX(String value) throws IsNullException, FindException {
        throw new UnsupportedOperationException();
    }

//    @Override
//    public final CUserController getEntityByQuery(String query) {
//        session.beginTransaction();
//
//        /* Controlalre */
//        Query<CUserController> createQuery
//                = session.createQuery(query, CUserController.class);
//        session.close();
//        return (CUserController) createQuery.getSingleResult();
//    }

}
