/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.db.entities.CUserEntity;
import it.lule.cineteca.logic.db.entities.SetupEntity;

/**
 *
 * @author Luca
 */
public class DBSetupController extends DBAbstractController<SetupEntity>{
    
    private static DBSetupController instance = null;

    public static DBSetupController getInstance() {
        if (instance == null) {
            instance = new DBSetupController();
        }
        return instance;
    }

    protected DBSetupController() {
        super(SetupEntity.class);
    }
    
}
