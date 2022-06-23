/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.example;

/**
 *
 * @author Luca
 */
public class Name extends Word{
    
    private boolean personName; 

    public Name(boolean personName, String word) {
        super(word);
        this.personName = personName;
    }

    public boolean isPersonName() {
        return personName;
    }

    public void setPersonName(boolean personName) {
        this.personName = personName;
    }
    
    
    
    
}
