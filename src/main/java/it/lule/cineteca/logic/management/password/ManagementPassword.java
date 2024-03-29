/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.management.password;

import it.lule.cineteca.logic.exceptions.password.PasswordException;
import it.lule.cineteca.logic.exceptions.password.wrongPasswordException.PasswordEmptyException;
import it.lule.cineteca.logic.exceptions.password.wrongPasswordException.PasswordsAreNotEqualsException;
import it.lule.cineteca.logic.exceptions.password.wrongPasswordException.PasswordHasNotUpperCaseException;
import it.lule.cineteca.logic.exceptions.password.wrongPasswordException.PasswordTooLongException;
import it.lule.cineteca.logic.exceptions.password.wrongPasswordException.PasswordTooShortException;
import it.lule.cineteca.logic.exceptions.password.wrongPasswordException.UserEmptyException;
import java.util.Arrays;

/**
 *
 * @author lele
 */
public class ManagementPassword {

    private static ManagementPassword instance = null;
    private int passwordMinimumLength = 3;
    private int passwordMaximumLength = 8;

    public static ManagementPassword getInstance() {
        if (instance == null) {
            instance = new ManagementPassword();
        }
        return instance;
    }

    /**
     * Rule Login
     *
     * @param jTextFieldUser
     * @param jPasswordField
     * @throws it.lule.cineteca.logic.exceptions.password.PasswordException
     */
    public void RulePasswordLogin(String jTextFieldUser, char[] jPasswordField) throws PasswordException {
        // jPasswordField, jPasswordField it's correct
        checkPassword(jTextFieldUser, jPasswordField, jPasswordField);
    }

    /**
     * Rule Registration
     *
     * @param jTextFieldUser
     * @param jPasswordField
     * @param jPasswordFieldConfirm
     * @throws it.lule.cineteca.logic.exceptions.password.PasswordException
     */
    public void RulePasswordRegistration(String jTextFieldUser, char[] jPasswordField,
            char[] jPasswordFieldConfirm) throws PasswordException {
        checkPassword(jTextFieldUser, jPasswordField, jPasswordFieldConfirm);
        passwordsAreNotEquals(jPasswordField, jPasswordFieldConfirm);
    }

    public ManagementPassword() {
    }

    /**
     * Check Password
     *
     * @param jTextFieldUser
     * @param jPasswordField
     * @param jPasswordFieldConfirm
     * @throws PasswordException
     */
    private void checkPassword(String jTextFieldUser, char[] jPasswordField,
            char[] jPasswordFieldConfirm) throws PasswordException {
        userEmpty(jTextFieldUser);

        passwordEmpty(jPasswordField, jPasswordFieldConfirm);
        passwordTooShort(jPasswordField);
        passwordTooLong(jPasswordField);
        passwordHasNotUpperCase(jPasswordField);
        userEmpty(jTextFieldUser);
    }

    /**
     * Password or User are empty
     *
     * @param jPasswordField
     * @param jPasswordFieldConfirm
     * @throws PasswordEmptyException
     */
    private void passwordEmpty(char[] jPasswordField, char[] jPasswordFieldConfirm) throws PasswordEmptyException {
        if (jPasswordField == null || jPasswordFieldConfirm == null
                || jPasswordField.length == 0 || jPasswordFieldConfirm.length == 0) {
            throw new PasswordEmptyException();
        }
    }

    /**
     * Password is too short
     *
     * @param jPasswordField
     * @throws PasswordTooShortException
     */
    private void passwordTooShort(char[] jPasswordField) throws PasswordTooShortException {
        if (jPasswordField.length < passwordMinimumLength) {
            throw new PasswordTooShortException();
        }
    }

    /**
     * Password is too long
     *
     * @param jPasswordField
     * @throws PasswordTooLongException
     */
    private void passwordTooLong(char[] jPasswordField) throws PasswordTooLongException {
        if (jPasswordField.length > passwordMaximumLength) {
            throw new PasswordTooLongException();
        }
    }

    /**
     * User Is Empty
     *
     * @param jTextFieldUser
     * @throws UserEmptyException
     */
    private void userEmpty(String jTextFieldUser) throws UserEmptyException {
        if (jTextFieldUser.isEmpty()) {
            throw new UserEmptyException();
        }
    }

    /**
     * Password is equal
     *
     * @param jPasswordField
     * @param jPasswordFieldConfirm
     * @throws PasswordsAreNotEqualsException
     */
    private void passwordsAreNotEquals(char[] jPasswordField,
            char[] jPasswordFieldConfirm) throws PasswordsAreNotEqualsException {

        if (!Arrays.equals(jPasswordField, jPasswordFieldConfirm)) {
            throw new PasswordsAreNotEqualsException();
        }
    }

    /**
     * Password is Upper Case
     *
     * @param jPasswordField
     * @throws PasswordHasNotUpperCaseException
     */
    private void passwordHasNotUpperCase(char[] jPasswordField) throws PasswordHasNotUpperCaseException {
        if (checkUpperCase(jPasswordField) == false) {
            throw new PasswordHasNotUpperCaseException();
        }
    }

    /**
     * Check Upper Case
     *
     * @param jPasswordField
     * @return
     */
    private boolean checkUpperCase(char[] jPasswordField) {
        for (int i = 0; i < jPasswordField.length; i++) {
            if (Character.isUpperCase(jPasswordField[i])) {
                return true;
            }
        }

        return false;
    }
}
