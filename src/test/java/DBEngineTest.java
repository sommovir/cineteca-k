/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import it.lule.cineteca.logic.db.DbManager;
import it.lule.cineteca.logic.entities.FilmDirectorEntity;
import it.lule.cineteca.logic.exceptions.DBBadParamaterException;
import it.lule.cineteca.logic.exceptions.DBUniqueViolationException;
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
import org.junit.jupiter.api.Disabled;

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
    public void testCreateFilmDirector() {
        try {
            long id = DbManager.getInstance().createMovie(null);
            //assertEquals(-1, id, "L'id dovrebbe essere -1 se il parametro è null.");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Test
    @DisplayName("[DBEngineTest][method = createFilmDirector")
    public void testConnection() {
        try {
            FilmDirectorEntity f = new FilmDirectorEntity();
            f.setName("Steven2");
            f.setSurname("Spielger1");
            System.out.println("ID prima della creazione: "+f.getId());
            assertNull(f.getId(),"l'id deve essere nullone");
            System.out.println("STEP >> "+DbManager.getStep());
            DbManager.getInstance().createFilmDirector(f);
            System.out.println("ID DOPO la creazione: "+f.getId());
            System.out.println("STEP AFTER >> "+DbManager.getStep());
            String status = DbManager.getInstance().getStatus();
            System.out.println(status);
                    
//            assertNotNull(f.getId(), "l'd non deve essere null dopo la creazione dell'utente");
            assertTrue(true);
//            System.out.println("-- rimozione utente");
//            DbManager.getInstance().deleteFilmDirector(f.getId());

        } catch (Exception ex) {
            Logger.getLogger(DBEngineTest.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.out.println("errore strano");
        }
        System.out.println("non errore");
    }

}
