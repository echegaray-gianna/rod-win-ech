// The MenuView class – base abstract class for all menu views
// Author: Hernan Rodriguez, Karly Winters, Gianna Echegaray
// Date last modified: June 2018
//-------------------------------------------------------------
package byu.cit260.view;

import java.util.Scanner;

/**
 *
 * @author hernan
 */
public abstract class MenuView implements ViewInterface{
    
    // the data members common to all menu views
    protected final static Scanner keyboard = new Scanner(System.in);
    protected String menu;  // this string holds the menu string
    protected int max; // this int holds the max input value
    
    // MenuView Constructor
    // Purpose: Initialize the view object with the menu string
    // Parameters: the menu string and the max value
    // Returns: none
    public MenuView(String _menu, int _max)
    {
        menu = _menu;
        max = _max;
    }

    
    // The displayMenu method
    // Purpose: displays the menu, gets the user's input, and does the 
    //  selected action
    // Parameters: none
    // Returns: none
    // ===================================
    @Override
    public void displayMenu() {

        int menuOption;
        do {
            // Display the menu
            System.out.println(menu);

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
    @Override
    public int getMenuOption() {
        // declare a variable to hold user’s input
        int userInput;

        // begin loop
        do {
            System.out.format("\nPlease enter an option between 1 - %d: ", max);
            // get user input from the keyboard
            userInput = keyboard.nextInt();

            // if it is not a valid value, output an error message
            if (userInput < 1 || userInput > max) {
                System.out.println("\nOption must be between 1 and " + max);
            }
            
            // go back to the top of the loop if input was not valid 
        } while (userInput < 1 || userInput > max);

        // return the value input by the user
        return userInput;

    }
    
    @Override
    public void doAction(int option) {
        // Implement in each class... 
    }
}
