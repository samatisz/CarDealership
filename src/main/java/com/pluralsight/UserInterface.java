package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

   private Scanner myScanner;
   private Dealership dealership;

   public UserInterface() {
      myScanner = new Scanner(System.in);

   }

   public void init() { //init means initialize
       DealershipFileManager fileManager = new DealershipFileManager();
       this.dealership = fileManager.getDealership();

   }

   public void display() {
       System.out.println("Welcome!");
       System.out.println("======");
       System.out.println("Choose an option:");
       System.out.println(" ");
       System.out.println("$) Search By Price");
       System.out.println("1) Search by Make and Model");
       System.out.println("2) Search by Year");
       System.out.println("3) Search by Color");
       System.out.println("4) Search by Mileage");
       System.out.println("5) Search by vehicle type");
       System.out.println("6) Get all vehicles");
       System.out.println("7) Add vehicle");
       System.out.println("8) Remove vehicle");
       // add and remove?????

       String input = myScanner.nextLine().trim();

       switch (input.toUpperCase()) {
           case "$":
               processGetByPriceRequest();
               break;
           case "1":
               processGetByMakeModelRequest();
               break;
           case "2":
               processGetbyYearRequest();
               break;
           case "3":
               processGetbyColorRequest();
               break;
           case "4":
               processGetbyMileageRequest();
               break;
           case "5":
               processGetbyVehicleTypeRequest();
               break;
           case "6":
               processGetAllVehicleRequest();
               break;
           case "7":
               processAddVehicleRequest();
               break;
           case "8":
               processRemoveVehicleRequest();
               break;
           default:
               System.out.println("Invalid option");
               break;
       }
   }
       //a menu while loop then switch case

   private void displayVehicles(List<Vehicle> vehicleList) {
       for (Vehicle vehicle : vehicleList) {
           System.out.println(vehicle);
       }
       //for each will be used

   }
    public void processGetByPriceRequest() {
        System.out.println("Please enter your minimum price ");
        double minPrice = myScanner.nextDouble();
        System.out.println("Please enter the maximum price ");
        double maxPrice = myScanner.nextDouble();
        List<Vehicle> inventory = dealership.getVehiclesByPrice(minPrice, maxPrice);

    }
    public void processGetByMakeModelRequest() {
        System.out.println("Please enter your make vehicle ");
        String make = myScanner.nextLine();
        System.out.println("Please enter the model of vehicle ");
        String model = myScanner.nextLine();
        List<Vehicle> inventory = dealership.getVehiclesbyMakeModel(make, model);
    }
    public void processGetbyYearRequest() {
        System.out.println("Please enter the year from");
        Double minYear = Double.parseDouble(myScanner.next());
        myScanner.nextLine();
        System.out.println("Please enter the year to ");
        Double maxYear = Double.parseDouble(myScanner.next());
        List<Vehicle> inventory = dealership.getVehiclesByPrice(minYear, maxYear);
        displayVehicles(inventory);
    }
    public void processGetbyColorRequest() {
        System.out.println("Please enter your color of the vehicle ");
        String color = myScanner.nextLine();
        List<Vehicle> inventory = dealership.getVehiclesByColor(color);
        displayVehicles(inventory);

    }
    public void processGetbyMileageRequest() {
        System.out.println("Please enter the minimum mileage of your vehicle");
        int minMileage = Integer.parseInt(myScanner.nextLine());
        System.out.println("Please enter the maximum mileage of your vehicle");
        int maxMileage = Integer.parseInt(myScanner.nextLine());
        List<Vehicle> inventory = dealership.getVehiclesByMileage(minMileage, maxMileage);
        displayVehicles(inventory);
    }
    public void processGetbyVehicleTypeRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of vehicle ");
        String type = scanner.nextLine();
        List<Vehicle> inventory = dealership.getVehiclesByType(type);
        displayVehicles(inventory);
    }
    public void processGetAllVehicleRequest() {
        List<Vehicle> inventory = dealership.getAllVehicles();
        displayVehicles(inventory);
    }
    public void processAddVehicleRequest() {
        Scanner scanner = new Scanner(System.in);
        int vin = Integer.parseInt(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter make of vehicle");
        String make = scanner.nextLine();
        System.out.println("Enter model of veicle");
        String model = scanner.nextLine();
        System.out.println("Enter veicle type ");
        String type = scanner.nextLine();
        String color = scanner.nextLine();
        System.out.println("Enter odometer");
        int odometer = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter price");
        double price = Double.parseDouble(scanner.nextLine());
        dealership.addVehicle(new Vehicle(vin, year, make, model, type, color, odometer, price));
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealershipFileManager.saveDealership(dealership);
        System.out.println("Vehicle added");
    }
    public void processRemoveVehicleRequest() {
        System.out.println("Enter VIN of vehicle ");
        int vin = myScanner.nextInt();
        ;
        //  dealership.removeVehicle(vin);
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealershipFileManager.getDealership().removeVehicle();
        System.out.println("vin " + "is removed successfully!");



    }
}
