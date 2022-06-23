/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.example;

/**
 *
 * @author Luca
 */
public class Acronym extends Word{
    
    private String fullword;

    public Acronym(String fullword, String word) {
        super(word);
        this.fullword = fullword;
    }

    public String getFullword() {
        return fullword;
    }

    public void setFullword(String fullword) {
        this.fullword = fullword;
    }
    
    
    
}
