/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.db;

import it.lule.cineteca.logic.entities.FilmDirectorEntity;
import it.lule.cineteca.logic.entities.MovieEntity;
import it.lule.cineteca.logic.exceptions.DBBadParamaterException;
import it.lule.cineteca.logic.exceptions.DBUniqueViolationException;
import java.util.List;
import javax.persistence.PersistenceException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.exception.ConstraintViolationException;

/**
 * setup
 * @author sommovir
 */
public class DbManager {

    private static DbManager _instance = null;
    private SessionFactory sessionFactory;

    public static DbManager getInstance() {
        if (_instance == null) {
            _instance = new DbManager();
        }
        return _instance;
    }

    private DbManager() {
        super();
    }

    public long createFilmDirector(FilmDirectorEntity regista) throws DBUniqueViolationException, DBBadParamaterException {
        if (regista == null) {
            return -1;
        }
        if (regista.getName().isEmpty()) {
            throw new DBBadParamaterException("nome", DBBadParamaterException.ErrorType.EMPTY);
        }
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        try {
            session.persist(regista);
        } catch (PersistenceException ex) {
            if (ex.getCause() instanceof ConstraintViolationException) {
                throw new DBUniqueViolationException("Regista.nome");
            }
            System.out.println("EXCEPTION CAUSE = " + ex.getCause().getClass().getCanonicalName());
            ex.printStackTrace();
        }
        session.getTransaction().commit();
        session.close();
        return regista.getId();
    }
    
     public long createMovie(MovieEntity movie) throws DBBadParamaterException {
        if (movie == null) {
            return -1;
        }
        if (movie.getOriginalTitle().isEmpty()) {
            throw new DBBadParamaterException("originalTitle", DBBadParamaterException.ErrorType.EMPTY);
        }
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        session.persist(movie);

        session.getTransaction().commit();
        session.close();
        return movie.getId();
    }

    public void deleteFilmDirector(long idRegista) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        FilmDirectorEntity spacciato = new FilmDirectorEntity();
        spacciato.setId(idRegista);
        session.delete(spacciato);

        session.getTransaction().commit();
        session.close();
    }
    
    public void deleteMovie(long idMovie) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        MovieEntity spacciato = new MovieEntity();
        spacciato.setId(idMovie);
        session.delete(spacciato);

        session.getTransaction().commit();
        session.close();
    }

    public FilmDirectorEntity editFilmDirector(FilmDirectorEntity filmDirectorToEdit) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        FilmDirectorEntity mergedPerson = (FilmDirectorEntity) session.merge(filmDirectorToEdit);

        session.getTransaction().commit();
        session.close();
        return mergedPerson;
    }
    
    public MovieEntity editMovie(MovieEntity filmToEdit) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        MovieEntity mergedPerson = (MovieEntity) session.merge(filmToEdit);

        session.getTransaction().commit();
        session.close();
        return mergedPerson;
    }

    public FilmDirectorEntity getFilmDirectorById(long idFD) {
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        FilmDirectorEntity found = session.find(FilmDirectorEntity.class, idFD);

        session.getTransaction().commit();
        session.close();
        
        return found;
    }
    
    public MovieEntity getMovieById(long idm) {
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        MovieEntity found = session.find(MovieEntity.class, idm);

        session.getTransaction().commit();
        session.close();
        
        return found;
    }

    public List<FilmDirectorEntity> getAllFilmDirectors() {
        System.out.println("[DB]" + "fetching data.. [select * from filmdirector]");
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<FilmDirectorEntity> result = session.createQuery("from filmdirector", FilmDirectorEntity.class).list();

        session.getTransaction().commit();
        session.close();

        return result;

    }
    
    public List<MovieEntity> getAllMovies() {
        System.out.println("[DB]" + "fetching data.. [select * from movie]");
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<MovieEntity> result = session.createQuery("from movie", MovieEntity.class).list();

        session.getTransaction().commit();
        session.close();

        return result;

    }

}
