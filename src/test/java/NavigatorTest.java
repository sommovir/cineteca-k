/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import it.lule.cineteca.testmockito.CityServer;
import it.lule.cineteca.testmockito.GoogleMapAPI;
import it.lule.cineteca.testmockito.Navigator;
import it.lule.cineteca.testmockito.Position;
import java.io.PrintStream;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assumptions;
import org.mockito.ArgumentCaptor;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 *
 * @author Luca
 */
public class NavigatorTest {

    public NavigatorTest() {
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
    public void navigatorTest() {

        Navigator navigator = new Navigator();
        GoogleMapAPI googleMapApiMOCK = mock(GoogleMapAPI.class);

        when(googleMapApiMOCK.getPositionOf("Roma")).thenReturn(new Position(10, 2));
        when(googleMapApiMOCK.getPositionOf("Milano")).thenReturn(new Position(19, 2));
        int xDistance = navigator.getXDistance(googleMapApiMOCK, "Roma", "Milano");
        assertEquals(9, xDistance);

    }

    @Test
    public void existenceCityTest() {

        CityServer mockServer = spy(CityServer.class);

        when(mockServer.isConnected()).thenReturn(true);

        boolean cityExisting = mockServer.isCityExisting("Roma");

        assertTrue(cityExisting);

//        Navigator navigator = new Navigator();
//        Assumptions.assumeTrue(server.isConnected());
//        CityServer server = spy(CityServer.class);
//        when(server.isConnected()).thenReturn(true);
//        boolean romaExisting = server.isCityExisting("Roma");
//        
//        assertTrue(romaExisting);
//        
    }

    @Test
    public void testStampaCosa() {
        List<String> lista = List.of("Ciao", "Gino");
        Navigator mock = spy(Navigator.class);
        mock.printThings(lista);
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock, times(lista.size())).save(captor.capture());
        System.out.println("CAPTOR 1: " + captor.getValue());
        System.out.println("CAPTOR 1: " + captor.getValue());
        assertTrue(captor.getAllValues().get(0).equals(lista.get(0)));
        assertTrue(captor.getAllValues().get(1).equals(lista.get(1)));
    }

    @Test
    public void testSave() {

        Navigator mock = spy(Navigator.class);
        mock.save("gino");
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock).connect();
        verify(mock).disconnect(captor.capture());
        assertEquals("ginociao", captor.getValue());

    }

    @Test
    public void testSave2() {

        Navigator mock = spy(Navigator.class);

        List<String> lista = List.of("Cane", "Gatto", "Gino", "Tommasino");
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        mock.salvaTuttoDelonghi(lista);
        verify(mock, times(lista.size())).save(captor.capture());
        
        List<String> tuttiGliArgomenti = captor.getAllValues();
        assertEquals(lista, tuttiGliArgomenti);

    }

}
