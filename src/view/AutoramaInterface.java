/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AutoramaController;
import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author nati_
 */
public class AutoramaInterface {
    private JFrame frame = new JFrame ("Autorama");
    private final AutoramaController autoramaController;

    AutoramaInterface(AutoramaController autoramaController) {
        this.autoramaController = autoramaController;
        
        frame = new TelaInicial(autoramaController);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
