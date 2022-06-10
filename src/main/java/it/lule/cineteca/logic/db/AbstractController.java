/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db;

import it.lule.cineteca.logic.entities.MovieEntity;
import it.lule.cineteca.logic.exceptions.DBBadParamaterException;
import org.hibernate.Session;

/**
 *
 * @author sommovir
 */
public abstract class AbstractController<E extends WithID> {

    public abstract void validate(E entity) throws ValidationException;

    public abstract void postEdit(E Entity);

    public abstract void postCreation(E Entity);

    public E edit(E entity) throws ValidationException {
        validate(entity);
        Session session = DbManager.getInstance().getSessionFactory().openSession();
        session.beginTransaction();
        E mergedEntity = (E) session.merge(entity);
        session.getTransaction().commit();
        session.close();
        postEdit(entity);
        return mergedEntity;
    }

    public long create(E entity) throws ValidationException {
        if (entity == null) {
            return -1;
        }
        validate(entity);
        
        Session session = DbManager.getInstance().getSessionFactory().openSession();
        session.beginTransaction();

        session.persist(entity);

        session.getTransaction().commit();
        session.close();
        postCreation(entity);
        return entity.getId();
    }


}
