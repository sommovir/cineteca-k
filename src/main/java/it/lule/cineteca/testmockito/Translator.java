/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.testmockito;

import java.util.Map;

/**
 *
 * @author sommovir
 */
public class Translator {

    private FileReader reader;

    public Translator(FileReader reader) {
        this.reader = reader;
    }
    
    
    public String translate(String word){
        
        Map<String, String> dizionario = reader.getParole();
        //   dog    cane
        //   cat    gatto
        //   fish   pesce
        
        return dizionario.get(word);
        
    }
    
    
    
}
