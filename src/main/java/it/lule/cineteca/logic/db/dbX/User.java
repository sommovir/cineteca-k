/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.dbX;

import it.lule.cineteca.logic.entities.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author lele
 */
public class User {

    private SessionFactory sessionFactory;

    public void createUser(UserEntity userEntity) {
        if (userEntity == null) {
            return;
        }

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(userEntity);
        session.getTransaction();
        session.close();
    }

    public void editUser(UserEntity userEntity) {
        if (userEntity == null) {
            return;
        }
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
    }

    public void deleteUser(UserEntity userEntity) {
        if (userEntity == null) {
            return;
        }
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(userEntity);
        session.close();
    }
}
