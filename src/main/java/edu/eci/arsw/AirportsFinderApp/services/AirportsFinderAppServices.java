/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.AirportsFinderApp.services;


/**
 *
 * @author 2125509
 */

public interface AirportsFinderAppServices {
    
       public String getAirportByName(String name); 

       public String getAirportByNameMemory(String name); 
       
       public void saveAirport(String airport, String name); 

}
