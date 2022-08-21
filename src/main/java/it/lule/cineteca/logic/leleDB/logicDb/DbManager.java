/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.leleDB.logicDb;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author lele
 */
public class DbManager {
    private SessionFactory sessionFactory = null;
    private static DbManager instance = null;

    public static DbManager getInstance() {
        if (instance == null) {
            instance = new DbManager();
        }
        return instance;
    }

    public DbManager() {
        initConnection();
    }
    
    private void initConnection() {
        try {
            // configures settings from hibernate.cfg.xml 
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            // handle the exception
            throw e;
        }        
    }
    
    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
