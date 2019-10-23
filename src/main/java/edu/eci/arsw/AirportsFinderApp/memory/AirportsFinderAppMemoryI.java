/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.AirportsFinderApp.memory;

import edu.eci.arsw.AirportsFinderApp.model.Aeropuerto;
import java.util.ArrayList;

/**
 *
 * @author 2125509
 */
public interface AirportsFinderAppMemoryI {
 
    
     public ArrayList<Aeropuerto> buscarPorNombre(String name);
     
     public void guardar(Aeropuerto airport);
             
}
