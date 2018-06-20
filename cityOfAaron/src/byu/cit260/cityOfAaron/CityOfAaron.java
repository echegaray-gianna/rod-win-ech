/*
 * The main() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team Members: Gianna Echegaray, Hernan Rodriguez, Karly Winters
 */

// The City of Aaron Game
// The driver file, contains the main() method
// Author: Gianna Echegaray, Hernan Rodriguez, Karly Winters
// Date last modified: June 2018
//-------------------------------------------------------------


package byu.cit260.cityOfAaron;

import byu.cit260.view.*;
import byui.cit260.model.*;


public class CityOfAaron {

    //Lesson 7
    // variable for keeping a reference to the Game object
    private static Game theGame = null;
     
    // main function - entry point for the program
    // runs the main menu

    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) {
        CityOfAaron.theGame = theGame;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       //Lesson 7
       MainMenuView mmv = new MainMenuView();
       mmv.displayMenu();
    }
    
}
