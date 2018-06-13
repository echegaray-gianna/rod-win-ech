/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.view;

import byui.cit260.model.*;
import byu.cit260.controller.*;
import java.util.Scanner;
import byu.cit260.cityOfAaron.*;

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

        // Call the buyLand( ) method in the control layer to buy the land
        CropControl.buyLand(toBuy, price, cropData);
    }

    // The runCropsView method()
    // Purpose: runs the Hamurabi game
    // Parameters: none
    // Returns: none
    public static void runCropsView() {
        // call the buyLandView( ) method
        buyLandView();
        
        // add calls to the other crop view methods
        // as they are written
        sellLandView();
        displayCropsReportView();
        feedPeopleView();
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
    public static void sellLandView(){
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();

        // Prompt the user to enter the number of acres to sell
        System.out.format("Land is selling for %d bushels per acre.%n", price);
        System.out.print("\nHow many acres of new land do you want sell? ");
        
        //  Get the user’s input and save it.
        int toSell;
        toSell = keyboard.nextInt();
        
         // Call the sellLand( ) method in the control layer to sell the land
        CropControl.sellLand(price, toSell, cropData);
    }
    
    
    public static void displayCropsReportView(){
        String reportHeader = "\n"
                + "-------------       --------------\n"
                + "    CITY OF AARON: ANNUAL REPORT  \n"
                + "-------------       --------------\n";
        String report = "\n"
                + "YEAR NUMBER:               " + cropData.getYear() + "\n"
                + "PEOPOPLE STARVED:          " + cropData.getNumStarved() + "\n"
                + "NEW PEOPLE:                " + cropData.getNewPeople()+ "\n"
                + "CURRENT POPULATION:        " + cropData.getPopulation()+ "\n"
                + "ACRES OWNED BY THE CITY:   " + cropData.getAcresOwned()+ "\n"
                + "BUSHELS PER ACRE:          " + cropData.getHarvest()+ "\n"
                + "BUSHELS PAYED IN OFFERING: " + cropData.getOfferingBushels()+ "\n"
                + "BUSHELS EATEN BY RATS:     " + cropData.getEatenByRats()+ "\n"
                + "BUSHELS IN STORE:          " + cropData.getWheatInStore()+ "\n"
                + "-------------       --------------\n";
        
        
        System.out.println( reportHeader + report);
    }

    // The feedPeopleView method()
    // Purpose: allows the user to feed people
    // Parameters: none
    // Returns: none
    public static void feedPeopleView() {
      
        // Prompt the user to enter the number of bushels of grain want to give 
        // to the people
        
        System.out.print("\nHow many bushels of grain do you want to give to the people? ");

        //  Get the user’s input and save it.
        int bushelsOfGrain;
        bushelsOfGrain = keyboard.nextInt();

        // Call thefeedPeopleView() method in the control layer 
        CropControl.feedPeople(bushelsOfGrain, cropData);
   
    }
    public static void plantCrops() {
        // Get user's input for how much they want to plant.
        int toPlant;
        toPlant = keyboard.nextInt();
        
        // Call the plantCrops method. 
        CropControl.plantCrops(0, cropData);
    }
    public static void showStarved() {
    
        // Call the calcStarved method.
        CropControl.calcStarved(cropData);
    }
}
