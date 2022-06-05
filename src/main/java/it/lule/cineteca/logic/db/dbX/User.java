/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.dbX;

import it.lule.cineteca.logic.entities.UserEntity;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author lele
 */
public class User <UserEntity> implements IGenericQualcosa<UserEntity>{
    private SessionFactory sessionFactory;
    
    /**
     * Create user
     * @param userEntity 
     */
    @Override
    public void create(UserEntity userEntity) {
        if (userEntity == null) {
            return;
        }

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(userEntity);
        session.getTransaction();
        session.close();
    }

    /**
     * Edit User
     * @param userEntity 
     */
    @Override
    public void edit(UserEntity userEntity) {
        if (userEntity == null) {
            return;
        }
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
    }

    /**
     * Delete User
     * @param userEntity 
     */
    @Override
    public void delete(UserEntity userEntity) {
        if (userEntity == null) {
            return;
        }
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(userEntity);
        session.close();
    }

    /**
     * Get User by ID
     * @param userEntity
     * @return 
     */
    @Override
    public UserEntity getById(UserEntity userEntity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Get All Users
     * @param userEntity
     * @return 
     */
    @Override
    public List<UserEntity> getAll(UserEntity userEntity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
