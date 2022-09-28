/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

import it.lule.cineteca.logic.db.entities.FilmDirectorEntity;

/**
 *
 * @author lele
 */
public class DBFilmDirectorController extends DBAbstractController<FilmDirectorEntity>{
    private static DBFilmDirectorController instance = null;
    
    public static DBFilmDirectorController getInstance(){
        if (instance == null){
            instance = new DBFilmDirectorController();
        }
        return instance;
    }    

    
//    @Override
//    public FilmDirectorController getEntityByQuery(String query) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    private DBFilmDirectorController() {
        super(FilmDirectorEntity.class);
    }


}
