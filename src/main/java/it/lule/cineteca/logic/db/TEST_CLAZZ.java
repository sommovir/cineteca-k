/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db;

import it.lule.cineteca.logic.entities.MovieEntity;
import java.util.Date;

/**
 *
 * @author sommovir
 */
public class TEST_CLAZZ {

    public static void main(String[] args) {
        MovieEntity entity = new MovieEntity();
        entity.setOriginalTitle("Matrix "+new Date().getTime());
        entity.setReleaseDate(new Date());
        entity.setTitoloTradotto("Matrice");
        try {
            AbstractController<MovieEntity> controller = (AbstractController<MovieEntity>) DbManager.getInstance().getController(entity.getClass());
            controller.create(entity);
        } catch (ValidationException ex) {
            ex.printStackTrace();
        }
    }
}
