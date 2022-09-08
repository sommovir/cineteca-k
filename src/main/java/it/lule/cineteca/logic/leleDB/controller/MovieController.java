/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.leleDB.controller;

import it.lule.cineteca.logic.entities.MovieEntity;
import it.lule.cineteca.logic.leleDB.logicDb.AbstractController;



/**
 *
 * @author lele
 */
public class MovieController extends AbstractController<MovieEntity>{
    private static MovieController instance = null;
    
    public static MovieController getInstance(){
        if (instance == null){
            instance = new MovieController();
        }
        return instance;
    }        
    
//    @Override
//    public MovieController getEntityByQuery(String query) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    private MovieController() {
        super(MovieEntity.class);
    }
}
