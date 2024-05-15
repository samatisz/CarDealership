package com.pluralsight;

import java.io.*;


public class DealershipFileManager {
    public Dealership dealership;

    public Dealership getDealership() {

        try {
            BufferedReader buff = new BufferedReader(new FileReader("dealership.csv"));

            String line;
            while ((line = buff.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    String address = parts[1].trim();
                    String phoneNumber = parts[2].trim();
                    dealership = new Dealership(name, address, phoneNumber);
                }

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
                    dealership.addVehicle(vehicle); //the array list???/
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
        try {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter("dealership.csv"));
            buffWrite.write(dealership.getName() + " | " + dealership.getAddress() + " | " + dealership.getPhone());

            buffWrite.close();
        } catch (Exception e) {



        }

    }

}
