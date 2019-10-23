/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.AirportsFinderApp.Controllers;

import edu.eci.arsw.AirportsFinderApp.services.AirportsFinderAppServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author 2125509
 */
@RestController
public class AirportsFinderAppAPIController {
    
    @Autowired
    AirportsFinderAppServices services;
    
    
    @RequestMapping(method = GET, path = "airports/{name}")
    public ResponseEntity<?> getAirports(@PathVariable(name = "name") String name) {
        try {
            //obtener datos que se enviaran a traves del API
            
            services.getAirportByName("Berlin");
            
            
            return new ResponseEntity<>("", HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>("400 bad request", HttpStatus.NOT_FOUND);
        }
    }
    
}
