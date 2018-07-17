/*
 * Display/Print List Menu provides user with lists of what's in their inventory. 
 * Author: Karly Winters
 * Date Modified: 6/13/18
 */
package byu.cit260.view;

import byu.cit260.cityOfAaron.CityOfAaron;
import byui.cit260.model.Game;
import byui.cit260.model.ListItem;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListMenuView extends MenuView {

    private static Game theGame = CityOfAaron.getTheGame();

    public ListMenuView() {

        super(
                "\n"
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
         int option;
         try {
             do{
                System.out.println("\nEnter 1 to print your list, or enter 2 to view your list.\n");
                option = keyboard.nextInt();
                
                if (option != 1 && option != 2) {
                    System.out.println("\nPlease try again.");
                }
            } while (option != 1 && option != 2);
                if (option == 1) {
                    printAnimalsList();
                } else {
                   System.out.println("\nHere are the animals you have in the storehouse: "); 
                   ArrayList<ListItem> animals = theGame.getAnimals();
    
                   for (ListItem ani : animals) {
            System.out.println("\t" + ani.getName() + ": " + ani.getNumber());
        }
    }
                 } catch (Exception e) {
             System.out.print("Sorry, an error ocurred!");
        }
    }


    // The toolsInStorehouse method
    // Purpose: adds user interactivity to the game
    // Parameters: none
    // Returns: none
    public void toolsInStorehouse() {

        int option;

        try {
            do {
                System.out.println("Enter 1 to view your list, or enter 2 to print your list.");
                option = keyboard.nextInt();

                if (option != 1 && option != 2) {
                    System.out.println("\nWhoops! Try entering one or two if you would like to view or print a list.\n");
                }

            } while (option != 1 && option != 2);
            
            if (option == 1) {
                printToolsList();
            } else {
                System.out.println("\nHere are tools you have in the storehouse: \n");
                ArrayList<ListItem> tools = theGame.getTools();

                //Make a for loop iterating for each item in the array
                for (ListItem item : tools) {
                    //Display the item name and the amount
                    System.out.println("\t" + item.getName() + ": " + item.getNumber());
                }
            }
        } catch (Exception e) {
            System.out.println("Sorry, there was an error!");
        }

        System.out.println("\nHere are the tools you have in the storehouse: ");
        ArrayList<ListItem> tools = theGame.getTools();

        for (ListItem tool : tools) {
            System.out.println("\t" + tool.getName() + ": " + tool.getNumber() + "\n");
        }
    }

    // The provisionsInStorehouse method
    // Purpose:  provides the user with a set of list options
    // Parameters: none
    // Returns: none
    // =================================== 
    public void provisionsInStorehouse() {
        int option;
        try {
            do {
                System.out.println("\nDo you want to print(1) or view(2) the list?: \n");
                option = keyboard.nextInt();

                if (option != 1 && option != 2) {
                    System.out.println("\nInput must be 1 or 2, please try again.");
                }
            } while (option != 1 && option != 2);

            if (option == 1) {
                printProvisionsList();
            } else {
                System.out.println("\nHere are provisions you have in the storehouse: \n");
                ArrayList<ListItem> provisions = theGame.getProvisions();

                //Make a for loop iterating for each item in the array
                for (ListItem item : provisions) {
                    //Display the item name and the amount
                    // the \t gives space in front of the list item
                    System.out.println("\t" + item.getName() + ": " + item.getNumber());
                }
            }
        } catch (Exception e) {
             System.out.print("An error ocured, sorry!");
        }
    }

    // The manageTheCrops method
    // Purpose: the user will be taken though all of the steps 
    //          outlined in the "play of the Game"
    // Parameters: none
    // Returns: none
    // =================================== 
    public void authorsOfGame() {

        System.out.println("\nAuthors of this game are:"
                + "\nHernan Rodriguez"
                + "\nGianna Echegaray"
                + "\nKarly Winters");
    }

    public void printProvisionsList() {
        // declare a string to hold the file name
        String filePath;
        // declare a reference to a PrintWriter object
        PrintWriter printWriter = null;
        // prompt the user for a file name, get and save the user’s input
        keyboard.nextLine();
        System.out.println("Please indicate a file path: \n");
        filePath = keyboard.nextLine();

        try {
            // create the PrintWriter object
            printWriter = new PrintWriter(filePath);
            // get a reference to the ArrayList you want to output
            ArrayList<ListItem> provisions = theGame.getProvisions();
            // output a heading for the report
            printWriter.println("\tProvisions List");
            printWriter.println(" DESCRIPTION\t \tAMOUNT");
            // use a for loop to get the data from the ArrayList
            // and output it
            for( int i = 0; i < provisions.size(); i++){
                printWriter.println( i+1 + "- " + provisions.get(i).getName() + "\t \t" + provisions.get(i).getNumber());
            }
            
            System.out.println("\nFile printed successfully!");
        } catch (Exception e) {
            System.out.println("There was an error while printing the file.");
        } finally {
            // if(output != null) close the file
            if(printWriter != null){
                printWriter.close();
            }
        }
    }

    // The printanimalsList method
    // Purpose:  output a report to disk 
    // Parameters: none
    // Returns: none
    public void printAnimalsList() {
    // declare a string to hold the file name
        String filePath;
        // declare a reference to a PrintWriter object
        PrintWriter printWriter = null;
        // prompt the user for a file name, get and save the user’s input
        keyboard.nextLine();
        System.out.println("Please indicate the file path: \n");
        filePath = keyboard.nextLine();

        try {
            // create the PrintWriter object
            printWriter = new PrintWriter(filePath);
            // get a reference to the ArrayList you want to output
            ArrayList<ListItem> animals = theGame.getAnimals();
            // output a heading for the report
            printWriter.println("\tAnimals List");
            printWriter.println(" ANIMALS\t \tAMOUNT");
            // use a for loop to get the data from the ArrayList
            // and output it
            for( int i = 0; i < animals.size(); i++){
                printWriter.println( i+1 + "- " + animals.get(i).getName() + "\t \t" + animals.get(i).getNumber());
            }
            
            System.out.println("\nFile printed successfully!");
        } catch (Exception e) {
            System.out.println("There was an error while printing the file.Please try again.");
        } finally {
            // if(output != null) close the file
            if(printWriter != null){
                printWriter.close();
            }
        }
    }

    public void printToolsList() {
        
        // declare a string to hold the file name
        String filePath;
        // declare a reference to a PrintWriter object
        PrintWriter printWriter = null;
        // prompt the user for a file name, get and save the user’s input
        keyboard.nextLine();
        System.out.println("Enter file path.");
        filePath = keyboard.nextLine();

        try {
            // create the PrintWriter object
            printWriter = new PrintWriter(filePath);
            // get a reference to the ArrayList you want to output
            ArrayList<ListItem> tools = theGame.getTools();
            // output a heading for the report
            printWriter.println("\tTools List");
            printWriter.println(" DESCRIPTION\t \tAMOUNT");

            // use a for loop to get the data from the ArrayList and output it
            for( int i = 0; i < tools.size(); i++){
                printWriter.println( i + 1 + "- " + tools.get(i).getName() + "\t \t" + tools.get(i).getNumber());
            }

        } catch (Exception e) {
            // output error message
                System.out.println("Sorry, there was an error...");
        } finally {
            // if(output != null) close the file
            if (printWriter != null);
                printWriter.close();
        }
    }

    
    
    
}