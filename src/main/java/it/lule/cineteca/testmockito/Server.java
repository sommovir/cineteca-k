/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.testmockito;

/**
 *
 * @author sommovir
 */
public class Server {

    public Server() {
    }
    
    
    public boolean isConnected(){
        //...
        return false;
    }
    
    public int sum(int a, int b){
        if(isConnected()){
            return a+b;
        }else{
            return -1;
        }
    }
    
}
