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
public class FilmDirectorController extends AbstractController<FilmDirectorEntity>{
    private static FilmDirectorController instance = null;
    
    public static FilmDirectorController getInstance(){
        if (instance == null){
            instance = new FilmDirectorController();
        }
        return instance;
    }    

    
//    @Override
//    public FilmDirectorController getEntityByQuery(String query) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    private FilmDirectorController() {
        super(FilmDirectorEntity.class);
    }


}
