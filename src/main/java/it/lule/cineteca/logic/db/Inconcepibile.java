/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db;

/**
 *
 * @author sommovir
 */
public class Inconcepibile {
    
    private static Inconcepibile _instance = null;
    
    public static Inconcepibile getInstance() {
        if (_instance == null) {
            _instance = new Inconcepibile();
        }
        return _instance;
    }
    
    private Inconcepibile() {
        super();
        System.out.println("[INCONC] Sono dentro");
    }
    
    public String strano(){
        return "cose strane";
    }
    
}
