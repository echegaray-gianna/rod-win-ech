/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

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
       Player playerOne = new Player();
        
       playerOne.setName("Fred");
       
       String playerOneName = playerOne.getName();
       String teamMemberName = TeamMember.memberOne.getName();
       String teamMemberTitle = TeamMember.memberOne.getTitle();
       
       System.out.println("Name = " + playerOneName);
       System.out.println("Team Member: " + teamMemberName + " " + teamMemberTitle);
       
    }
    
}
