/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.exceptions.password.wrongPasswordException;

import it.lule.cineteca.logic.enums.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.password.PasswordException;

/**
 *
 * @author lele
 */
public class PasswordIsWrong extends PasswordException {

    public PasswordIsWrong(ErrorCodeEnum errorCode) {
        super(ErrorCodeEnum.PASSWORD_IS_WRONG);
    }

}
