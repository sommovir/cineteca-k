/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.password;

import it.lule.cineteca.logic.enums.ErrorCodeEnum;

/**
 *
 * @author lele
 */
public class PasswordTooLongException extends PasswordException {

    public PasswordTooLongException() {
        super(ErrorCodeEnum.PASSWORD_TOO_LONG);
    }

}
