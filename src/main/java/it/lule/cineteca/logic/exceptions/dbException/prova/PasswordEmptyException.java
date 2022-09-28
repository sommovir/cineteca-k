/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.dbException.prova;

import it.lule.cineteca.logic.enumname.ErrorCodeEnum;

/**
 *
 * @author lele
 */
public class PasswordEmptyException extends PasswordException{
    public PasswordEmptyException() {
        super(ErrorCodeEnum.PASSWORD_IS_EMPTY);
    }   
}
