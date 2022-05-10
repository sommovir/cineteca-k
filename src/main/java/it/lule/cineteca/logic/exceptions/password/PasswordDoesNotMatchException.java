/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.password;

import it.lule.cineteca.logic.enumname.ErrorCodeEnum;

/**
 *
 * @author lele
 */
public class PasswordDoesNotMatchException extends PasswordException{

    public PasswordDoesNotMatchException() {
        super(ErrorCodeEnum.PASSWORD_DOES_NOT_MATCH);
    }
    
}
