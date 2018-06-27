/*
 * Display/Print List Menu provides user with lists of what's in their inventory. 
 * Author: Karly Winters
 * Date Modified: 6/13/18
 */

package byu.cit260.view;

import java.util.Scanner;




public class ListMenuView extends MenuView {
   
    public ListMenuView(){
            
                super (
                        "n"
                        + "---------------     --------------\n"
                        + " CITY OF AARON: DISPLAY LIST MENU  \n"
                        + "---------------     --------------\n"
                        + " 1 - Animals in storehouse\n"
                        + " 2 - Tools in storehouse\n"
                        + " 3 - Provisions in storehouse\n"
                        + " 4 - Authors of the game\n"
                        + " 5 - Return to Game Menu\n",
                        5);
    }
    
    // The doAction method
    // Purpose: performs  selected action
    // Parameters: none
    // Returns: none
    
    @Override 
    public void doAction(int option) {
        // if the option is 1, list for animals in storehouse( )
        // if the option is 2, list for tools in storehouse ( )
        // if the option is 3, list for provisions in storehouse( )
        // if the option is 4, list for authors of the game( )
        // if the option is 5, ReturnToTheGameMenu ( )
        switch (option) {
            case 1:  // animalsInStorehouse
                animalsInStorehouse();
                break;
            case 2: // toolsInStorehouse
                toolsInStorehouse();
                break;
            case 3: // provisionsInStorehouse
                provisionsInStorehouse();
                break;
            case 4:// authorsOfGame
                authorsOfGame();
                break;
            case 5: //ReturnToTheGameMenu
               return;
        }
    }
        
    // The animalsInStorehouse method
    // Purpose:  adds user interactivity to the game
    // Parameters: none
    // Returns: none
 
    public void animalsInStorehouse() {
        
      System.out.println("\nHere are the animals you have in the storehouse: ");  
        
    }
    
    
    // The toolsInStorehouse method
    // Purpose: adds user interactivity to the game
    // Parameters: none
    // Returns: none
 
    public void toolsInStorehouse() {
       
        System.out.println("\nHere are the tools you have in the storehouse: ");
    }
    
    // The provisionsInStorehouse method
    // Purpose:  provides the user with a set of list options
    // Parameters: none
    // Returns: none
    // =================================== 
    public void provisionsInStorehouse () {
       
        System.out.println("\nHere are provisions you have in the storehouse: ");  
        // Need to link CropData information with string above.
    }

    // The manageTheCrops method
    // Purpose: the user will be taken though all of the steps 
    //          outlined in the "play of the Game"
    // Parameters: none
    // Returns: none
    // =================================== 
    public void authorsOfGame() {

        System.out.println("\nAuthors of this game are:"
                + "Hernan Rodriguez"
                + "Gianna Echegaray"
                + "Karly Winters");
    }
    

    }  