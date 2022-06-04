/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca;

import it.lule.cineteca.gui.user.UserDialog;
import javax.swing.JFrame;

/**
 * https://app.gitkraken.com/glo/board/YfUy5R128ABI_uSA
 * @author sommovir
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("[Cineteka-k] Welcome !");
        UserDialog dialog = new UserDialog(new JFrame(), true);
        
        /* io ricordavo JFrame.EXIT_ON_CLOSE */
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        dialog.dispose();
        dialog.setLocationRelativeTo(dialog);
        dialog.setVisible(true);
        
    }
    
}
