/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.fake;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lele
 */
public class FakeFilmDirector {
    private List<FakeMovie> fakeMovies = new ArrayList<>();
    
    private String name;
    private String surname;
    private Date dateOfBirth;    

    public FakeFilmDirector() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<FakeMovie> getFakeMovies() {
        return fakeMovies;
    }

    public void setFakeMovies(List<FakeMovie> fakeMovies) {
        this.fakeMovies = fakeMovies;
    }
    
    public void addFakeMovies(FakeMovie fakeMovie) {
        this.fakeMovies.add(fakeMovie);
    }
    
    
}
