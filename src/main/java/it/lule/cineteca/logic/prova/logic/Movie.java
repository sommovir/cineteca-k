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
public class Movie {
    private Long id;
    private String titoloTradotto;
    private String originalTitle;    
    private Date releaseDate;
    private String mainActor;

    public Movie() {
    }
     
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitoloTradotto() {
        return titoloTradotto;
    }

    public void setTitoloTradotto(String titoloTradotto) {
        this.titoloTradotto = titoloTradotto;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    
}
