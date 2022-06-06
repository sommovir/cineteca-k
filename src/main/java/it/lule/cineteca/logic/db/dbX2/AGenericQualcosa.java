/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.dbX2;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author lele
 */
public abstract class AGenericQualcosa< A> {

    private SessionFactory sessionFactory;

    public void create(A entity) {
        if (entity == null) {
            return;
        }

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(entity);
        session.getTransaction();
        session.close();
    }

    public void edit(A entity) {
        if (entity == null) {
            return;
        }

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.merge(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(A entity) {
        if (entity == null) {
            return;
        }

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(entity);
        session.close();
    }

    public A getById(A entity) {
        if (entity == null) {
            return null;
        }

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.find((Class<A>) entity, entity);
        session.getTransaction();
        session.close();
        return entity;
    }

    @Deprecated
    public List<A> getAll(A entity) {
        if (entity == null) {
            return null;
        }
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();

//        List<A> list = session.createQuery((Class<A>) entity, entity.getClass());

        session.getTransaction();
        session.close();
//        return list;

        return null;

    }
}
