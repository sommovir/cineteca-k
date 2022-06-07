/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.dbX2;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author lele
 */
public abstract class AGenericQualcosa<A> {

    private SessionFactory sessionFactory;
    private boolean installed = false;
    
    public AGenericQualcosa() {
        super();
        initConnection();
    }

    private void initConnection() {

        // configures settings from hibernate.cfg.xml 
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            installed = true;
//             SessionFactory sessionFactory = new Configuration()
//    .configure("/org/nitish/caller/hibernate.cfg.xml").buildSessionFactory();
        } catch (Exception e) {
            // handle the exception
            e.printStackTrace();
        }
    }

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
