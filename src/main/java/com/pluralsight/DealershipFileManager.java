package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;

public class DealershipFileManager {

    public Dealership getDealership() {

        try {
            BufferedReader buff = new BufferedReader(new FileReader("dealership.csv"));
            Dealership dealership = new Dealership("SaMatz Cars", "127 Halazia Street", "123-456-7890");

            String line;
            while ((line = buff.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 8) {
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2].trim();
                    String model = parts[3].trim();
                    String type = parts[4].trim();
                    String color = parts[5].trim();
                    int mileage = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);
                    Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, mileage, price);
                    dealership.addVehicle(vehicle);
                }
            }
            buff.close();
            return dealership;
        } catch (Exception e) {
            System.out.println("Error loading inventory: " + e.getMessage());
        }
        return null;
    }

    public static void saveDealership(Dealership dealership) {




    }

}
