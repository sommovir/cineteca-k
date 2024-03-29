/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package it.lule.cineteca.gui.jlist;

import it.lule.cineteca.logic.db.controller.DBMovieController;
import it.lule.cineteca.logic.db.entities.MovieEntity;
import it.lule.cineteca.logic.exceptions.dbException.abstractControllerException.DBAbstractControllerException;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author lele
 */
public class JlistJPanel extends javax.swing.JPanel {

    private MovieEntity movieEntity;

    /**
     * Creates new form JlistJPanel
     */
    public JlistJPanel() {
        initComponents();
        List<MovieEntity> allMovie = getAllMovies();
        if (allMovie != null) {
            for (MovieEntity movie : allMovie) {
                jlistModel1.addElement(movie);
            }

            if (jlistModel1.isEmpty()) {
                disableButtons();
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlistModel1 = new it.lule.cineteca.gui.logic.rm.model.jlistModel();
        jlistRenderer1 = new it.lule.cineteca.gui.logic.rm.renderer.JlistRenderer();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonFavorite = new javax.swing.JButton();
        jButtonAllFilms = new javax.swing.JButton();

        jlistRenderer1.setText("jlistRenderer1");

        jList1.setModel(jlistModel1);
        jList1.setCellRenderer(jlistRenderer1);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jList1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Add");

        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jButtonFavorite.setText("Favorite");
        jButtonFavorite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFavoriteActionPerformed(evt);
            }
        });

        jButtonAllFilms.setText("All Films");
        jButtonAllFilms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllFilmsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFavorite)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAllFilms)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemove)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonRemove)
                    .addComponent(jButtonFavorite)
                    .addComponent(jButtonAllFilms))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed

        List<MovieEntity> selectedValuesList = jList1.getSelectedValuesList();

        for (int i = 0; i <= selectedValuesList.size(); i++) {
            jlistModel1.remove(i);
        }
        /* ----------------------------------------------------------- */
        //        try {
        //
        //            Integer selectedIndex = jList1.getSelectedIndex();
        //
        //            movieEntity = jlistModel1.get(selectedIndex);
        //
        //            DBMovieController.getInstance().deleteMovie(movieEntity);
        //            jlistModel1.remove(selectedIndex);
        //
        //            if (jlistModel1.isEmpty()) {
        //                disableButtons();
        //                return;
        //            }
        //
        //            selectedIndex--;
        //
        //            if (selectedIndex == -1) {
        //                selectedIndex = 0;
        //            }
        //
        //            jList1.setSelectedIndex(selectedIndex);
        //
        //        } catch (DBAbstractControllerException ex) {
        //            Logger.getLogger(JlistJPanel.class.getName()).log(Level.SEVERE, null, ex);
        //        }
        ;

    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonFavoriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFavoriteActionPerformed
        addList(getFavorites());
    }//GEN-LAST:event_jButtonFavoriteActionPerformed

    private void jButtonAllFilmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllFilmsActionPerformed
        addList(getAllMovies());
    }//GEN-LAST:event_jButtonAllFilmsActionPerformed

    private void jList1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseReleased
        jList1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        List<MovieEntity> selectedValuesList = jList1.getSelectedValuesList();

        for (MovieEntity movieEntity1 : selectedValuesList) {
            System.out.println("jList1MouseReleased " + movieEntity1.getOriginalTitle());
        }
        System.out.println("");
    }//GEN-LAST:event_jList1MouseReleased

    private void disableButtons() {
        jButtonRemove.setEnabled(false);
        jButtonFavorite.setEnabled(false);
        jButtonAllFilms.setEnabled(false);
    }

    private List<MovieEntity> getFavorites() {
//        try {
//            return DBMovieController.getInstance().getFavorites();
//        } catch (DBAbstractControllerException ex) {
//            Logger.getLogger(JlistJPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return null;
    }

    private List<MovieEntity> getAllMovies() {
//        try {
//            return DBMovieController.getInstance().getAllMovie();
//        } catch (DBAbstractControllerException ex) {
//            Logger.getLogger(JlistJPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return null;
    }

    private void addList(List<MovieEntity> movies) {
        jlistModel1.removeAllElements();

        for (MovieEntity movie : movies) {
            jlistModel1.addElement(movie);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAllFilms;
    private javax.swing.JButton jButtonFavorite;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JList<MovieEntity> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private it.lule.cineteca.gui.logic.rm.model.jlistModel jlistModel1;
    private it.lule.cineteca.gui.logic.rm.renderer.JlistRenderer jlistRenderer1;
    // End of variables declaration//GEN-END:variables
}
