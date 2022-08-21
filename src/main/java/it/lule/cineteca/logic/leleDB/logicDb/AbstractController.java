/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.leleDB.logicDb;

import it.lule.cineteca.logic.entities.CUserEntity;
import it.lule.cineteca.logic.exceptions.abstractController.CreateException;
import it.lule.cineteca.logic.exceptions.abstractController.DeleteException;
import it.lule.cineteca.logic.exceptions.abstractController.FindException;
import it.lule.cineteca.logic.exceptions.abstractController.IsNullException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 * //        throw new UnsupportedOperationException();
 * @author lele
 */
public class AbstractController<E> {

    private Session session = null;

    public AbstractController() {
        super();
        session = DbManager.getInstance().getSessionFactory().openSession();
    }

    public void isNull(E entity) throws IsNullException {
        if (entity == null) {
            throw new IsNullException();
        }
    }

    public void create(E entity) throws IsNullException, CreateException{

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


    public void delete(E entity) throws IsNullException, DeleteException {
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

    public void edit(E entity) throws IsNullException {
        isNull(entity);

        session.beginTransaction();
        session.merge(entity);
        session.getTransaction().commit();
        session.close();
    }

    public CUserEntity getFind(String value) throws IsNullException, FindException {
        session.beginTransaction();

        Query<CUserEntity> createQuery = 
                session.createQuery(QueryEnum.QUERY_USER.getQuery(value), CUserEntity.class);
        
        CUserEntity cUserEntity = createQuery.getSingleResult();
        session.close();
        return cUserEntity;


    }

    public Long getId(E entity) throws IsNullException {
        isNull(entity);
        session.beginTransaction();

        session.getTransaction().commit();
        session.close();
        throw new UnsupportedOperationException();
    }

}
