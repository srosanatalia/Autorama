/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Piloto;

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

}
