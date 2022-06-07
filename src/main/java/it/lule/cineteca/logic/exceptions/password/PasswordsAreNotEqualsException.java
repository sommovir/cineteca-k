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
public class PasswordsAreNotEqualsException extends PasswordException{

    public PasswordsAreNotEqualsException() {
        super(ErrorCodeEnum.PASSWORD_ARE_NOT_EQUALS);
    }
    
}
