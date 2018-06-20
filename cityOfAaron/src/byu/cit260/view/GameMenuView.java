// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Echegaray Gianna
// Date last modified: 12 June 2018
//-------------------------------------------------------------
package byu.cit260.view;

import java.util.Scanner;
import byu.cit260.cityOfAaron.CityOfAaron;

/**
 *
 * @author Gianna
 */

public class GameMenuView extends MenuView{
   

    public GameMenuView() {
        super( 
                "\n"
                + "-------------       --------------\n"
                + "* CITY OF AARON:  GAME MENU  *\n"
                + "-------------       --------------\n"
                + " 1 - View the map\n"
                + " 2 - View / print a list\n"
                + " 3 - Move to a new location\n"
                + " 4 - Manage the crops\n"
                + " 5 - Return to the Main menu\n",                
                5
                );  
    }
    
    

      

    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================  
    @Override
    public void doAction(int option) {
        // if the option is 1, call viewTheMap( )
        // if the option is 2, call viewPrintAlist ( )
        // if the option is 3, call moveToANewLocation( )
        // if the option is 4, call manageTheCrops( )
        // if the option is 5, ReturnToTheMainMenu ( )
        switch (option) {
            case 1:  // viewTheMap
                viewTheMap();
                break;
            case 2: // viewPrintAlist
                viewPrintAlist();
                break;
            case 3: // moveToANewLocation
                moveToANewLocation();
                break;
            case 4:// manageTheCrops
                manageTheCrops();
                break;
            case 5: //ReturnToTheMainMenu
               return;
               
        }
    }  
   
    // The viewTheMap method
    // Purpose:  add some interest and creativity to the game
    // Parameters: none
    // Returns: none
    // =================================== 
    public void viewTheMap() {
        
      System.out.println("\nView some map options.");  
        
    }
    
    
    // The viewPrintAlist method
    // Purpose:  add some interest and creativity to the game
    // Parameters: none
    // Returns: none
    // =================================== 
    public void viewPrintAlist() {
       
        //HERE!
 
        //create a new displayPrintListMenu
        ListMenuView lmv = new ListMenuView();
    
        // call the displayMenu()
        // Before changing to inherit and name, it was displayListMenuView
          lmv.displayMenu();
    }
    
    // The moveToANewLocation method
    // Purpose:  provides the user with a set of list options
    // Parameters: none
    // Returns: none
    // =================================== 
    public void moveToANewLocation () {
        
       // Prompt for and get the user’s name.
        String location;
        System.out.println("\nPlease enter your coordinates: ");
        location = keyboard.next();   
       
      // Display new location description
        System.out.println("\nCoordinates: " + location  
                          + ". In this location"
                          + "...");
    }

    // The manageTheCrops method
    // Purpose: the user will be taken though all of the steps 
    //          outlined in the "play of the Game"
    // Parameters: none
    // Returns: none
    // =================================== 
    public void manageTheCrops() {

        CropView.runCropsView();
    }
    
    //Return to the main menu

    
}
