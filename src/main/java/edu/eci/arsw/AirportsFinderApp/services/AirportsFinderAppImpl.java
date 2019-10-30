/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.AirportsFinderApp.services;

import edu.eci.arsw.AirportsFinderApp.http.HttpConnectionExample;
import edu.eci.arsw.AirportsFinderApp.memory.AirportsFinderAppMemory;
import edu.eci.arsw.AirportsFinderApp.memory.AirportsFinderAppMemoryI;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.SocketUtils;



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
            String url2 = url + "/airports/by-text?text=" + name;  
            System.out.println(url2);
            return HttpConnectionExample.getJson(url2);
            
        } catch (IOException ex) {
            Logger.getLogger(AirportsFinderAppImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void saveAirport(String airport,String name) {
        memory.guardar(airport,name);

    }

    @Override
    public String getAirportByNameMemory(String name) {
        return memory.buscarPorNombre(name);
    }
}
