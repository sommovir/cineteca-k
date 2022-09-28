/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.db.entities.MovieEntity;



/**
 *
 * @author lele
 */
public class DBMovieController extends DBAbstractController<MovieEntity>{
    private static DBMovieController instance = null;
    
    public static DBMovieController getInstance(){
        if (instance == null){
            instance = new DBMovieController();
        }
        return instance;
    }        
    
//    @Override
//    public MovieController getEntityByQuery(String query) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    private DBMovieController() {
        super(MovieEntity.class);
    }
}
