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
import it.lule.cineteca.utils.test.Tested;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author sommovir
 */
@Tested(name = "DbManager", testEnabled = true)
public class DbManager {

    private static DbManager _instance = null;
    private SessionFactory sessionFactory;
    private boolean installed = false;

    /**
     *
     * @return
     */
    public static DbManager getInstance() {
        if (_instance == null) {
            _instance = new DbManager();
        }
        return _instance;
    }
    
    public void status(){
        System.out.println("SessionFactory: "+(this.sessionFactory == null ? "FAIL" : "OPERATIVE"));
        System.out.println("DB Installed: "+(!installed ? "FAIL" : "OPERATIVE"));
        System.out.println("SessionFactory: "+(this.sessionFactory == null ? "FAIL" : "OPERATIVE"));
    }

    private DbManager() {
        super();
        System.out.println("costruttore di DbManager");
        initConnection();
        System.out.println("è installato ? "+installed);
        if(sessionFactory == null){
            System.out.println("session nullone");
        }else{
            System.out.println("Session ok.");
        }
    }

    private void initConnection() {
        System.out.println("provo a costruire la connessione..");

        // configures settings from hibernate.cfg.xml 
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            installed = true;
//             SessionFactory sessionFactory = new Configuration()
//    .configure("/org/nitish/caller/hibernate.cfg.xml").buildSessionFactory();
        } catch (Exception e) {
            // handle the exception
            e.printStackTrace();
        }
    }

    /**
     *
     * @param regista
     * @return
     * @throws DBUniqueViolationException
     * @throws DBBadParamaterException
     */
    public long createFilmDirector(FilmDirectorEntity regista) throws DBUniqueViolationException, DBBadParamaterException {
        try {
            if (regista == null) {
                System.out.println("Regista NULLONE");
                return -1;
            }
            System.out.println("[DB][INFO] regista not null");
            if (regista.getName().isEmpty()) {
                throw new DBBadParamaterException("nome", DBBadParamaterException.ErrorType.EMPTY);
            }
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            System.out.println("[DB][INFO] Begin Transnaction");

            try {
                session.persist(regista);
            } catch (Throwable ex) {
                if (ex.getCause() instanceof ConstraintViolationException) {
                    throw new DBUniqueViolationException("Regista.nome");
                }
                System.out.println("EXCEPTION CAUSE = " + ex.getCause().getClass().getCanonicalName());
                ex.printStackTrace();
            }
            session.getTransaction().commit();
            session.close();
            System.out.println("[DB][INFO] End Transnaction");
        } catch (Throwable ex) {
            System.out.println("[DB][ERROR] Gigachad errors: "+ex.getMessage());
            ex.printStackTrace();
        }
        return regista.getId();
    }

    /**
     *
     * @param movie
     * @return
     * @throws DBBadParamaterException
     */
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

    /**
     *
     * @param idRegista
     */
    public void deleteFilmDirector(long idRegista) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        FilmDirectorEntity spacciato = new FilmDirectorEntity();
        spacciato.setId(idRegista);
        session.delete(spacciato);

        session.getTransaction().commit();
        session.close();
    }

    /**
     *
     * @param idMovie
     */
    public void deleteMovie(long idMovie) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        MovieEntity spacciato = new MovieEntity();
        spacciato.setId(idMovie);
        session.delete(spacciato);

        session.getTransaction().commit();
        session.close();
    }

    /**
     *
     * @param filmDirectorToEdit
     * @return
     */
    public FilmDirectorEntity editFilmDirector(FilmDirectorEntity filmDirectorToEdit) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String ciao =";";
        FilmDirectorEntity mergedPerson = (FilmDirectorEntity) session.merge(filmDirectorToEdit);
        String aa = (String) session.merge(ciao);

        session.getTransaction().commit();
        session.close();
        return mergedPerson;
    }
    
    
     public <T> T edit(T entity) {
         
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        T mergedEntity = (T) session.merge(entity);
        session.getTransaction().commit();
        session.close();
        return mergedEntity;
    }
    
    /**
     *
     * @param filmToEdit
     * @return
     */
    public MovieEntity editMovie(MovieEntity filmToEdit) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        MovieEntity mergedPerson = (MovieEntity) session.merge(filmToEdit);

        session.getTransaction().commit();
        session.close();
        return mergedPerson;
    }

    /**
     *
     * @param idFD
     * @return
     */
    public FilmDirectorEntity getFilmDirectorById(long idFD) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        FilmDirectorEntity found = session.find(FilmDirectorEntity.class, idFD);

        session.getTransaction().commit();
        session.close();

        return found;
    }

    /**
     *
     * @param idm
     * @return
     */
    public MovieEntity getMovieById(long idm) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        MovieEntity found = session.find(MovieEntity.class, idm);

        session.getTransaction().commit();
        session.close();

        return found;
    }

    /**
     *
     * @return
     */
    public List<FilmDirectorEntity> getAllFilmDirectors() {
        System.out.println("[DB]" + "fetching data.. [select * from filmdirector]");
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<FilmDirectorEntity> result = session.createQuery("from filmdirector", FilmDirectorEntity.class).list();

        session.getTransaction().commit();
        session.close();

        return result;

    }

    /**
     *
     * @return
     */
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
