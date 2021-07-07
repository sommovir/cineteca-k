/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.prova.logic;

import it.lule.cineteca.logic.entities.FilmDirectorEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lele
 */
public class FakeManagerFilmDirectorDB {
    private List <FilmDirectorEntity> filmDirecotrs = new ArrayList<>();

    public List<FilmDirectorEntity> getFilmDirecotrs() {
        return filmDirecotrs;
    }

    public void setFilmDirecotrs(List<FilmDirectorEntity> filmDirecotrs) {
        this.filmDirecotrs = filmDirecotrs;
    }
    
    public void addFilmDirecotrs(FilmDirectorEntity filmDirecotr) {
        this.filmDirecotrs.add(filmDirecotr);
    }
    
    
}
