/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.leleDB.logicDb;

import it.lule.cineteca.logic.exceptions.abstractControllerException.CreateException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.DeleteException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.IsNullException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 * // throw new UnsupportedOperationException();
 *
 * @author lele
 */
public abstract class AbstractController<E> {

    protected Session session = null;
    private Class<E> clazz;
    
    
    public AbstractController(Class<E> clazz) {
        super();
        this.clazz = clazz;
        
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

    public E getEntityByQuery(String query){
                session.beginTransaction();

        /* Controlalre */
        Query<E> createQuery
                = session.createQuery(query, this.clazz );
        E singleResult = createQuery.getSingleResult();
        session.close();
        return (E) singleResult;
    }
    
//    public abstract E getEntityByQuery(String query);

    public E getById(E entity) throws IsNullException {
        isNull(entity);
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
        throw new UnsupportedOperationException();
    }

}
