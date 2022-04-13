/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.password;

import it.lule.cineteca.logic.enumname.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.password.PasswordEmptyException;
import it.lule.cineteca.logic.exceptions.password.PasswordHasNotEqualException;
import it.lule.cineteca.logic.exceptions.password.PasswordHasNotUpperCaseException;
import it.lule.cineteca.logic.exceptions.password.PasswordTooLongException;
import it.lule.cineteca.logic.exceptions.password.PasswordTooShortException;
import it.lule.cineteca.logic.exceptions.password.UserEmptyException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lele
 */
public class ManagementPassword {

    private boolean isPasswordCorrect = false;
    private int passwordMinimumLength = 3;
    private int passwordMaximumLength = 6;
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
        try {
            checkPassword();
        } catch (PasswordEmptyException ex) {
            Logger.getLogger(ManagementPassword.class.getName()).log(Level.SEVERE, null, ex);
            return;
        } catch (PasswordTooLongException ex) {
            Logger.getLogger(ManagementPassword.class.getName()).log(Level.SEVERE, null, ex);
            return;
        } catch (PasswordTooShortException ex) {
            Logger.getLogger(ManagementPassword.class.getName()).log(Level.SEVERE, null, ex);
            return;
        } catch (PasswordHasNotUpperCaseException ex) {
            Logger.getLogger(ManagementPassword.class.getName()).log(Level.SEVERE, null, ex);
            return;
        } catch (UserEmptyException ex) {
            Logger.getLogger(ManagementPassword.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }

        isPasswordCorrect = true;
    }

    /**
     * User registration
     *
     * @param jTextFieldUser
     * @param jPasswordField
     * @param jPasswordFieldConfirm
     */
    public ManagementPassword(String jTextFieldUser, char[] jPasswordField, char[] jPasswordFieldConfirm) {
        this.jTextFieldUser = jTextFieldUser;
        this.jPasswordField = jPasswordField;
        this.jPasswordFieldConfirm = jPasswordFieldConfirm;

        try {
            checkPassword();
            passwordHasNotEqual();
        } catch (PasswordEmptyException ex) {
            Logger.getLogger(ManagementPassword.class.getName()).log(Level.SEVERE, null, ex);
            return;
        } catch (PasswordTooLongException ex) {
            Logger.getLogger(ManagementPassword.class.getName()).log(Level.SEVERE, null, ex);
            return;
        } catch (PasswordTooShortException ex) {
            Logger.getLogger(ManagementPassword.class.getName()).log(Level.SEVERE, null, ex);
            return;
        } catch (PasswordHasNotUpperCaseException ex) {
            Logger.getLogger(ManagementPassword.class.getName()).log(Level.SEVERE, null, ex);
            return;
        } catch (PasswordHasNotEqualException ex) {
            Logger.getLogger(ManagementPassword.class.getName()).log(Level.SEVERE, null, ex);
            return;
        } catch (UserEmptyException ex) {
            Logger.getLogger(ManagementPassword.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }

        isPasswordCorrect = true;
    }

    private void checkPassword() throws PasswordEmptyException,
            PasswordTooShortException, PasswordHasNotUpperCaseException, UserEmptyException, PasswordTooLongException {
        userEmpty();
        passwordEmpty();
        passwordTooShort();
        passwordTooLong();
        passwordHasNotUpperCase();
    }

    /**
     * Password or User are empty
     *
     * @throws PasswordEmptyException
     */
    private void passwordEmpty() throws PasswordEmptyException {
        if (jPasswordField.length == 0 || 
                jPasswordField == null ||
                jPasswordFieldConfirm.length == 0 || 
                jPasswordFieldConfirm == null) {
            throw new PasswordEmptyException();
        }

    }

    /**
     * Password is too short
     *
     * @throws PasswordTooShortException
     */
    private void passwordTooShort() throws PasswordTooShortException {
        if (jPasswordField.length < passwordMinimumLength) {
            throw new PasswordTooShortException();
        }
    }

    /**
     * Password is too long
     *
     * @throws PasswordTooLongException
     */
    private void passwordTooLong() throws PasswordTooLongException {
        if (jPasswordField.length > passwordMaximumLength) {
            throw new PasswordTooLongException();
        }
    }

    /**
     * User Is Empty
     *
     * @throws UserEmptyException
     */
    private void userEmpty() throws UserEmptyException {
        if (jTextFieldUser.isEmpty()) {
            throw new UserEmptyException();
        }
    }

    /**
     * Password is equal
     *
     * @throws PasswordHasNotEqualException
     */
    private void passwordHasNotEqual() throws PasswordHasNotEqualException {
        if (!Arrays.equals(jPasswordField, jPasswordFieldConfirm)) {
            throw new PasswordHasNotEqualException();
        }
    }

    /**
     * Password is Upper Case
     *
     * @throws PasswordHasNotUpperCaseException
     */
    private void passwordHasNotUpperCase() throws PasswordHasNotUpperCaseException {
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

    /**
     * Get jPassword Field
     *
     * @return
     */
    public char[] getjPasswordField() {
        return jPasswordField;
    }

    /**
     * Return error code if password is wrong
     *
     * @return
     */
    public boolean isPasswordCorrect() {
        return isPasswordCorrect;
    }
}
