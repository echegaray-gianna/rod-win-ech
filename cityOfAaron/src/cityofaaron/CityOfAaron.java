/*
 * The main() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team Members: Gianna Echegaray, Hernan Rodriguez, Karly Winters
 */
package cityofaaron;

import byui.cit260.model.*;

/**
 *
 * @author Gianna
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //TESTING PLAYER
       //Creating a object of Player
       Player playerOne = new Player();
       // setting values to playerOne attribute 
       playerOne.setName("Fred");
       //getting the name
       String playerOneName = playerOne.getName();     
       //display the value
       System.out.println("Name = " + playerOneName);
       
       //TESTING TEAMMEMBER
       //getting the name
       String teamMemberName = TeamMember.memberOne.getName();
       String teamMemberTitle = TeamMember.memberOne.getTitle();
       //display the value
       System.out.println("Team Member: " + teamMemberName + " " + teamMemberTitle);
       
       
       // TESTING LOCATION CLASS
       // Creating an object of Location (step 1)
       Location myLocation = new Location();
       
       // setting values to myLocation attributes (step 2)
       myLocation.setDescription("Home town");
       myLocation.setSymbol("Lion");
       
       // displaying in console the values i just set (step 3)
       System.out.println("********************************************************");
       System.out.println("LOCATION INFORMATION");
       System.out.println("Location description = " + myLocation.getDescription());
       System.out.println("Location symbol = " + myLocation.getSymbol());
       
       //TESTING LISTITEM
       //Creating an object
       ListItem itemOne = new ListItem();
       
       // setting values to itemOne attributes
       itemOne.setName("Wheat");
       itemOne.setNumber(1);
       
       //Displaying the values
       System.out.println("********************************************************");
       System.out.println("LIST ITEM INFORMATION");
       System.out.println("Item One Name: " + itemOne.getName());
       System.out.println("Item One Number: " + itemOne.getNumber());
       
       
       
       //TESTING CROPDATA
       //Creating an object
       CropData theCropData = new CropData();
       
       // setting values to the cropData object created
       theCropData.setYear(2018);
       theCropData.setPopulation(500);
       theCropData.setAcresOwned(100);
       theCropData.setCropYield(70);
       theCropData.setWheatInStore(90);
       theCropData.setNumberWhoDied(5);
       theCropData.setNewPeople(10);
       theCropData.setHarvest(60);
       theCropData.setHarvestAfterOffering(25);
       theCropData.setOffering(55);
       theCropData.setOfferingBushels(21);
       theCropData.setPeopleFed(455);
       theCropData.setAcresPlanted(100);
       theCropData.setNumStarved(20);
       theCropData.setEatenByRats(33);
       theCropData.setWheatForPeople(125);
       
       
       //Displaying the values
       System.out.println("********************************************************");
       System.out.println("CROP DATA INFORMATION");
       System.out.println("Crop Data - Year : " + theCropData.getYear());
       System.out.println("Crop Data - Population : " + theCropData.getPopulation());
       System.out.println("Crop Data - AcresOwned : " + theCropData.getAcresOwned());
       System.out.println("Crop Data - Crop Yield : " + theCropData.getCropYield());
       System.out.println("Crop Data - Wheat InStore : " + theCropData.getWheatInStore());
       System.out.println("Crop Data - Number WhoDied : " + theCropData.getNumberWhoDied());
       System.out.println("Crop Data - New People : " + theCropData.getNewPeople());
       System.out.println("Crop Data - Harvest : " + theCropData.getHarvest());
       System.out.println("Crop Data - Harvest After Offering : " + theCropData.getHarvestAfterOffering());
       System.out.println("Crop Data - Offering : " + theCropData.getOffering());
       System.out.println("Crop Data - Offering Bushels : " + theCropData.getOfferingBushels());
       System.out.println("Crop Data - People Fed : " + theCropData.getPeopleFed());
       System.out.println("Crop Data - Acres Planted : " + theCropData.getAcresPlanted());
       System.out.println("Crop Data - Number Starved : " + theCropData.getNumStarved());
       System.out.println("Crop Data - Eaten ByRats : " + theCropData.getEatenByRats());
       System.out.println("Crop Data - Wheat For People : " + theCropData.getWheatForPeople());
       
    }
    
}
