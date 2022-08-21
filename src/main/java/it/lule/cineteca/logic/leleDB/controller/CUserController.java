/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.leleDB.controller;

import it.lule.cineteca.logic.leleDB.logicDb.AbstractController;

/**
 *
 * @author lele
 */
public class CUserController extends AbstractController{
    private static CUserController instance = null;
    
    public static CUserController getInstance(){
        if (instance == null){
            instance = new CUserController();
        }
        return instance;
    }
}
