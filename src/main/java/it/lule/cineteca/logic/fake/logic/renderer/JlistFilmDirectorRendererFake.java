/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.fake.logic.renderer;

import it.lule.cineteca.logic.fake.FakeFilmDirector;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author lele
 */
public class JlistFilmDirectorRendererFake extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Component c
                = super.getListCellRendererComponent(
                        list, value, index, isSelected, cellHasFocus);
        if (c != null && value instanceof FakeFilmDirector){
            ((JLabel)c).setText(( (FakeFilmDirector)value).getName());
        }
        return c;
    }

}