/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.AirportsFinderApp.memory;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

/**
 *
 * @author 2125509
 */
@Service
public class AirportsFinderAppMemory implements AirportsFinderAppMemoryI {

    
    private ConcurrentHashMap map = new ConcurrentHashMap(); 
    private ConcurrentHashMap time = new ConcurrentHashMap(); 
    
    public String buscarPorNombre(String name){
        
        try {
            long current = System.currentTimeMillis();
            long consult = (long)time.get(name); 
            if (current - consult > 150000) {
                map.remove(name);
                System.out.println("pass");
            }
            String airport = (String) map.get(name);
            return airport;
        }
        catch (Exception ex){
            return null;
        }
    }
    
    
    public void guardar(String airport, String name){
        map.put(name,airport);  
        time.put(name,System.currentTimeMillis()); 
    }




    public ConcurrentHashMap getMap() {
        return map;
    }

    public void setMap(ConcurrentHashMap map) {
        this.map = map;
    }   
}