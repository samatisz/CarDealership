package com.pluralsight;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory; //the actuall array list

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


    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        //need to show and compare prices in the array list
        //for each

        return null;

    }
    public List<Vehicle> getVehiclesbyMakeModel(String make, String model) {
        return null;
    }

    public List<Vehicle> getVehiclesbyYear(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehiclesByType(String type){
        return null;
    }

    public List<Vehicle> getAllVehicles() {
        return null;
    }

    public void addVehicle(Vehicle vehicle) {

    }

    public void removeVehicle(Vehicle vehicle) {

    }


}
