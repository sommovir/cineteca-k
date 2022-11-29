/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db;

import it.lule.cineteca.logic.db.controller.DBCUserController;
import it.lule.cineteca.logic.db.controller.DBSetupController;
import it.lule.cineteca.logic.db.entities.CUserEntity;
import it.lule.cineteca.logic.db.entities.SetupEntity;
import it.lule.cineteca.logic.db.entities.SetupKeys;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author lele
 */
public class DbManager {

    private SessionFactory sessionFactory = null;
    private static DbManager instance = null;

    public static DbManager getInstance() {
        if (instance == null) {
            instance = new DbManager();
        }
        return instance;
    }

    public DbManager() {
        //initConnection();
    }

    public void init() {
        initConnection();
    }

    private void initConnection() {
        if (sessionFactory == null) {

            try {
                // configures settings from hibernate.cfg.xml
                StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

                sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                SetupEntity installedSetup = DBSetupController.getInstance().getEntityById(SetupEntity.class, SetupKeys.INSTALLED.getId());
                if (installedSetup == null || !installedSetup.getValue().equals("DONE")) {
                    //salvare le cose che vuoi mettere in installazione

                    CUserEntity cUserEntity = new CUserEntity("gino", "gino");
                    DBCUserController.getInstance().createEntity(cUserEntity);
                    System.out.println("[INFO] creazione utente gino.. [DONE]");

                    installedSetup.setValue("DONE");
                    DBSetupController.getInstance().editEntity(installedSetup);
                }
            } catch (DBAbstractControllerException ex) {
                Logger.getLogger(DbManager.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("[CRITICAL] initialization of database failed. ");
            }
        }

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

//    private SessionFactory sessionFactory = null;
//    private static DbManager instance = null;
//
//    private static DbManager _instance = null;
//    private boolean installed = false;
//    private StandardServiceRegistry registry= null;
//
//    /**
//     *
//     * @return
//     */
//    public static DbManager getInstance() {
//        if (instance == null) {
//            instance = new DbManager();
//        }
//        return instance;
//    }
//
//    public void status() {
//        System.out.println("SessionFactory: " + (this.sessionFactory == null ? "FAIL" : "OPERATIVE"));
//        System.out.println("DB Installed: " + (!installed ? "FAIL" : "OPERATIVE"));
//    }
//
//    public String getStatus() {
//        String status = "=================== STATUS =================\n";
//        status += ("SessionFactory: " + (this.sessionFactory == null ? "FAIL" : "OPERATIVE")) + "\n";
//        status += ("DB Installed: " + (!installed ? "FAIL" : "OPERATIVE")) + "\n";
//        status += "============================================\n";
//        return status;
//    }
//
//    private DbManager() {
//        super();
//        System.out.println("costruttore di DbManager");
//        initConnection();
//        System.out.println("è installato ? " + installed);
//        if (sessionFactory == null) {
//            System.out.println("session nullone");
//        } else {
//            System.out.println("Session ok.");
//        }
//    }
//
//    private void initConnection() {
//        try {
//            System.out.println("provo a costruire la connessione..");
//            // configures settings from hibernate.cfg.xml 
//            registry = new StandardServiceRegistryBuilder().configure().build();
//
//            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//            installed = true;
//        } catch (Exception e) {
//            // handle the exception
//            throw e;
//        }
//    }
//
//    /**
//     *
//     * @param regista
//     * @return
//     * @throws DBUniqueViolationException
//     * @throws DBBadParamaterException
//     */
//    public long createFilmDirector(FilmDirectorEntity regista) throws DBUniqueViolationException, DBBadParamaterException {
//        if (regista == null) {
//            System.out.println("Regista NULLONE");
//            return -1;
//        }
//        System.out.println("[DB][INFO] regista not null");
//        if (regista.getName().isEmpty()) {
//            throw new DBBadParamaterException("nome", DBBadParamaterException.ErrorType.EMPTY);
//        }
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        System.out.println("[DB][INFO] Begin Transnaction");
//
//        try {
//            session.persist(regista);
//        } catch (Throwable ex) {
//            if (ex.getCause() instanceof ConstraintViolationException) {
//                throw new DBUniqueViolationException("Regista.nome");
//            }
//            System.out.println("EXCEPTION CAUSE = " + ex.getCause().getClass().getCanonicalName());
//            ex.printStackTrace();
//        }
//        session.getTransaction().commit();
//        session.close();
//        System.out.println("[DB][INFO] End Transnaction");
//        return regista.getId();
//    }
//
//    /**
//     *
//     * @param movie
//     * @return
//     * @throws DBBadParamaterException
//     */
//    public long createMovie(MovieEntity movie) throws DBBadParamaterException {
//        if (movie == null) {
//            return -1;
//        }
//        if (movie.getOriginalTitle().isEmpty()) {
//            throw new DBBadParamaterException("originalTitle", DBBadParamaterException.ErrorType.EMPTY);
//        }
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        session.persist(movie);
//        return movie.getId();
//    }
//
//    /**
//     *
//     * @param idRegista
//     */
//    public void deleteFilmDirector(long idRegista) {
//
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        FilmDirectorEntity spacciato = new FilmDirectorEntity();
//        spacciato.setId(idRegista);
//        session.delete(spacciato);
//
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    /**
//     *
//     * @param idMovie
//     */
//    public void deleteMovie(long idMovie) {
//
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        MovieEntity movieEntity = new MovieEntity();
//        movieEntity.setId(idMovie);
//        session.delete(movieEntity);
//
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    /**
//     *
//     * @param filmDirectorToEdit
//     * @return
//     */
//    public FilmDirectorEntity editFilmDirector(FilmDirectorEntity filmDirectorToEdit) {
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        String ciao = ";";
//        FilmDirectorEntity mergedPerson = (FilmDirectorEntity) session.merge(filmDirectorToEdit);
//        String aa = (String) session.merge(ciao);
//        System.out.println("oggetto mergiato: "+aa);
//        session.getTransaction().commit();
//        session.close();
//        return mergedPerson;
//    }
//
//    public <T> T edit(T entity) {
//
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        T mergedEntity = (T) session.merge(entity);
//        session.getTransaction().commit();
//        session.close();
//        return mergedEntity;
//    }
//
//    /**
//     *
//     * @param filmToEdit
//     * @return
//     */
//    public MovieEntity editMovie(MovieEntity filmToEdit) {
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        MovieEntity mergedPerson = (MovieEntity) session.merge(filmToEdit);
//
//        session.getTransaction().commit();
//        session.close();
//        return mergedPerson;
//    }
//
//    /**
//     *
//     * @param idFD
//     * @return
//     */
//    public FilmDirectorEntity getFilmDirectorById(long idFD) {
//
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        FilmDirectorEntity found = session.find(FilmDirectorEntity.class, idFD);
//
//        session.getTransaction().commit();
//        session.close();
//
//        return found;
//    }
//
//    /**
//     *
//     * @param idm
//     * @return
//     */
//    public MovieEntity getMovieById(long idm) {
//
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        MovieEntity found = session.find(MovieEntity.class, idm);
//
//        session.getTransaction().commit();
//        session.close();
//
//        return found;
//    }
//
//    /**
//     *
//     * @return
//     */
//    public List<FilmDirectorEntity> getAllFilmDirectors() {
//        System.out.println("[DB]" + "fetching data.. [select * from filmdirector]");
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        List<FilmDirectorEntity> result = session.createQuery("from filmdirector", FilmDirectorEntity.class).list();
//
//        session.getTransaction().commit();
//        session.close();
//
//        return result;
//
//    }
//
//    /**
//     *
//     * @return
//     */
//    public List<MovieEntity> getAllMovies() {
//        System.out.println("[DB]" + "fetching data.. [select * from movie]");
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        List<MovieEntity> result = session.createQuery("from movie", MovieEntity.class).list();
//
//        session.getTransaction().commit();
//        session.close();
//
//        return result;
//
//    }
//
//    public SessionFactory getSessionFactory(){
//        return sessionFactory;
//    }
}
