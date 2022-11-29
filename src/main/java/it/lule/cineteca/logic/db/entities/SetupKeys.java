/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.entities;

/**
 *
 * @author Luca
 */
public enum SetupKeys {
    INSTALLED(1L),
    VERSION(2L);

    private SetupKeys(long id) {
        this.id = id;
    }
    
    private long id;

    public long getId() {
        return id;
    }
}
