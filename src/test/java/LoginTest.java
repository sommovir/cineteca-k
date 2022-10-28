/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import it.lule.cineteca.logic.db.DbManager;
import java.lang.reflect.Field;
import java.util.List;

import it.lule.cineteca.logic.db.entities.MovieEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Luca
 */
@Disabled
public class LoginTest {

//    public LoginTest() {
//    }
//
//    @BeforeAll
//    public static void setUpClass() {
//    }
//
//    @AfterAll
//    public static void tearDownClass() {
//    }
//
//    @BeforeEach
//    public void setUp() {
//    }
//
//    @AfterEach
//    public void tearDown() {
//    }
//
//    private void setMock(DbManager mock) {
//        try {
//            Field instance = DbManager.class.getDeclaredField("_instance");
//            instance.setAccessible(true);
//            instance.set(instance, mock);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Test
//    public void testMock() {
//        DbManager manager = mock(DbManager.class);
//        setMock(manager);
//        when(manager.getAllMovies()).thenReturn(null);
//        List<MovieEntity> prova = DbManager.getInstance().getAllMovies();
//        assertNull(prova);
//        //https://stackoverflow.com/questions/38914433/mocking-a-singleton-with-mockito
//    }

}
