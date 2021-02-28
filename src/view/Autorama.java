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
public class Autorama {
    public static void main (String [] args){
        AutoramaController autoramaController = new AutoramaController();
        AutoramaInterface autorama = new AutoramaInterface(autoramaController);
    }
}
