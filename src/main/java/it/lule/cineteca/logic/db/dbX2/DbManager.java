/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.dbX2;

/**
 *
 * @author lele
 */
public class DbManager {
    public FilmDirector filmDirector(){
        FilmDirector filmDirector = new FilmDirector();
        return filmDirector;
    }
    
    public Movie movie(){
        Movie movie = new Movie();
        return movie;
    }
    
    public User user(){
        User user = new User();
        return user;
    }
}
