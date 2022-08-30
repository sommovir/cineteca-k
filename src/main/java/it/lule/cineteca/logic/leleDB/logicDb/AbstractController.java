/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.leleDB.logicDb;

import it.lule.cineteca.logic.enumname.QueryEnum;
import it.lule.cineteca.logic.entities.CUserEntity;
import it.lule.cineteca.logic.exceptions.abstractControllerException.CreateException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.DeleteException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.FindException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.IsNullException;
import it.lule.cineteca.logic.leleDB.controller.CUserController;
import it.lule.cineteca.logic.leleDB.controller.Search;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 * // throw new UnsupportedOperationException();
 *
 * @author lele
 */
public class AbstractController<E,D> {

    private Session session = null;

    public AbstractController() {
        super();
        session = DbManager.getInstance().getSessionFactory().openSession();
    }

    private void isNull(E entity) throws IsNullException {
        if (entity == null) {
            throw new IsNullException();
        }
    }

    public void createEntity(E entity) throws IsNullException, CreateException {
        isNull(entity);
        try {
            session.beginTransaction();
            session.persist(entity);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            throw new CreateException();
        }
    }

    public void deleteEntity(E entity) throws IsNullException, DeleteException {
        isNull(entity);

        try {
            session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            throw new DeleteException();
        }
    }

    public void editEntity(E entity) throws IsNullException {
        isNull(entity);

        session.beginTransaction();
        session.merge(entity);
        session.getTransaction().commit();
        session.close();
    }

    @Deprecated
    public <E> Query getByQuery(String query, E entity) {
        session.beginTransaction();

        /* Controlalre */
//        Query<E> createQuery = 
//                session.createQuery(query, entity.getClass());
//        session.close();
//         return createQuery;
        // return (Query) createQuery.getSingleResult();

        throw new UnsupportedOperationException();
    }
    
//    public CUserEntity getByQueryX01(String value) throws IsNullException, FindException {
//        session.beginTransaction();
//
////        Query<CUserEntity> createQuery = 
////                session.createQuery(QueryEnum.BY_USER_NAME.byUserName(value), CUserEntity.class);
//        Query<CUserEntity> createQuery
//                = session.createQuery(Search.byUserName(value), CUserEntity.class);
//
//        CUserEntity cUserEntity = createQuery.getSingleResult();
//        session.close();
//        return cUserEntity;
//
//    }

    public E getById(E entity) throws IsNullException {
        isNull(entity);
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
        throw new UnsupportedOperationException();
    }

}
