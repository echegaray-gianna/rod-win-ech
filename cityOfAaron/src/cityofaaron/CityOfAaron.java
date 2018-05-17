/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import byui.cit260.model.ListItem;
import byui.cit260.model.Location;
import byui.cit260.model.Player;
import byui.cit260.model.TeamMember;

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
       System.out.println("Location description = " + myLocation.getDescription());
       System.out.println("Location symbol = " + myLocation.getSymbol());
       
       //TESTING LISTITEM
       //Creating an object
       ListItem itemOne = new ListItem();
       
       // setting values to itemOne attributes
       itemOne.setName("Wheat");
       itemOne.setNumber(1);
       
       //Displaying the values
       System.out.println("Item One Name: " + itemOne.getName());
       System.out.println("Item One Number: " + itemOne.getNumber());
    }
    
}
