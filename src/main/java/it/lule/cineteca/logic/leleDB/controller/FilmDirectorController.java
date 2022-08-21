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
public class FilmDirectorController extends AbstractController{
    private static FilmDirectorController instance = null;
    
    public static FilmDirectorController getInstance(){
        if (instance == null){
            instance = new FilmDirectorController();
        }
        return instance;
    }    
}
