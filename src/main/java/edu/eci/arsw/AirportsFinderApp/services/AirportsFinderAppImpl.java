/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.AirportsFinderApp.services;

import edu.eci.arsw.AirportsFinderApp.http.HttpConnectionExample;
import edu.eci.arsw.AirportsFinderApp.memory.AirportsFinderAppMemory;
import edu.eci.arsw.AirportsFinderApp.memory.AirportsFinderAppMemoryI;
import edu.eci.arsw.AirportsFinderApp.model.Aeropuerto;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author 2125509
 */
@Service
public class AirportsFinderAppImpl  implements AirportsFinderAppServices{
    
    private static String url ="https://cometari-airportsfinder-v1.p.rapidapi.com/api";
    
    @Autowired
    AirportsFinderAppMemoryI memory;
    
    
    
    
    @Override
    public String getAirportByName(String name) {
        try {
            url = url + "/airports/by-text?text=" + name;  
            return HttpConnectionExample.getJson(url);
            
        } catch (IOException ex) {
            Logger.getLogger(AirportsFinderAppImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void saveAirport(Aeropuerto airport) {
        memory.guardar(airport);

    }
}
