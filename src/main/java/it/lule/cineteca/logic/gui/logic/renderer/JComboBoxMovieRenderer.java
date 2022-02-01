/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.gui.logic.renderer;

import it.lule.cineteca.logic.fake.FakeMovie;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

/**
 *
 * @author lele
 */
public class JComboBoxMovieRenderer extends BasicComboBoxRenderer {

    public JComboBoxMovieRenderer() {
    }

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

        Component c
                = super.getListCellRendererComponent(list, value, index, isSelected,
                        cellHasFocus); //To change body of generated methods, choose Tools | Templates.
        if ( c != null && value instanceof FakeMovie){
            ((JLabel)c).setText( ((FakeMovie)value).getOriginalTitle() );
        }
        return this;
    }
}
