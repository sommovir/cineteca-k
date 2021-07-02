/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.prova.logic;

import java.util.Date;

/**
 *
 * @author lele
 */
public class FilmDirectorEntity {

    private Long id;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private MovieEntity film;

    public FilmDirectorEntity() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public MovieEntity getFilm() {
        return film;
    }

    public void setFilm(MovieEntity film) {
        this.film = film;
    }

    
}
