/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import it.lule.cineteca.logic.db.DbManager;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import it.lule.cineteca.logic.db.entities.FilmDirectorEntity;
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

//    @Test
    @DisplayName("[DBEngineTest][method = createFilmDirector")
    public void testCreateFilmDirector() {
//        try {
//            long id = DbManager.getInstance().createMovie(null);
//            //assertEquals(-1, id, "L'id dovrebbe essere -1 se il parametro è null.");
//            
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }

    @Test
    @DisplayName("[DBEngineTest][method = createFilmDirector")
    public void testConnection() {
        try {
              FilmDirectorEntity f = new FilmDirectorEntity();
            f.setName("Steven"+(new Date().getTime()));
            f.setSurname("Spielger1"+(new Date().getTime()));
            System.out.println("ID prima della creazione: "+f.getId());
            assertNull(f.getId(),"l'id deve essere nullone");
            DbManager.getInstance().createFilmDirector(f);
            System.out.println("ID DOPO la creazione: "+f.getId());
            String status = DbManager.getInstance().getStatus();
            System.out.println(status);
                    
            Long id = f.getId();
            assertNotNull(id, "l'd non deve essere null dopo la creazione dell'utente");
            assertTrue(true);
            System.out.println("-- rimozione utente");
            DbManager.getInstance().deleteFilmDirector(f.getId());
            FilmDirectorEntity filmDirectorById = DbManager.getInstance().getFilmDirectorById(id);
            assertNull(filmDirectorById, "dovrebbe essere stato cancellato: "+id);

        } catch (Exception ex) {
            Logger.getLogger(DBEngineTest.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.out.println("errore strano");
        }
        System.out.println("non errore");
    }

}
