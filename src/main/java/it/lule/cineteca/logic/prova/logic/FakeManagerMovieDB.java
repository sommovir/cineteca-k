/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.prova.logic;

import it.lule.cineteca.logic.entities.MovieEntity;
import java.util.ArrayList;
import java.util.List;

/**
 * @deprecated 
 * @author lele
 */
public class FakeManagerMovieDB {
    private List <MovieEntity> movies = new ArrayList<>();

    public List<MovieEntity> getMovies() {
        return movies;
    }

    public void setMovies(List<MovieEntity> movies) {
        this.movies = movies;
    }
    
    public void addMovies(MovieEntity movie) {
        this.movies.add(movie);
    }    
}
