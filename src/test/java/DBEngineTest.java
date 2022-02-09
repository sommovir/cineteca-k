/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import it.lule.cineteca.logic.db.DbManager;
import it.lule.cineteca.logic.exceptions.DBBadParamaterException;
import it.lule.cineteca.utils.test.ConditionToExecute;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

/**
 *
 * @author Luca
 */
@TestMethodOrder(MethodOrderer.Alphanumeric.class)
@ConditionToExecute(classToCheck = DbManager.class)
public class DBEngineTest {

    private String message;
    private String result;
    private static final String BREAKLINE = "\n---------------------------------------------------------------------------------------------------";

    public DBEngineTest() {
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
    @DisplayName("[DBEngineTest][method = createFilmDirector")
    public void testCreateFilmDirector(){
        try {
            long id = DbManager.getInstance().createMovie(null);
            assertEquals(-1, id,"L'id dovrebbe essere -1 se il parametro è null.");
        } catch (DBBadParamaterException ex) {
            Logger.getLogger(DBEngineTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}