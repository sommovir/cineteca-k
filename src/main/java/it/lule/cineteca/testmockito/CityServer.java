/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.testmockito;

/**
 *
 * @author Luca
 */
public class CityServer {
    
    
    public void connect(){
        
    }
    
    public boolean isConnected(){
//        //..
        return false;
    }
    
    public boolean isCityExisting(String city){
        if(isConnected()){
            if(city.equals("Roma") || city.equals("Milano")){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
}
