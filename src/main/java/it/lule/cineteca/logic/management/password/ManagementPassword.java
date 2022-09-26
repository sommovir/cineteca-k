/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.management.password;

import it.lule.cineteca.logic.exceptions.password.PasswordEmptyException;
import it.lule.cineteca.logic.exceptions.password.PasswordsAreNotEqualsException;
import it.lule.cineteca.logic.exceptions.password.PasswordHasNotUpperCaseException;
import it.lule.cineteca.logic.exceptions.password.PasswordTooLongException;
import it.lule.cineteca.logic.exceptions.password.PasswordTooShortException;
import it.lule.cineteca.logic.exceptions.password.UserEmptyException;
import java.util.Arrays;

/**
 *
 * @author lele
 */
public class ManagementPassword {

    private static ManagementPassword instance = null;
//    private boolean isPasswordCorrect = false;
    private int passwordMinimumLength = 3;
    private int passwordMaximumLength = 8;

    public static ManagementPassword getInstance() {
        if (instance == null) {
            instance = new ManagementPassword();
        }
        return instance;
    }

    /**
     * Login
     *
     * @param jTextFieldUser
     * @param jPasswordField
     * @throws PasswordEmptyException
     * @throws PasswordTooShortException
     * @throws PasswordHasNotUpperCaseException
     * @throws UserEmptyException
     * @throws PasswordTooLongException
     */
    public void login(String jTextFieldUser, char[] jPasswordField)
            throws PasswordEmptyException, PasswordTooShortException,
            PasswordHasNotUpperCaseException, UserEmptyException,
            PasswordTooLongException {
        // jPasswordField, jPasswordField it's correct 
        checkPassword(jTextFieldUser, jPasswordField, jPasswordField);
    }

    /**
     * Create User
     *
     * @param jTextFieldUser
     * @param jPasswordField
     * @param jPasswordFieldConfirm
     * @throws PasswordEmptyException
     * @throws PasswordTooShortException
     * @throws PasswordHasNotUpperCaseException
     * @throws UserEmptyException
     * @throws PasswordTooLongException
     * @throws PasswordsAreNotEqualsException
     */
    public void createUser(String jTextFieldUser, char[] jPasswordField,
            char[] jPasswordFieldConfirm) throws PasswordEmptyException,
            PasswordTooShortException, PasswordHasNotUpperCaseException,
            UserEmptyException, PasswordTooLongException,
            PasswordsAreNotEqualsException {

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
     * @throws PasswordEmptyException
     * @throws PasswordTooShortException
     * @throws PasswordHasNotUpperCaseException
     * @throws UserEmptyException
     * @throws PasswordTooLongException
     */
    private void checkPassword(String jTextFieldUser, char[] jPasswordField,
            char[] jPasswordFieldConfirm) throws PasswordEmptyException,
            PasswordTooShortException, PasswordHasNotUpperCaseException, UserEmptyException, PasswordTooLongException {
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
        if (jPasswordField == null || jPasswordFieldConfirm == null ||
              jPasswordField.length == 0 || jPasswordFieldConfirm.length == 0  ){
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

//    /**
//     * Get jPassword Field
//     *
//     * @return
//     */
//    public char[] getjPasswordField() {
//        return jPasswordField;
//    }
//
//    /**
//     * Return error code if password is wrong
//     *
//     * @return
//     */
//    public boolean isPasswordCorrect() {
//        return isPasswordCorrect;
//    }
}
