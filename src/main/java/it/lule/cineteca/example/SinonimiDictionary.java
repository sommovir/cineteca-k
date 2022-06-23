/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Luca
 */
public class SinonimiDictionary {
    
    private Map<String, List<? extends Word>> dictionary = new HashMap<>();
    private Map<String, List<Word>> limitedDictionary = new HashMap<>();

    private static SinonimiDictionary _instance = null;
    
    public static SinonimiDictionary getInstance() {
        if (_instance == null) {
            _instance = new SinonimiDictionary();
        }
        return _instance;
    }
    
    private SinonimiDictionary() {
        super();
    }
    
    public void insertSinonimi(Word word, List<? extends Word> sinonimi){
        this.dictionary.put(word.getWord(), sinonimi);
    }
    
    
    public void insertSinonimi_NOT_WORKING_1(Word word, List<Word> sinonimi){
        this.dictionary.put(word.getWord(), sinonimi);
    }
    
    public void insertSinonimi_NOT_WORKING_2(Word word, List<? extends Word> sinonimi){
//        this.limitedDictionary.put(word.getWord(), sinonimi);  //SCOMMENTA QUA
    }
    
    
}
