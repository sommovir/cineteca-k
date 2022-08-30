/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.leleDB.logicDb.prova;

/**
 *
 * @author lele
 */
public class Classe0<C> {
    private String nome;
    private String Cognome;

    public Classe0(String nome, String Cognome) {
        this.nome = nome;
        this.Cognome = Cognome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String Cognome) {
        this.Cognome = Cognome;
    }   
    
    public void generico(C value){
        if ( value instanceof Classe3){
            System.out.println("ok");
//            (Classe3) value = new Classe3();
        }
//        Class<? extends Object> aClass = value.getClass();
    }
}
