/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.password;

import it.lule.cineteca.logic.enumname.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.dbException.CinetecaException;

/**
 *
 * @author sommovir
 */
public class PasswordException extends CinetecaException {

    public PasswordException(ErrorCodeEnum errorCode) {
        super(errorCode);
    }

}
