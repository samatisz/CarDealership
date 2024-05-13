package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

   private Scanner myScanner;
   private Dealership dealership;

   public UserInterface() {
      myScanner = new Scanner(System.in);

   }

   private void init() {
       DealershipFileManager fileManager = new DealershipFileManager();
       this. dealership = fileManager.getDealership();

   }

   public void display() {
       //display is hardest, do last,,, or at least after others


   }

   private void displayVehicles() {
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

    public void processGetByTypeRequest() {

    }

    public void processGetAllVehicleTypeRequest() {

    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }

}
