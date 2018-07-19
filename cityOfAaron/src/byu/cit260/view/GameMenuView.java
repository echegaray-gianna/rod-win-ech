// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Echegaray Gianna
// Date last modified: 12 June 2018
//-------------------------------------------------------------
package byu.cit260.view;

import byu.cit260.cityOfAaron.CityOfAaron;
import byui.cit260.model.Game;
import byui.cit260.model.Location;
import byui.cit260.model.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gianna
 */
public class GameMenuView extends MenuView {

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
            case 3: {
            try {
                // moveToANewLocation
                moveToANewLocation();
            } catch (Exception ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 4:{
            try {
                // manageTheCrops
                manageTheCrops();
            } catch (Exception ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 5: //ReturnToTheMainMenu
                return;

        }
    }

    // The viewTheMap method
    // Purpose:  displays the map of the village
    // Parameters: none
    // Returns: none
    // =================================== 
    public void viewTheMap() {
        // get the map from the game
        Map theMap = CityOfAaron.getTheGame().getMap();
        Location loc;
        // print the header
        System.out.print("\t***** VILAGE MAP *****\n");
        System.out.print("      1     2     3     4     5" );
        
        // iterate through the matrix and output the simbol of each location
        for(int i = 0; i < 5; i++){
            int row = i +1;
            System.out.print("\n " + row + " | ");
            for(int j = 0; j < 5; j++) {
                // get the location object of the current row/col
                loc = theMap.getLocation(i, j);
                String print = j != 4 ? loc.getSymbol() + " | " : loc.getSymbol() + " |";
                System.out.print(print);
            }
            System.out.print("\n");
        }
        
        // print a discription list of the keys
        System.out.println("\nKey:");
        System.out.println("~~~ - River");
        System.out.println("!!! - Farmland");
        System.out.println("$$$ - Town");
        System.out.println("=== - Road");
        System.out.println("### - Forest");

    }

    // The viewPrintAlist method
    // Purpose:  add some interest and creativity to the game
    // Parameters: none
    // Returns: none
    // =================================== 
    public void viewPrintAlist() {

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
    public void moveToANewLocation() throws Exception {
        int row;
        int column;
        Location locat; 
        String position;
        
        try{
            
        do{
        System.out.println("\nEnter the coordinates of the location you want to move to. \n"
                + "** The coordinate have to be a number between 1 to 5. \n"
                + "\nEnter the x-coordinate: ");
        row = keyboard.nextInt() -1;
        System.out.println("\nEnter the y-coordinate: ");
        column = keyboard.nextInt() -1;

            // if it is not a valid value, output an error message
            if (row < 0 || row > 4 || column < 0 || column > 4) {
                System.out.println("\nOption must be between 1 and 5");
            }
            // go back to the top of the loop if input was not valid 
        } while (row < 0 || row > 4 || column < 0 || column > 4);
        
        Game game = CityOfAaron.getTheGame();
        // get the location
        locat = game.getMap().getLocation(row, column);
        
        // set the players position
        game.getThePlayer().setColumn(column);
        game.getThePlayer().setRow(row);
        
        // get the description
        position = locat.getDescription();
        
        System.out.println(position);
        
        
        } catch (Exception e) {
             System.out.print("An error ocured, sorry! Try again");
        }    
    }

    // The manageTheCrops method
    // Purpose: the user will be taken though all of the steps 
    //          outlined in the "play of the Game"
    // Parameters: none
    // Returns: none
    // =================================== 
    public void manageTheCrops() throws Exception {

        CropView.runCropsView();
    }
}
