/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.management.registration;

import it.lule.cineteca.logic.db.entities.CUserEntity;
import it.lule.cineteca.logic.exceptions.registration.RegistrationException;

/**
 *
 * @author lele
 */
public class ManagementRegistration {
    private static ManagementRegistration instance = null;
    
    public static ManagementRegistration getInstance(){
        if (instance == null){
            instance = new ManagementRegistration();
        }
        return instance;
    }
    /**
     * Register User
     * @param user
     * @throws RegistrationException 
     */
    public void register(CUserEntity user) throws RegistrationException {
        
    }
    
    public void deleteAccount(long id) throws RegistrationException{
        
    }
}
