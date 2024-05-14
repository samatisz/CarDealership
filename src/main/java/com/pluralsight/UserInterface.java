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

   private void init() { //init means initialize
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
               processGetByYearRequest();
               break;
           case "3":
               processGetByColorRequest();
               break;
           case "4":
               processGetByMileageRequest();
               break;
           case "5":
               processGetByVehicleTypeRequest();
               break;
           case "6":
               processGetAllVehiclesRequest();
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

   }

   public void processGetByMakeModelRequest() {

   }

   public void processGetByYearRequest() {

   }

   public void processGetByColorRequest() {

   }

   public void processGetByMileageRequest() {

   }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {
       List<Vehicle> vehicleList = this.dealership.getAllVehicles();
       displayVehicles(vehicleList);

    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }

}
