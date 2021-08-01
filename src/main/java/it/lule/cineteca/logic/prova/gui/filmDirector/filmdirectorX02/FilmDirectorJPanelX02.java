/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.prova.gui.filmDirector.filmdirectorX02;

import it.lule.cineteca.logic.prova.logic.fake.FakeDB;
import it.lule.cineteca.logic.prova.logic.fake.FakeFilmDirector;
import it.lule.cineteca.logic.prova.logic.fake.FakeMovie;
import java.awt.Color;
import java.util.List;

/**
 *
 * @author lele
 */
public class FilmDirectorJPanelX02 extends javax.swing.JPanel {

    private List<FakeFilmDirector> fakeFilmDirectors = FakeDB.getInstance().getFakeFilmDirectors();

    /**
     * Creates new form FilmDirectorJPanel
     */
    public FilmDirectorJPanelX02() {
        initComponents();

        for (FakeFilmDirector fakeFilmDirector : fakeFilmDirectors) {
            jlistFilmDirectorModelFake1.addElement(fakeFilmDirector);
        }

        FakeFilmDirector getFakeFilmDirector = fakeFilmDirectors.get(0);

        List<FakeMovie> fakeMovies = getFakeFilmDirector.getFakeMovies();

        for (FakeMovie fakeMovy : fakeMovies) {
            jComboBoxMovietModelFake1.addElement(fakeMovy);
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

        jlistFilmDirectorModelFake1 = new it.lule.cineteca.logic.prova.logic.fake.logic.model.JlistFilmDirectorModelFake();
        jlistFilmDirectorRendererFake1 = new it.lule.cineteca.logic.prova.logic.fake.logic.renderer.JlistFilmDirectorRendererFake();
        jComboBoxMovietModelFake1 = new it.lule.cineteca.logic.prova.logic.fake.logic.model.JComboBoxMovietModelFake();
        jComboBoxMovieRendererFake1 = new it.lule.cineteca.logic.prova.logic.fake.logic.renderer.JComboBoxMovieRendererFake();
        jPanel1 = new javax.swing.JPanel();
        jButtonAddMovie = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListFilmDIrector = new javax.swing.JList<>();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new java.awt.TextField();
        jLabelSurname = new javax.swing.JLabel();
        jTextFieldSurname = new java.awt.TextField();
        jLabelDateOfBirth = new javax.swing.JLabel();
        jTextFielDateOfBird = new java.awt.TextField();
        jButtonAddFilmDirector = new javax.swing.JButton();
        jButtonRemoveFilmDirector = new javax.swing.JButton();

        jlistFilmDirectorRendererFake1.setText("jlistFilmDirectorRendererFake1");

        jComboBoxMovieRendererFake1.setText("jComboBoxMovieRendererFake1");

        jButtonAddMovie.setText("Add Movie");
        jButtonAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddMovieActionPerformed(evt);
            }
        });

        jComboBox1.setModel(jComboBoxMovietModelFake1);
        jComboBox1.setRenderer(jComboBoxMovieRendererFake1);

        jListFilmDIrector.setModel(jlistFilmDirectorModelFake1);
        jListFilmDIrector.setCellRenderer(jlistFilmDirectorRendererFake1);
        jListFilmDIrector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListFilmDIrectorMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jListFilmDIrector);

        jLabelName.setText("Name");

        jLabelSurname.setText("Surname");

        jLabelDateOfBirth.setText("Date Of Birth");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFielDateOfBird, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSurname)
                    .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFielDateOfBird, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddMovie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonAddFilmDirector.setText("Add Film director");
        jButtonAddFilmDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFilmDirectorActionPerformed(evt);
            }
        });

        jButtonRemoveFilmDirector.setText("Remove Film director");
        jButtonRemoveFilmDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveFilmDirectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButtonAddFilmDirector)
                        .addGap(74, 74, 74)
                        .addComponent(jButtonRemoveFilmDirector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddFilmDirector)
                    .addComponent(jButtonRemoveFilmDirector))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddFilmDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddFilmDirectorActionPerformed

    }//GEN-LAST:event_jButtonAddFilmDirectorActionPerformed

    private void jButtonAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddMovieActionPerformed

    }//GEN-LAST:event_jButtonAddMovieActionPerformed

    private void jButtonRemoveFilmDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveFilmDirectorActionPerformed
        if ( jListFilmDIrector.getSelectedIndex() == -1)
            return;
        
        int selectedIndex = jListFilmDIrector.getSelectedIndex();
                
        jlistFilmDirectorModelFake1.remove(selectedIndex);
        
        jListFilmDIrector.getSelectionForeground();
        
        jListFilmDIrector.setSelectedIndex(selectedIndex - 1);
        jComboBoxMovietModelFake1.removeAllElements();
        

        
    }//GEN-LAST:event_jButtonRemoveFilmDirectorActionPerformed

    private void jListFilmDIrectorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListFilmDIrectorMouseReleased

        if ( jComboBox1.getItemCount() != -1){
            jComboBox1.removeAllItems();
        }
        
        int selectedIndex = jListFilmDIrector.getSelectedIndex();
        
        jListFilmDIrector.setSelectedIndex(selectedIndex);
        FakeFilmDirector getFakeFilmDirector = fakeFilmDirectors.get(selectedIndex);

        for (FakeMovie fakeMovy : getFakeFilmDirector.getFakeMovies()) {
            jComboBoxMovietModelFake1.addElement(fakeMovy);
        }
        
        
    }//GEN-LAST:event_jListFilmDIrectorMouseReleased


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddFilmDirector;
    private javax.swing.JButton jButtonAddMovie;
    private javax.swing.JButton jButtonRemoveFilmDirector;
    private javax.swing.JComboBox<FakeMovie> jComboBox1;
    private it.lule.cineteca.logic.prova.logic.fake.logic.renderer.JComboBoxMovieRendererFake jComboBoxMovieRendererFake1;
    private it.lule.cineteca.logic.prova.logic.fake.logic.model.JComboBoxMovietModelFake jComboBoxMovietModelFake1;
    private javax.swing.JLabel jLabelDateOfBirth;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JList<FakeFilmDirector> jListFilmDIrector;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField jTextFielDateOfBird;
    private java.awt.TextField jTextFieldName;
    private java.awt.TextField jTextFieldSurname;
    private it.lule.cineteca.logic.prova.logic.fake.logic.model.JlistFilmDirectorModelFake jlistFilmDirectorModelFake1;
    private it.lule.cineteca.logic.prova.logic.fake.logic.renderer.JlistFilmDirectorRendererFake jlistFilmDirectorRendererFake1;
    // End of variables declaration//GEN-END:variables
}
