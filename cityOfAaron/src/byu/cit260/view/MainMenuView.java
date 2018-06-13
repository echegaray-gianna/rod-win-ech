// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Rodriguez Hernan, Winters Karly, Echegaray Gianna team
// Date last modified: 5 June 2018
//-------------------------------------------------------------
package byu.cit260.view;

import java.util.Scanner;
import byu.cit260.cityOfAaron.CityOfAaron;
import byui.cit260.model.CropData;
import byui.cit260.model.Game;
import byui.cit260.model.Player;

/**
 *
 * @author Gianna
 */
public class MainMenuView {

    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;
    HelpMenuView hmv = null;

    public MainMenuView() {
        theMenu = "\n"
                + "**********************************\n"
                + "* CITY OF AARON: MAIN GAME MENU  *\n"
                + "**********************************\n"
                + " 1 - Start new game\n"
                + " 2 - Get and start a saved game\n"
                + " 3 - Get help on playing the game\n"
                + " 4 - Save game\n"
                + " 5 - Quit\n";
        max = 5;
        hmv = new HelpMenuView();
    }

    // The displayMenuView method
    // Purpose: displays the menu, gets the user's input, and 
    //          does the selected action
    // Parameters: none
    // Returns: none
    // =========================================================   
    public void displayMainView() {

        int menuOption;
        do {

            // Display the menu
            System.out.println(theMenu);

            // Prompt the user and get the user’s input
            menuOption = getMenuOption();

            // Perform the desired action
            doAction(menuOption);

            // Determine and display the next view   
        } while (menuOption != max);
    }

    
    // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================       
    public int getMenuOption() {
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
        // if the option is 1, call startNewGame( )
        // if the option is 2, call startExistingGame( )
        // if the option is 3, call displayHelpMenu( )
        // if the option is 4, call displaySaveGame( )
        // if the option is 5, display a goodbye message
        switch (option) {
            case 1:  // create and start a new game
                startNewGame();
                break;
            case 2: // get and start a saved game
                startSavedGame();
                break;
            case 3: // get help menu
                displayHelpMenuView();
                break;
            case 4:// save game
                displaySaveGameView();
                break;
            case 5:
                System.out.println("Thanks for playing... goodbye");
        }
    }

    // The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    // =================================== 
    public void startNewGame() {

        //Create a new Game object.
        Game theGame = new Game();

        // Create a CropData object, 
        CropData cropData = new CropData();

        // initialize it
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setOffering(10);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setOfferingBushels(300);
        cropData.setAcresPlanted(1000);

        // save a reference to it in the Game 
        theGame.setCropData(cropData);

        // Save a reference to it in the GameProject class.
        CityOfAaron.setTheGame(theGame);

        // Display the Banner Page.
        System.out.println("\nGreetings! This is the city of Aaron where you have been chosen by the people to be our ruler. You will be responsible for the buying and selling of land, how much wheat to plant and how much to set aside. It is also your job to pay tithe on the harvested wheat. Failure to do so will result in starvation, death, and diminished workforce. Plan wisely as there is also the danger of rats eating your wheat. ");

        // Create a new Player object
        Player thePlayer = new Player();

        // Prompt for and get the user’s name.
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();

        // Save the user’s name in the Player object
        thePlayer.setName(name);

        // Save a reference to the player object in the Game object
        theGame.setThePlayer(thePlayer);

        // Display a welcome message
        System.out.println("\nWelcome " + name + " have fun");

        // Display the Game menu
        //System.out.println("\nStart new game option selected.");
    }

    // The startSavedGame method
    // Purpose: save game object 
    // Parameters: none
    // Returns: none
    // =================================== 
    public void startSavedGame() {

        System.out.println("\nStart your saved game.");
    }

    // The displayHelpMenuView method
    // Purpose: display the help menu
    // Parameters: none
    // Returns: none
    // =================================== 
    public void displayHelpMenuView() {
        hmv.displayMenuView();
    }

    // The displaysavedGameView method
    // Purpose: display saved game
    // Parameters: none
    // Returns: none
    // =================================== 
    public void displaySaveGameView() {

        System.out.println("\nSaved Game.");
    }

    public static int payOffering() {

        // Is this done right?
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the percentage you would like to give for your tithe.");
        int payOffering = keyboard.nextInt();

        return payOffering;
    }

    void MainView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}