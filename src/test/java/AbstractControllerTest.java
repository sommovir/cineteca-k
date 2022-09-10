/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import it.lule.cineteca.logic.db.entities.CUserEntity;
import it.lule.cineteca.logic.enumname.ErrorCodeEnum;
import it.lule.cineteca.logic.exceptions.abstractControllerException.CreateException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.FindException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.IsNullException;
import it.lule.cineteca.logic.db.controller.CUserController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author Luca
 */
public class AbstractControllerTest {

    private final String abstractControllerTest = " [RegistrationTest] ";

    public AbstractControllerTest() {
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

    @Test
    @DisplayName(abstractControllerTest + "Not vadide")
    public void valide() {

    }

//    @Test
    @Deprecated
    @DisplayName(abstractControllerTest + " FindEntity")
    public void FindEntity() throws IsNullException, FindException {
//        String value = "Lele";
//        CUserController userController = new CUserController();
//        CUserEntity userEntity = new CUserEntity();
////        userEntity = userController.getFind(value);
//        assertEquals(value, userEntity.getUser(), "Valore inaspettato ");
    }

    @Test
    @DisplayName(abstractControllerTest + "Not vadide")
    @Deprecated
    public void create() {
//        String value = "Lele";
//        String password = "password";
//        CreateException exception = Assertions.assertThrows(
//                CreateException.class, new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                CUserController userController = new CUserController();
//                CUserEntity userEntity = new CUserEntity();
//                userEntity.setUser(value);
//                userEntity.setPassword(password);
//            }
//        }, "mi aspettavo che lanciasse un'eccezione");
//        
//        assertEquals(ErrorCodeEnum.DB_CREATE, exception.getErrorCode(),
//                "Mi aspettavo l'errore: " + ErrorCodeEnum.PASSWORD_TOO_SHORT);
    }

    @Test
    @DisplayName(abstractControllerTest + "Not vadide")
    public void edit() {

    }

    @Test
    @DisplayName(abstractControllerTest + "Not vadide")
    public void getId() {

    }

}
