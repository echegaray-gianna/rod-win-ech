// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Echegaray Gianna
// Date last modified: 12 June 2018
//-------------------------------------------------------------
package byu.cit260.view;

import java.util.Scanner;
import byu.cit260.cityOfAaron.CityOfAaron;


public class GameMenuView {
   
    private String theGameMenu;
    private int max;
    Scanner keyboard = new Scanner(System.in);
   
  
    public GameMenuView() {
        theGameMenu = "\n"
                + "**********************************\n"
                + "* CITY OF AARON: GAME MENU  *\n"
                + "**********************************\n"
                + " 1 - View the map\n"
                + " 2 - View / print a list\n"
                + " 3 - Move to a new location\n"
                + " 4 - Manage the crops\n"
                + " 5 - Return to the Main menu\n";                
        max = 5;
    }
    
    
    // The displayGameMenuView method
    // Purpose: displays the game menu, gets the user's input, and 
    //          does the selected action
    // Parameters: none
    // Returns: none
    // ========================================================= 
    public void displayGameMenuView (){
        
        int gameMenuOption;
        do{
          
            // Display the menu
            System.out.println(theGameMenu);

            // Prompt the user and get the user’s input
            gameMenuOption = getGameMenuOption();

            // Perform the desired action
            doAction(gameMenuOption);

            // Determine and display the next view   
        } while (gameMenuOption != max);  
            
        }
      
    
    // The getGameMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================     
    public int getGameMenuOption() {
 
        // declare a variable to hold user’s input
        int userInput;

        // begin loop
        do {
            // get user input from the keyboard
            userInput = keyboard.nextInt();

            // if it is not a valid value, output an error message
            if (userInput < 1 || userInput > max) {
                System.out.println("\noption must be between 1 and " + max);
            }
            
            // go back to the top of the loop if input was not valid 
        } while (userInput < 1 || userInput > max);

        // return the value input by the user
        return userInput;  
        
    }
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================  
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
               ReturnToTheMainMenu();
               break;
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
        DisplayPrintListMenu dplm = new DisplayPrintListMenu();
    
        // call the displayMenu()
          dplm.displayListMenuView();
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

        System.out.println("\nManage The Crops.");
    }
    
    //Return to the main menu
    public void ReturnToTheMainMenu() {
        MainMenuView mmv = new MainMenuView();
         mmv.displayMainView();
    }
    
}
