 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.db;

import it.lule.cineteca.logic.controllers.MovieController;
import it.lule.cineteca.logic.entities.MovieEntity;
import org.hibernate.SessionFactory;
import it.lule.cineteca.utils.test.Tested;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author sommovir
 */
@Tested(name = "DbManager", testEnabled = true)
public class DbManager {

    private static DbManager _instance = null;
    private SessionFactory sessionFactory;
    private boolean installed = false;
    
    private Map<Class<? extends WithID>,AbstractController> controllerMap = new HashMap<>();

    /**
     *
     * @return
     */
    public static DbManager getInstance() {
        if (_instance == null) {
            _instance = new DbManager();
        }
        return _instance;
    }

    public String getStatus() {
        String status = "=================== STATUS =================\n";
        status += ("SessionFactory: " + (this.sessionFactory == null ? "FAIL" : "OPERATIVE")) + "\n";
        status += ("DB Installed: " + (!installed ? "FAIL" : "OPERATIVE")) + "\n";
        status += "============================================\n";
        return status;
    }

    private DbManager() {
        super();
        controllerMap.put(MovieEntity.class, new MovieController());
        initConnection();
    }
    
    public <T extends WithID> AbstractController<T> getController(Class<T> clazz){
        return (AbstractController<T>)this.controllerMap.get(clazz);
    }

    private void initConnection() {
        try {
            // configures settings from hibernate.cfg.xml 
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            installed = true;
        } catch (Exception e) {
            // handle the exception
            throw e;
        }
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    

   
}
