/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.controllers;

import it.lule.cineteca.logic.db.AbstractController;
import it.lule.cineteca.logic.db.ValidationException;
import it.lule.cineteca.logic.entities.MovieEntity;

/**
 *
 * @author sommovir
 */
public class MovieController extends AbstractController<MovieEntity>{

    @Override
    public void validate(MovieEntity entity) throws ValidationException {
        if(entity.getOriginalTitle()==null || entity.getOriginalTitle().isEmpty()){
            throw new ValidationException("original title is missing");
        }
    }

    @Override
    public void postEdit(MovieEntity Entity) {
        //nothing to do
    }

    @Override
    public void postCreation(MovieEntity Entity) {
       //nothing to do. 
       //qui ad esempio potresti volendo, collegarci un motore ad eventi pe
       //propagare alla GUI che c'è stata una creazione
    }
    
}
