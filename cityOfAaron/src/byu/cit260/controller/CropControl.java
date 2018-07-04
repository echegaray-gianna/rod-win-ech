//The CropControl class- part of the control layer
//class contains all of the calculation methods for managing the crops
//Author: Karly Winters, Hernan Rodriguez, Gianna Echegaray
//Date last modified: May 2018
package byu.cit260.controller;

import Exceptions.CropException;
import byui.cit260.model.CropData;
import java.util.Random;

public class CropControl {

    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;

    //random number generator
    private static Random random = new Random();

    /**
     * calcLandCost Purpose: calculate a random land price between 17 and 26
     * bushels/acre
     *
     * @params: none
     * @return: the land cost
     */
    public static int calcLandCost() {
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        return landPrice;
    }

    //The sellLand method
    //Purpose: To sell land
    //Parameters: the price of land, the number of acres to sell, and a 
    //            reference to a CropData object
    //Returns: the number of acres owned after the sale
    //Pre-conditions: acres to sell must be positive
    //                and <= acresOwned
    public static void sellLand(int landPrice, int acresToSell, CropData cropData)throws CropException{
        //if acresToSell < 0, return -1
        if (acresToSell < 0) {
           throw new CropException("You can't acquire a negative amount.");
        }

        //if acresToSell > acresOwned, return -1
        int owned = cropData.getAcresOwned();
        if (acresToSell > owned) {
          throw new CropException("You can't sell more land than what you own.");
        }

        //acresOwned = acresOwned - acresToSell
        owned -= acresToSell;
        cropData.setAcresOwned(owned);

        //wheatInStore = wheatInStore + acresToSell * landPrice
        int wheat = cropData.getWheatInStore();
        wheat -= (acresToSell * landPrice);
        cropData.setWheatInStore(wheat);
    }

    //The buyLand method					
    //Purpose: To buy land					
    //@param price per acre					
    //@param the amount  of acres to buy					
    //@param a reference to the CropData object					
    //@return the number of acres owned after the purchase					
    //Pre-Conditions: acres to buy must be positive, 
    //                 have enough population and 
    //                 have enough wheat for the purchase  					
    public static void buyLand(int acresToBuy, int pricePerAcre, CropData cropData)throws CropException {
//      if acresToBuy < 0, THEN RETURN -1
        if (acresToBuy < 0) {
            throw new CropException("A negative value was input.");
        }

//      if ( wheatInStore <  acresToBuy * pricePerAcre) THEN RETURN -1
        int wheat = cropData.getWheatInStore();
        if (wheat < acresToBuy * pricePerAcre) {
            throw new CropException("There is insufficient wheat to buy this much land.");
        }

//      if ( population * 10 <  (acresToBuy + acresOwned  ) ) THEN RETURN -1
        int population = cropData.getPopulation();
        int acresOwned = cropData.getAcresOwned();
        if (population * 10 < (acresToBuy + acresOwned)) {
            throw new CropException ("Not enough people for the amount of land you're trying to buy.");
        }

//        acresOwned += acresToBuy;
        acresOwned += acresToBuy;
        cropData.setAcresOwned(acresOwned);

//      wheatInStore -= ( acresToBuy * pricePerAcre )
        wheat -= (acresToBuy * pricePerAcre);
        cropData.setWheatInStore(wheat);
    }

    public static void feedPeople(int bushelsOfGrain, CropData cropData) throws CropException {

//      IF ( wheatForPeople < 0) THEN return "Enter a new number"
        if (bushelsOfGrain < 0) {
            throw new CropException("There amount is insufficient, please indicate a positive number");
        }
//      IF ( CropData.wheatInStore < wheatForPeople ) THEN return "Enter a new number"
        int inStore = cropData.getWheatInStore();
        if (inStore < bushelsOfGrain) {
            throw new CropException("There is insufficient bushels of wheat for the amount indicated.");
        }
//      wheatInStorage =  wheatInStorage - bushelsOfGrain
//      wheatForPeople = wheatForPeople + bushelsOfGrain
        int wheatForPeople = cropData.getWheatForPeople();
        inStore -= bushelsOfGrain;
        wheatForPeople += bushelsOfGrain;
        cropData.setWheatInStore(inStore);
        cropData.setWheatForPeople(wheatForPeople);
    }

    // The plantCrops method					
    // Purpose: Set aside Wheat to plant crops										
    // @param the amount  of acres to plant					
    // @param a reference to the CropData object					
    // @return the number of acres planted after the purchase					
    // Pre-Conditions: acres to plant must be positive, 
    //                have enough wheat to buy and land to plant.
    
    public static int plantCrops(int acresToPlant, CropData cropData) {
        //if acresToPlant < 0, THEN RETURN "-1"
        if (acresToPlant < 0) {
            return -1;
        }

        //if ( acresOwned <  acresToPlant , THEN RETURN "-1"      
        int acresOwned = cropData.getAcresOwned();      
        if (acresOwned < acresToPlant) {
            return -1;
        }

        //wheatNeededToPlant = acresToPlant / 2
        int wheatNeededToPlant = acresToPlant / 2;

        //if wheatInStore <  wheatNeededToPlant, THEN RETURN "-1"      
        int wheatInStore = cropData.getWheatInStore();
        if (wheatInStore < wheatNeededToPlant) {
            return -1;
        }

        //wheatInStore -=  wheatNeededToPlant
        wheatInStore -= wheatNeededToPlant;
        cropData.setWheatInStore(wheatInStore);

        //acresPlanted = acresToPlant   
        cropData.setAcresPlanted(acresToPlant);

        //RETURN acresPlanted   
        return wheatInStore;
    }
    // The setOffering method					
    // Purpose: Make sure the offering is positive but not over 100%.										
    // @param pay offering method				
    // @param a reference to the CropData object					
    // @return pay offering					
    // Pre-Conditions: tithe can't be below 0%,
    //                 tithe can't be above 100%.						

    public static int setOffering(int payOffering, CropData cropData) {
        // if user input < 0%, THEN RETURN "-1"
        if (payOffering < 0) {
            return -1;
        }
        // if user input > 100%, THEN RETURN "-1"
        if (payOffering > 100) {
            return -1;
        }
        // Save the result.
        cropData.setOffering(payOffering);
        return payOffering;  
}


    
    public static int calcStarved(CropData cropData) {
        
        int wheatSetAside = cropData.getWheatForPeople();
       
        // Calculate how many people were fed. (20 bushels = 1 person)
        int peopleFeed = wheatSetAside / 20;
        int population = cropData.getPopulation();
        
        // population > peopleFeed = people died...
        // population < peopleFeed = ok
        if (  population > peopleFeed ){
            int died = population - peopleFeed;
            cropData.setNumStarved(died);
            
            population -= died;
            cropData.setPopulation(population);
        } else {
            // population < peopleFeed = ok
            cropData.setNumStarved(0);
        }
        
        return population;
    }
    
    
}