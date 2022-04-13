/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import it.lule.cineteca.logic.enumname.ErrorCodeEnum;
import it.lule.cineteca.logic.password.ManagementPassword;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lele
 */
public class ManagementPasswordTest {

    public ManagementPasswordTest() {
    }

    @Test
    public void loginPasswordCorretta() {
        String value = "Lele01";
        char[] password = value.toCharArray();
        ManagementPassword managementPassword = new ManagementPassword("lele", password);
        assertEquals(true, managementPassword.isPasswordCorrect(), "Password corretta");
    }

    @Test
    public void loginPasswordLunga() {
        String value = "Lele0ddfdfdfdfdfdfd";
        char[] password = value.toCharArray();
        ManagementPassword managementPassword = new ManagementPassword(
                value, password);
        assertEquals(false, managementPassword.isPasswordCorrect(),
                ErrorCodeEnum.PASSWORD_TOO_LONG.getMessage());
    }

    @Test
    public void loginPasswordCorta() {
        String value = "Le";
        char[] password = value.toCharArray();
        ManagementPassword managementPassword
                = new ManagementPassword("lele", password);

        assertEquals(false, managementPassword.isPasswordCorrect(),
                ErrorCodeEnum.PASSWORD_TOO_SHORT.getMessage());
    }

    @Test
    public void loginPasswordSenzaMaiuscole() {
        String value = "lele01";
        char[] password = value.toCharArray();
        ManagementPassword managementPassword = new ManagementPassword("lele", password);

        assertEquals(false, managementPassword.isPasswordCorrect(),
                ErrorCodeEnum.PASSWORD_HAS_NOT_UPPER_CASE.getMessage());
    }

    @Test
    public void registrationPasswordUguali() {
        String value01 = "Lele01";
        char[] password = value01.toCharArray();

        String value02 = "Lele02";
        char[] passwordConfirm = value02.toCharArray();
        ManagementPassword managementPassword = new ManagementPassword("lele", password, passwordConfirm);

        assertEquals(false, managementPassword.isPasswordCorrect(),
                ErrorCodeEnum.PASSWORD_DOES_NOT_MATCH.getMessage());
    }

    public void userIsEmpty() {
        String value = "Lele01";
        char[] password = value.toCharArray();

        ManagementPassword managementPassword = new ManagementPassword(
                "", password);
        assertEquals(false, managementPassword.isPasswordCorrect(),
                ErrorCodeEnum.USER_EMPTY.getMessage());
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
