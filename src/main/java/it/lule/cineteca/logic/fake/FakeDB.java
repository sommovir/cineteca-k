/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.fake;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lele
 */
public class FakeDB {

    private List< FakeFilmDirector> fakeFilmDirectors = new ArrayList<>();

    private FakeFilmDirector fakeFilmDirector = new FakeFilmDirector();
    private FakeMovie fakeMovie = new FakeMovie();

    private static FakeDB instance = null;
    private static int j = 0;
    public static FakeDB getInstance() {
        if (instance == null) {
            instance = new FakeDB();
        }
        return instance;
    }

    public FakeDB() {
        for (int i = 0; i < 3; i++) {
            filmDirectorDB(i);
            for (int j = 0; j < 3; j++) {
                movieDB();
                fakeFilmDirector.addFakeMovies(fakeMovie);
                fakeMovie = new FakeMovie();
            }
            fakeFilmDirectors.add(fakeFilmDirector);
            fakeFilmDirector = new FakeFilmDirector();
        }
        System.out.println("");
    }

    public void initDB() {

    }

    private void filmDirectorDB(int i) {
        
        fakeFilmDirector.setName(i + " - Director Name");
        fakeFilmDirector.setSurname(i + " - Director Surname");
    }

    private void movieDB() {
        j++;

        fakeMovie.setMainActor(j + " - MainActor");
        fakeMovie.setOriginalTitle(j + " - OriginalTitle");
    }

    public List<FakeFilmDirector> getFakeFilmDirectors() {
        return fakeFilmDirectors;
    }

    public FakeFilmDirector getFakeFilmDirector() {
        return fakeFilmDirector;
    }

    public FakeMovie getFakeMovie() {
        return fakeMovie;
    }

}
