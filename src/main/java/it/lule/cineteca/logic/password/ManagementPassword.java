/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.password;

import it.lule.cineteca.logic.prova.logic.enumname.ErrorCodeEnum;
import java.util.Arrays;

/**
 * Valutiamo l'idea di renderlo statico per fare una cosa cosi
 * ManagementPassword.checkPasswordRegistration(.....)
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
        checkPasswordlogin();
    }

    /**
     * Create new jTextFieldUser
     *
     * @param jTextFieldUser
     * @param jPasswordField
     * @param jPasswordFieldConfirm
     */
    public ManagementPassword(String jTextFieldUser, char[] jPasswordField, char[] jPasswordFieldConfirm) {
        this.jTextFieldUser = jTextFieldUser;
        this.jPasswordField = jPasswordField;
        this.jPasswordFieldConfirm = jPasswordFieldConfirm;
        checkPasswordRegistration();
    }

    /**
     * Check Password Registration
     *
     * @return int
     */
    private int checkPasswordRegistration() {
        isPasswordCorrect = null;

        isPasswordCorrect = isEmpty();
        if (isPasswordCorrect != -1) {
            return isPasswordCorrect;
        }

        isPasswordCorrect = isUpperCase();
        if (isPasswordCorrect != -1) {
            return isPasswordCorrect;
        }

        return isPasswordCorrect;
    }

    /**
     * Check Password Registration
     *
     * @return int
     */
    private int checkPasswordlogin() {
        isPasswordCorrect = null;

        isPasswordCorrect = isEmpty();
        if (isPasswordCorrect != -1) {
            return isPasswordCorrect;
        }

        isPasswordCorrect = isLength();
        if (isPasswordCorrect != -1) {
            return isPasswordCorrect;
        }

        isPasswordCorrect = isEqual();
        if (isPasswordCorrect != -1) {
            return isPasswordCorrect;
        }

        isPasswordCorrect = isUpperCase();
        if (isPasswordCorrect != -1) {
            return isPasswordCorrect;
        }

        return isPasswordCorrect;
    }

    /**
     * Password or User are empty
     *
     * @return int
     */
    private int isEmpty() {
        if (jTextFieldUser.isEmpty() || jPasswordField.length == 0
                || jPasswordFieldConfirm.length == 0) {
            return ErrorCodeEnum.PASSWORD_IS_EMPTY.getCode();
        }
        return -1;
    }

    /**
     * Password is length
     *
     * @return int
     */
    private int isLength() {
        if (jPasswordField.length <= passwordLeng) {
            return ErrorCodeEnum.PASSWORD_IS_LENGTH.getCode();
        }
        return -1;
    }

    /**
     * Password is equal
     *
     * @return int
     */
    private int isEqual() {
        if (!Arrays.equals(jPasswordField, jPasswordFieldConfirm)) {
            return ErrorCodeEnum.PASSWORD_IS_EQUAL.getCode();
        }
        return -1;
    }

    /**
     * Password is Upper Case
     *
     * @return int
     */
    private int isUpperCase() {
        if (isUpperCase(jPasswordField) == false) {
            return ErrorCodeEnum.PASSWORD_IS_UPPER_CASE.getCode();
        }
        return -1;
    }

    private boolean isUpperCase(char[] jPasswordField) {
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