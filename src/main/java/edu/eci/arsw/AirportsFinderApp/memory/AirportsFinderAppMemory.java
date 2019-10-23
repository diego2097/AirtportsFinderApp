/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.AirportsFinderApp.memory;

import edu.eci.arsw.AirportsFinderApp.model.Aeropuerto;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2125509
 */
@Service
public class AirportsFinderAppMemory implements AirportsFinderAppMemoryI {

    
    public ArrayList<Aeropuerto> cache; 
    
    
    public ArrayList<Aeropuerto> buscarPorNombre(String name){
        ArrayList<Aeropuerto> rta = new ArrayList<Aeropuerto>();
        for(int i=0; i < rta.size(); i++){
            if (cache.get(i).getCity().equals(name)){
                rta.add(cache.get(i));
            }
        }
        return rta;
    }
    
    
    public void guardar(Aeropuerto airport){
        cache.add(airport);
    }
    
    

    public ArrayList<Aeropuerto> getCache() {
        return cache;
    }

    public void setCache(ArrayList<Aeropuerto> cache) {
        this.cache = cache;
    }
    
    
    
    
    
  
    
    
}
