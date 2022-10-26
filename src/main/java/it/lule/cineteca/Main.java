/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca;


import it.lule.cineteca.logic.db.DbManager;
import it.lule.cineteca.logic.db.entities.FilmDirectorEntity;
import it.lule.cineteca.logic.exceptions.dbException.dbInstalled.DBBadParamaterException;
import it.lule.cineteca.logic.exceptions.dbException.dbInstalled.DBUniqueViolationException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

import it.lule.cineteca.gui.user.UserDialog;

/**
 * https://app.gitkraken.com/glo/board/YfUy5R128ABI_uSA
 * test
 * @author sommovir
 */
public class Main {

    public final static String VERSION = "0.1";

    /**
     *
     * @return
     * nicely printed version
     */
    public static String getVersion(){
        return "v."+VERSION;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Cineteka! [v."+VERSION+"]");
        if (args.length == 1) {
            if ("-tdb".equals(args[0])) {
                System.out.println("[INFO] testing database.. ");
                FilmDirectorEntity f = new FilmDirectorEntity();
                f.setName("Steven");
                f.setSurname("Spielger");
                try {
                    DbManager.getInstance().createFilmDirector(f);
                    System.out.println("[INFO]  film director saved with id: " + f.getId());
                } catch (DBUniqueViolationException | DBBadParamaterException ex) {
                    System.out.println("[FAIL] error in database..");
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
            }else{
                System.out.println("comando sconosciuto: "+args[0]);
            }
        } else {
            System.out.println("[Cineteka-k] Welcome ! " + getVersion());
            UserDialog dialog = new UserDialog(new JFrame(), true);

            /* io ricordavo JFrame.EXIT_ON_CLOSE */
            dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            dialog.dispose();
            dialog.setLocationRelativeTo(dialog);
            dialog.setVisible(true);

            System.out.println("[Cineteka-k] closing..");
        }

    }

}
