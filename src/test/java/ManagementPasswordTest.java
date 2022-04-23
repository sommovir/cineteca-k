/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import it.lule.cineteca.logic.enumname.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.password.PasswordTooLongException;
import it.lule.cineteca.logic.password.ManagementPassword;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author lele
 */
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
    @DisplayName(value = "[ManagementPassword] password too long.")
    public void loginPasswordLunga() {
        String value = "Lele0ddfdfdfdfdfdfd";
        char[] password = value.toCharArray();
        PasswordTooLongException exception = assertThrows(PasswordTooLongException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ManagementPassword.getInstance().login("lele", password);
            }
        }, "mi aspettavo che lanciasse un'eccezione");
        assertEquals(ErrorCodeEnum.PASSWORD_TOO_LONG, exception.getErrorCode(),"Mi aspettavo l'errore: "+ErrorCodeEnum.PASSWORD_TOO_LONG);
        passed = true;
    }

//    @Test
//    public void loginPasswordCorta() {
//        String value = "Le";
//        char[] password = value.toCharArray();
//        ManagementPassword managementPassword
//                = new ManagementPassword("lele", password);
//
//        assertEquals(false, managementPassword.isPasswordCorrect(),
//                ErrorCodeEnum.PASSWORD_TOO_SHORT.getMessage());
//    }
//
//    @Test
//    public void loginPasswordSenzaMaiuscole() {
//        String value = "lele01";
//        char[] password = value.toCharArray();
//        ManagementPassword managementPassword = new ManagementPassword("lele", password);
//
//        assertEquals(false, managementPassword.isPasswordCorrect(),
//                ErrorCodeEnum.PASSWORD_HAS_NOT_UPPER_CASE.getMessage());
//    }
//
//    @Test
//    public void registrationPasswordUguali() {
//        String value01 = "Lele01";
//        char[] password = value01.toCharArray();
//
//        String value02 = "Lele02";
//        char[] passwordConfirm = value02.toCharArray();
//        ManagementPassword managementPassword = new ManagementPassword("lele", password, passwordConfirm);
//
//        assertEquals(false, managementPassword.isPasswordCorrect(),
//                ErrorCodeEnum.PASSWORD_DOES_NOT_MATCH.getMessage());
//    }
//
//    public void userIsEmpty() {
//        String value = "Lele01";
//        char[] password = value.toCharArray();
//
//        ManagementPassword managementPassword = new ManagementPassword(
//                "", password);
//        assertEquals(false, managementPassword.isPasswordCorrect(),
//                ErrorCodeEnum.USER_EMPTY.getMessage());
//    }

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
        System.out.println(result+ ">> Test: "+info.getDisplayName());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
