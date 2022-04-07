/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import it.lule.cineteca.logic.testLele.ManagementPassword;
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
public class LeleTest {

    public LeleTest() {
    }

    @Test
    public void loginPasswordCorretta() {
        String value = "Lele01";
        char[] password = value.toCharArray();
        ManagementPassword managementPassword = new ManagementPassword("lele", password);
        assertEquals(true, managementPassword.isPasswordCorrect(), "Password corretta");
    }

    @Test
    public void loginPasswordCorta() {
        String value = "Lele0";
        char[] password = value.toCharArray();
        ManagementPassword managementPassword = new ManagementPassword("lele", password);
        assertEquals(true, managementPassword.isPasswordCorrect(), "Password corretta");
    }

    @Test
    public void loginPasswordSenzaMaiuscole() {
        String value = "lele01";
        char[] password = value.toCharArray();
        ManagementPassword managementPassword = new ManagementPassword("lele", password);
        assertEquals(true, managementPassword.isPasswordCorrect(), "Password corretta");
    }

    @Test
    public void registrationPasswordUguali() {
        String value01 = "Lele01";
        char[] password = value01.toCharArray();
        
        String value02 = "Lele02";
        char[] passwordConfirm = value02.toCharArray();
        ManagementPassword managementPassword = new ManagementPassword("lele", password, passwordConfirm);
        assertEquals(true, managementPassword.isPasswordCorrect(), "Password corretta");
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
