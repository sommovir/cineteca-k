/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import it.lule.cineteca.logic.enumname.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.password.PasswordsAreNotEqualsException;
import it.lule.cineteca.logic.exceptions.password.PasswordEmptyException;
import it.lule.cineteca.logic.exceptions.password.PasswordHasNotUpperCaseException;
import it.lule.cineteca.logic.exceptions.password.PasswordTooLongException;
import it.lule.cineteca.logic.exceptions.password.PasswordTooShortException;
import it.lule.cineteca.logic.exceptions.password.UserEmptyException;
import it.lule.cineteca.logic.management.password.ManagementPassword;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author lele
 */
//@Disabled
public class ManagementPasswordTest {

    private boolean passed = false;

    public ManagementPasswordTest() {
    }

//    @Test
//    public void loginPasswordCorretta() {
//        String value = "Lele01";
//        char[] password = value.toCharArray();
//        ManagementPassword managementPassword = new ManagementPassword("lele", password);
//        assertEquals(true, managementPassword.isPasswordCorrect(), "Password corretta");
//    }
    @Test
    @DisplayName(value = "[ManagementPassword] PASSWORD_TOO_LONG")
    public void loginPasswordLunga() {
        String value = "Lele0ddfdfdfdfdfdfd";
        char[] password = value.toCharArray();

        PasswordTooLongException exception
                = assertThrows(PasswordTooLongException.class, new Executable() {

                    @Override
                    public void execute() throws Throwable {
                        ManagementPassword.getInstance().login("lele", password);
                    }
                }, "mi aspettavo che lanciasse un'eccezione");

        assertEquals(ErrorCodeEnum.PASSWORD_TOO_LONG, exception.getErrorCode(),
                "Mi aspettavo l'errore: " + ErrorCodeEnum.PASSWORD_TOO_LONG);
        passed = true;
    }

    @Test
    @DisplayName(value = "[ManagementPassword] PASSWORD_TOO_SHORT")
    public void loginPasswordTooShort() {
        String value = "Le";
        char[] password = value.toCharArray();

        PasswordTooShortException exception
                = assertThrows(PasswordTooShortException.class, new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        ManagementPassword.getInstance().login("lele", password);
                    }
                }, "mi aspettavo che lanciasse un'eccezione");

        assertEquals(ErrorCodeEnum.PASSWORD_TOO_SHORT, exception.getErrorCode(),
                "Mi aspettavo l'errore: " + ErrorCodeEnum.PASSWORD_TOO_SHORT);
        passed = true;
    }

    @Test
    @DisplayName(value = "[ManagementPassword] PASSWORD_HAS_NOT_UPPER_CASE")
    public void loginPasswordHasNotUpperCase() {
        String value = "lele01";
        char[] password = value.toCharArray();

        PasswordHasNotUpperCaseException exception
                = assertThrows(PasswordHasNotUpperCaseException.class, new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        ManagementPassword.getInstance().login("lele", password);
                    }
                }, "mi aspettavo che lanciasse un'eccezione: ");

        assertEquals(ErrorCodeEnum.PASSWORD_HAS_NOT_UPPER_CASE, exception.getErrorCode(),
                "Mi aspettavo l'errore: " + ErrorCodeEnum.PASSWORD_HAS_NOT_UPPER_CASE);
        passed = true;
    }

    @Test
    @DisplayName(value = "[ManagementPassword] PASSWORD_DOES_NOT_MATCH")
    public void passwordDoesNotMatch() {
        String value = "Lele01";
        char[] password = value.toCharArray();

        String value2 = "Lele02";
        char[] password2 = value2.toCharArray();

        PasswordsAreNotEqualsException exception
                = assertThrows(PasswordsAreNotEqualsException.class, new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        ManagementPassword.getInstance().createUser("lele", password, password2);
                    }
                }, "mi aspettavo che lanciasse un'eccezione: ");

        assertEquals(ErrorCodeEnum.PASSWORD_ARE_NOT_EQUALS, exception.getErrorCode(),
                "Mi aspettavo l'errore: " + ErrorCodeEnum.PASSWORD_ARE_NOT_EQUALS);
        passed = true;
    }

    @Test
    @DisplayName(value = "[ManagementPassword] USER_IS_EMPTY")
    public void userIsEmpty() {
        String user = "";
        String passwordStr = "Lele01";
        char[] password = passwordStr.toCharArray();

        UserEmptyException exception
                = assertThrows(UserEmptyException.class, new Executable() {

                    @Override
                    public void execute() throws Throwable {
                        ManagementPassword.getInstance().login(user, password);
                    }
                }, "Mi aspettavo l'errore: " + ErrorCodeEnum.USER_EMPTY);

        assertEquals(ErrorCodeEnum.USER_EMPTY, exception.getErrorCode(),
                "Mi aspettavo l'errore: " + ErrorCodeEnum.USER_EMPTY);
        passed = true;
    }

    @Test
    @DisplayName(value = "[ManagementPassword] PASSWORD_IS_EMPTY")
    public void passwordIsEmpty() {
        String passwordStr = "";
        char[] password = passwordStr.toCharArray();

        PasswordEmptyException exception
                = assertThrows(PasswordEmptyException.class, new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        ManagementPassword.getInstance().login("lele", password);
                    }
                }, "Mi aspettavo l'errore: " + ErrorCodeEnum.PASSWORD_IS_EMPTY);
        passed = true;
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        passed = false;
    }

    @AfterEach
    public void tearDown(TestInfo info) {
        String result = passed ? "[PASSED]" : "[FAIL]";
        System.out.println(result + ">> Test: " + info.getDisplayName());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
