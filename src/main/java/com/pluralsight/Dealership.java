package com.pluralsight;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //how do you make array list in this class using the vehicle stuff????
    //addVehicle method
    //removeVehicle method

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        //need to show and compare prices in the array list

        return null; //remove once starting

    }
    public List<Vehicle> getVehiclesbyMakeModel(String make, String model) {
        return null; //remove this
    }

    public List<Vehicle> getVehiclesbyYear(int min, int max) {
        return null; //remove later
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null; //remove this
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return null; //remove this
    }

    public List<Vehicle> getVehiclesByType(String type){
        return null; //remove this
    }

    public List<Vehicle> getAllVehicles() {
        return null; //remove this
    }

    public void addVehicle() {

    }

    public void removeVehicle() {

    }


}
