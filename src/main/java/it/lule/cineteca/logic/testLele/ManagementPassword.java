/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.testLele;

import it.lule.cineteca.logic.enumname.ErrorCodeEnum;
import it.lule.cineteca.logic.testLele.exceptions.PasswordEmptyException;
import it.lule.cineteca.logic.testLele.exceptions.PasswordNotEqualException;
import it.lule.cineteca.logic.testLele.exceptions.PasswordNotUpperCase;
import it.lule.cineteca.logic.testLele.exceptions.PasswordTooShortException;
import java.util.Arrays;

/**
 *
 * @author lele
 */
public class ManagementPassword {

    private Integer isPasswordCorrect;
    private int passwordLeng = 1;
    private String jTextFieldUser;
    private char[] jPasswordField;
    private char[] jPasswordFieldConfirm;

    public ManagementPassword() {
    }

    /**
     * Check login password
     *
     * @param jTextFieldUser
     * @param jPasswordField
     */
    public ManagementPassword(String jTextFieldUser, char[] jPasswordField) {
        this.jTextFieldUser = jTextFieldUser;
        this.jPasswordField = jPasswordField;
        // Unused !!!!!
        jPasswordFieldConfirm = jPasswordField;
//        checkPasswordlogin();
    }

    /**
     * Check Password Registration
     *
     * @return int
     */
    private void checkPasswordlogin() throws PasswordEmptyException, 
            PasswordTooShortException, PasswordNotEqualException, 
            PasswordNotUpperCase {
        passwordEmpty();
        PasswordTooShort();
        passwordNotEqual();
        passwordNotUpperCase();
    }

    /**
     * Password or User are empty
     *
     * @return int
     */
    private void passwordEmpty() throws PasswordEmptyException {
        if (jTextFieldUser.isEmpty() || jPasswordField.length == 0
                || jPasswordFieldConfirm.length == 0) {
            throw new PasswordEmptyException(ErrorCodeEnum.PASSWORD_IS_EMPTY.getMessage());
        }
    }

    /**
     * Password is too short
     */
    private void PasswordTooShort() throws PasswordTooShortException {
        if (jPasswordField.length < passwordLeng) {
            throw new PasswordTooShortException(
                    ErrorCodeEnum.PASSWORD_TOO_SHORT.getMessage());
        }

    }

    /**
     * Password is equal
     *
     * @return int
     */
    private void passwordNotEqual() throws PasswordNotEqualException {
        if (!Arrays.equals(jPasswordField, jPasswordFieldConfirm)) {
            throw new PasswordNotEqualException(
                    ErrorCodeEnum.PASSWORD_IS_NOT_EQUAL.getMessage());
        }
    }

    /**
     * Password is Upper Case
     */
    private void passwordNotUpperCase() throws PasswordNotUpperCase {
        if (checkUpperCase(jPasswordField) == false) {
            throw new PasswordNotUpperCase(ErrorCodeEnum.PASSWORD_IS_NOT_UPPER_CASE.getMessage());
        }
    }

    private boolean checkUpperCase(char[] jPasswordField) {
        for (int i = 0; i < jPasswordField.length; i++) {
            if (Character.isUpperCase(jPasswordField[i])) {
                return true;
            }
        }
        return false;
    }

    public char[] getjPasswordField() {
        return jPasswordField;
    }

    /**
     * Return error code if password is wrong
     *
     * @return
     */
    public Integer isPasswordCorrect() {
        return isPasswordCorrect;
    }
}
