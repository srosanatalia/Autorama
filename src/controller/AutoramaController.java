/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.*;

/**
 *
 * @author nati_
 */
public class AutoramaController {
    
    private final ArrayList pilotos;
    
    public AutoramaController() {
        this.pilotos = new ArrayList ();
    }
    
    public int cadastrarPiloto(String nome) {
        Piloto piloto = new Piloto(nome);
        pilotos.add(piloto);
        if(pilotos.contains(piloto)){
            return 1;
        }
        return 0;
    }

    public ArrayList getPilotos() {
        return pilotos;
    }
    
    public void iniciarservidor() throws Exception{
        new Thread(servidor).start();
        new Thread(cliente).start();
    }
    
    private static Runnable servidor = new Runnable() {
        public void run() {
            try{
                ServidorUDP UDP = new ServidorUDP();
                UDP.Servidor();
            } catch (Exception e){}

        }
    };

    private static Runnable cliente = new Runnable() {
        public void run() {
            try{
                ClienteUDP Cliente = new ClienteUDP();
                Cliente.Cliente();
            } catch (Exception e){}
       }
    };

}
