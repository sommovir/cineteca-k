/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import it.lule.cineteca.testmockito.FileReader;
import it.lule.cineteca.testmockito.Server;
import it.lule.cineteca.testmockito.Translator;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

/**
 *
 * @author sommovir
 */
public class TestMockito {
    
    private static  Map<String, String> dizionario = new HashMap<>();
    
    public TestMockito() {
    }

    @BeforeAll
    public static void setUpClass() {
        dizionario.put("dog", "cane");
        dizionario.put("cat", "gatto");
        dizionario.put("fish", "pesce");
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
    public void testTranslator(){
        //FileReader reader = new FileReader("boh");
        FileReader mock = mock(FileReader.class);
        
        when(mock.getParole()).thenReturn(dizionario);
        
        
        
        Translator translator = new Translator(mock);
        String dogTraslated = translator.translate("dog");
        
        assertEquals("cane",dogTraslated, "dog in italiano si dice cane..");
    }
    
    @Test
    public void testSum(){

        //Server server = new Server();
        //Assumptions.assumeTrue(server.isConnected());
        
        Server serverMock = spy(Server.class);
        when(serverMock.isConnected()).thenReturn(true);
        
        int nove = serverMock.sum(4, 5);
        
        assertEquals(9, nove, "vedi che 4+5 = 9");
    }
    
    
}
