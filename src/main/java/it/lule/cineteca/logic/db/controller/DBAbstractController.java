/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.db.DbManager;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDbException.DBCreateException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.errorDbException.DBDeleteException;
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
        isNull(entity);
        initConnection();
        try {
            session.beginTransaction();
            session.persist(entity);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            throw new DBCreateException();
        }
    }

    public void deleteEntity(E entity) throws DBAbstractControllerException {
        isNull(entity);
        initConnection();
        try {
            session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            throw new DBDeleteException();
        }
    }

    public void editEntity(E entity) throws DBAbstractControllerException {
        isNull(entity);
        initConnection();
        session.beginTransaction();
        session.merge(entity);
        session.getTransaction().commit();
        session.close();
    }

    public E getEntityByQuery(String query) {
        initConnection();
        session.beginTransaction();
        Query<E> createQuery
                = session.createQuery(query, this.clazz);
        E singleResult = createQuery.getSingleResult();
        session.close();
        return (E) singleResult;
    }

    public E getById(E entity) throws DBAbstractControllerException {
        isNull(entity);
        initConnection();
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
        throw new UnsupportedOperationException();
    }

    public List<E> getAllEntites(String query) {
        initConnection();
        session.beginTransaction();
        Query<E> createQuery
                = session.createQuery(query, this.clazz);
        List<E> resultList = createQuery.getResultList();
        session.close();
        return resultList;
    }
}
