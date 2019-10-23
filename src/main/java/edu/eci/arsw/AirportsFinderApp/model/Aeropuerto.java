/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.AirportsFinderApp.model;

import java.util.ArrayList;

/**
 *
 * @author 2125509
 */
public class Aeropuerto {

    
    
    
    
    private int Id; 
    private String city;
    private int cityId;
    private String code; 
    private String countryCode; 
    private Location location; 
    private String name; 
    private ArrayList<String> pointsOfSale; 
    private ArrayList<String> themes; 
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPointsOfSale() {
        return pointsOfSale;
    }

    public void setPointsOfSale(ArrayList<String> pointsOfSale) {
        this.pointsOfSale = pointsOfSale;
    }

    public ArrayList<String> getThemes() {
        return themes;
    }

    public void setThemes(ArrayList<String> themes) {
        this.themes = themes;
    }
    
    @Override
    public String toString() {
        return "Aeropuerto{" + "Id=" + Id + ", city=" + city + ", cityId=" + cityId + ", code=" + code + ", countryCode=" + countryCode + ", location=" + location + ", name=" + name + ", pointsOfSale=" + pointsOfSale + ", themes=" + themes + '}';
    }
  
}
