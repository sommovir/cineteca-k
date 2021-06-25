/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.prova.logic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lele
 */
public class FakeManagerFilmDirectorDB {
    private List <FilmDirector> filmDirecotrs = new ArrayList<>();

    public List<FilmDirector> getFilmDirecotrs() {
        return filmDirecotrs;
    }

    public void setFilmDirecotrs(List<FilmDirector> filmDirecotrs) {
        this.filmDirecotrs = filmDirecotrs;
    }
    
    public void addFilmDirecotrs(FilmDirector filmDirecotr) {
        this.filmDirecotrs.add(filmDirecotr);
    }
    
    
}
