/*
 * The HelpMenuView contains few methods that will display to the user 
 * diferent information about the game and how to play it. 
 */
package byu.cit260.view;

import java.util.Scanner;

/**
 *
 * @author hernan rodriguez
 */
public class HelpMenuView {
    
    private String mainMenu;
    private int max;
    private Scanner keyboard = new Scanner(System.in);
    
    public  HelpMenuView(){
        mainMenu = "\n"
                + "-------------       --------------\n"
                + "    CITY OF AARON: HELP MENU  \n"
                + "-------------       --------------\n"
                + " 1 - What are the goals of the game?\n"
                + " 2 - Where is the city of Aaron?\n"
                + " 3 - How do I view the map?\n"
                + " 4 - How do I move to another location?\n"
                + " 5 - How do I display a list of animals, provisions and tools in the city storehouse?\n"
                + " 6 - Back to the Main Menu\n";
        max = 6;
    }
    
    public void displayMenuView(){
        int menuOption;
        do {
            // Display the menu
            System.out.println(mainMenu);
            // Prompt the user and get the user’s input
            menuOption = getMenuOption();
            // Perform the desired action
            doAction(menuOption);
            // Determine and display the next view   
        } while (menuOption != max);
    }
    
    public int getMenuOption(){
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
        } while (userInput < 1  && userInput > max);
        // return the value input by the user
        return userInput;
    }
    
    
    public void doAction(int option){
        switch (option) {
            case 1:  // What are the goals of the game?
                viewGoals();
                break;
            case 2: // Where is the city of Aaron?
                viewMapHelp();
                break;
            case 3: // How do I view the map?
                viewMapHelp();
                break;
            case 4:// How do I move to another location?
                viewMoveHelp();
                break;
            case 5:// How do I display a list of animals, provisions and tools in the city storehouse?
                viewListHelp();
                break;
            case 6:// Back to the Main Menu.
                System.out.println("Back to the Main Menu.");
        }
    }
    public void viewGoals(){
        System.out.println("View Goals...");
    }
    public void viewMapHelp(){
        System.out.println("View Map Help...");
    }
    public void viewMoveHelp(){
        System.out.println("View Move Help...");
    }
    
    public void viewListHelp(){
        System.out.println("View List Help...");
    }
    
}
