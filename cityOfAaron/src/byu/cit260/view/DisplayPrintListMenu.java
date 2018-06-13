/*
 * Display/Print List Menu provides user with set
 * of list options.
 */
package byu.cit260.view;

import java.util.Scanner;
import byu.cit260.cityOfAaron.CityOfAaron;

/**
 *
 * @author karly
 */
public class DisplayPrintListMenu {

    private String Game;
    private String cropData;
    private int max;
    private Scanner keyboard = new Scanner(System.in);
   


public void printListMenu(){

    System.out.println("n"
                + "Animals in the storehouse: "
                + "Tools in the storehouse: "
                + "Provisions in storehouse include:" + cropData 
                + "Authors of this game: Hernan Rodgriguez, Gianna Echegaray, and Karly Winters");
}
 public void ReturnToTheMainMenu() {
        MainMenuView mmv = new MainMenuView();
         mmv.displayMainView();
}
}