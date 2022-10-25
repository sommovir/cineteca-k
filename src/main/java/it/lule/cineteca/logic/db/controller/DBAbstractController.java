/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBCreateException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBDeleteException;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBIsNullException;
import it.lule.cineteca.logic.db.DbManager;
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
        
        session = DbManager.getInstance().getSessionFactory().openSession();
    }

    private void isNull(E entity) throws DBIsNullException {
        if (entity == null) {
            throw new DBIsNullException();
        }
    }

    public void createEntity(E entity) throws DBIsNullException, DBCreateException {
        isNull(entity);
        try {
            session.beginTransaction();
            session.persist(entity);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            throw new DBCreateException();
        }
    }

    public void deleteEntity(E entity) throws DBIsNullException, DBDeleteException {
        isNull(entity);

        try {
            session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            throw new DBDeleteException();
        }
    }

    public void editEntity(E entity) throws DBIsNullException {
        isNull(entity);

        session.beginTransaction();
        session.merge(entity);
        session.getTransaction().commit();
        session.close();
    }

    public E getEntityByQuery(String query){
        session.beginTransaction();
        Query<E> createQuery
                = session.createQuery(query, this.clazz );
        E singleResult = createQuery.getSingleResult();
        session.close();
        return (E) singleResult;
    }

    public E getById(E entity) throws DBIsNullException {
        isNull(entity);
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
        throw new UnsupportedOperationException();
    }

    public List<E> getAllEntites(String query){
        session.beginTransaction();
        Query<E> createQuery = 
                session.createQuery(query, this.clazz);
        List<E> resultList = createQuery.getResultList();
        session.close();
        return resultList;
    }
}
