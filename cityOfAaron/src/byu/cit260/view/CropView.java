/*
 * The CropView.
 * Authors: Gianna Echegaray, Hernan Rodriguez, and Karly Winters. 
 * Date last modified: 6/26/18.
 */
package byu.cit260.view;

import byui.cit260.model.*;
import byu.cit260.controller.*;
import java.util.Scanner;
import byu.cit260.cityOfAaron.*;
import Exceptions.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gianna
 */
public class CropView {

    // Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);

    // Get references to the Game object and the CropData object
    private static Game theGame = CityOfAaron.getTheGame();
    private static CropData cropData = theGame.getCropData();

    // The buyLandView method
    // Purpose: interface with the user input for buying land
    // Parameters: none
    // Returns: none
    public static void buyLandView() {
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();

        // Prompt the user to enter the number of acres to buy
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        System.out.print("\nHow many acres of land do you wish to buy? ");

        //  Get the user’s input and save it.
        int toBuy;
        toBuy = keyboard.nextInt();
        boolean paramsNotOkay;
        do {
            paramsNotOkay = false;
            System.out.println("\nHow many acres of land do you wish to buy? ");
            toBuy = keyboard.nextInt();

            try {
                // Call the sellLand( ) method in the control layer to sell the land
                CropControl.buyLand(toBuy, price, cropData);   
           } 
            catch (Exception e) {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        } while (paramsNotOkay);

    }

    // The runCropsView method()
    // Purpose: runs the Hamurabi game
    // Parameters: none
    // Returns: none
    public static void runCropsView() throws Exception {
        // call the buyLandView( ) method
        buyLandView();

        // add calls to the other crop view methods
        // as they are written
        sellLandView();
        feedPeopleView();
        plantCrops();
        showStarved();

        displayCropsReportView();
    }

//    METHODS TO IMPLEMENT
//    sellLandView()
//    feedPeopleView()
//    plantCropsView()
//    showStarvedView()
//    displayCropsReportView()
    
    // The sellLandView method()
    // Purpose: allows the user to sell part of his lands
    // Parameters: none
    // Returns: none
    public static void sellLandView() throws Exception {
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();
        int toSell;
        // Prompt the user to enter the number of acres to sell
        System.out.format("Land is selling for %d bushels per acre.%n", price);

        boolean paramsNotOkay;
        do {
            paramsNotOkay = false;
            System.out.println("\nHow many acres of land do you want to sell? ");
            toSell = keyboard.nextInt();
            try {
                // Call the sellLand( ) method in the control layer to buy the land
                CropControl.sellLand(price, toSell, cropData);
            }

        catch (Exception e) {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
            } while (paramsNotOkay);

    }

    public static void displayCropsReportView() {
        String reportHeader = "\n"
                + "-------------       --------------\n"
                + "    CITY OF AARON: ANNUAL REPORT  \n"
                + "-------------       --------------\n";
        String report = "\n"
                + "YEAR NUMBER:               " + cropData.getYear() + "\n"
                + "PEOPOPLE STARVED:          " + cropData.getNumStarved() + "\n"
                + "NEW PEOPLE:                " + cropData.getNewPeople() + "\n"
                + "CURRENT POPULATION:        " + cropData.getPopulation() + "\n"
                + "ACRES OWNED BY THE CITY:   " + cropData.getAcresOwned() + "\n"
                + "BUSHELS PER ACRE:          " + cropData.getHarvest() + "\n"
                + "BUSHELS PAYED IN OFFERING: " + cropData.getOfferingBushels() + "\n"
                + "BUSHELS EATEN BY RATS:     " + cropData.getEatenByRats() + "\n"
                + "BUSHELS IN STORE:          " + cropData.getWheatInStore() + "\n"
                + "-------------       --------------\n";

        System.out.println(reportHeader + report);
    }

    // The feedPeopleView method()
    // Purpose: allows the user to feed people
    // Parameters: none
    // Returns: none
    public static void feedPeopleView() {

        boolean paramsNotOkay;
        int bushelsOfGrain;
        
        do {    
            paramsNotOkay = false;
            // Prompt the user to enter the number of bushels of grain want to give 
            // to the people
            System.out.print("\nHow many bushels of grain do you want to give to the people? ");
            //  Get the user’s input and save it.
            bushelsOfGrain = keyboard.nextInt();
            try {
                // Call thefeedPeopleView() method in the control layer 
                CropControl.feedPeople(bushelsOfGrain, cropData);
            } catch (Exception e) {
                System.out.println("I am sorry master, an error ocurred");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        } while (paramsNotOkay);
    }

    public static void plantCrops() {
        
        boolean paramsNotOkay;
        int toPlant;     
        do {    
            paramsNotOkay = false;
        // Get user's input for how much they want to plant.
        System.out.print("\nHow many acres of land do you want to plant? ");      
        toPlant = keyboard.nextInt();
         try {
        // Call the plantCrops method. 
        CropControl.plantCrops(toPlant, cropData);
    } catch (Exception e) {
System.out.println("I am sorry master, an error ocurred");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        } while (paramsNotOkay);
    }
    
    public static void showStarved() {

        System.out.print("\nPeople who starved: ");
        // Call the calcStarved method.
        CropControl.calcStarved(cropData);
    }
    
    // The setOfferingView method()
    // Purpose: allows the user to set how much they want to pay in tithes.
    // Parameters: none
    // Returns: none
//     public static void setOfferingView() {
//
//        // Prompt the user to enter the amount for their tithe.
//        System.out.print("\nWhat percent would you like to give for tithes? ");
//
//        //  Get the user’s input and save it.
//        int payOffering;
//        payOffering = keyboard.nextInt();
//        boolean paramsNotOkay;
//        do {
//            paramsNotOkay = false;
//            System.out.println("\nHow much would you like to give in tithes in percent?");
//            payOffering = keyboard.nextInt();
//
//            try {
//                
//                // Call the setOffering( ) method in the control layer to set the offering. 
//                CropControl.setOffering(payOffering, cropData);
//           } 
//            catch (Exception e) {
//                System.out.println("I am sorry master, I cannot do this.");
//                System.out.println(e.getMessage());
//                paramsNotOkay = true;
//            }
//        } while (paramsNotOkay);
//
//    }
  }
