/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.exceptions;

import it.lule.cineteca.logic.db.ValidationException;

/**
 *
 * @author sommovir
 */
public class DBUniqueViolationException extends ValidationException implements GuiPrintableException{

    public DBUniqueViolationException() {
        super("Unique-constraint violation detected. [parameter=unknown]");
    }
    
    public DBUniqueViolationException(String parameter) {
        super("Unique-constraint violation detected. [parameter="+parameter+"]");
    }

    @Override
    public String getGuiErrorMessage() {
        return "Installazione fallita. Database già installato";
    }
    
}