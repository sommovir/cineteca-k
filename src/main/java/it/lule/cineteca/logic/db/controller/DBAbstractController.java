/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.db.DbManager;
import it.lule.cineteca.logic.enums.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBGenericErrorException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDbException.DBIsNullException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 * // throw new UnsupportedOperationException();
 *
 * @author lele
 */
public abstract class DBAbstractController<E> {

    protected Session session = null;
    private Class<E> clazz;

    public DBAbstractController(Class<E> clazz) {
        super();
        this.clazz = clazz;
    }

    private void initConnection() {
        session = DbManager.getInstance().getSessionFactory().openSession();
    }

    private void isNull(E entity) throws DBAbstractControllerException {
        if (entity == null) {
            throw new DBIsNullException();
        }
    }

    public void createEntity(E entity) throws DBAbstractControllerException {
        try {
            isNull(entity);
            initConnection();
            session.beginTransaction();
            session.persist(entity);
            session.getTransaction().commit();
            session.close();
        } catch (Exception ex) {
            throw new DBAbstractControllerException(ErrorCodeEnum.DB_GENERIC_ERROR);
        }
    }

    public void deleteEntity(E entity) throws DBAbstractControllerException {
        isNull(entity);

        try {
        initConnection();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        session.close();
        } catch (Exception ex) {
            throw new DBGenericErrorException(ErrorCodeEnum.DB_GENERIC_ERROR);
        }
    }

    public void editEntity(E entity) throws DBAbstractControllerException {
        isNull(entity);

        try {
        initConnection();
        session.beginTransaction();
        session.merge(entity);
        session.getTransaction().commit();
        session.close();
        } catch (Exception ex) {
            throw new DBGenericErrorException(ErrorCodeEnum.DB_GENERIC_ERROR);
        }
    }

    public E getEntityByQuery(String query) throws DBAbstractControllerException {
        E singleResult = null;
        try {
            initConnection();
            session.beginTransaction();
            Query<E> createQuery
                    = session.createQuery(query, this.clazz);
            singleResult = createQuery.getSingleResult();
            session.close();
        } catch (Exception ex) {
            throw new DBGenericErrorException(ErrorCodeEnum.DB_GENERIC_ERROR);
        }
        return (E) singleResult;
    }

    public E getEntityById(E entity) throws DBAbstractControllerException {
//        try {
//        isNull(entity);
//        initConnection();
//        session.beginTransaction();
//        session.getTransaction().commit();
//        session.close();
//        } catch (Exception ex) {
//            throw new DBGenericErrorException(ErrorCodeEnum.DB_GENERIC_ERROR);
//        }
        
        throw new UnsupportedOperationException();
    }

    public List<E> getAllEntites(String query) throws DBAbstractControllerException {
        try {
            initConnection();
            session.beginTransaction();
            Query<E> createQuery
                    = session.createQuery(query, this.clazz);
            List<E> resultList = createQuery.getResultList();
            session.close();
            return resultList;     
        } catch (Exception ex) {
            throw new DBGenericErrorException(ErrorCodeEnum.DB_GENERIC_ERROR);
        }
    }
}
