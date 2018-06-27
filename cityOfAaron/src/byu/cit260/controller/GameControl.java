/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.controller;

/**
 *
 * @author Gianna
 */
import java.util.ArrayList;
import byu.cit260.cityOfAaron.CityOfAaron;
import byui.cit260.model.*;

public class GameControl {

    // size of the Locations array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;

    // reference to a Game object
    private static Game theGame;

    public static void createNewGame(String pName) {
        // Created the game object. Save it in the main driver file
        theGame = new Game();
        CityOfAaron.setTheGame(theGame);

        // create the player object. Save it in the game object
        Player thePlayer = new Player();
        thePlayer.setName(pName);
        theGame.setThePlayer(thePlayer);

        // create the list of tools
        //create the list of provisions
        // create the Locations and the Map object        
    }

    // create the CropData object
    public static void createCropDataObject() {
        CropData theCrops = new CropData();

        theCrops.setYear(0);
        theCrops.setPopulation(100);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setNumberWhoDied(0);
        theCrops.setOffering(10);
        theCrops.setWheatInStore(2700);
        theCrops.setAcresOwned(1000);
        theCrops.setAcresPlanted(1000);
        theCrops.setHarvest(3000);
        theCrops.setOfferingBushels(300);
        theCrops.setAcresPlanted(1000);

        theGame.setCropData(theCrops);
    }

    // create the list of animals
    public static void createAnimalList() {
        ArrayList<ListItem> animals = new ArrayList<ListItem>();

        animals.add(new ListItem("cows", 12));
        animals.add(new ListItem("horses", 3));
        animals.add(new ListItem("pigs", 7));
        animals.add(new ListItem("goats", 4));

        theGame.setAnimals(animals);
    }
    
    
    // create the list of tools
    public static void createToolList() {
        ArrayList<ListItem> tools = new ArrayList<ListItem>();

        tools.add(new ListItem("hammer", 12));
        tools.add(new ListItem("screwdriver", 3));
        tools.add(new ListItem("axe", 7));
        tools.add(new ListItem("drill thing", 4));

        theGame.setTools(tools);
    }

    // The createMap method
    // Purpose: creates the location objects and the map
    // Parameters: none
    // Returns: none
    public static void createMap() {
        // create the Map object, it is 5 x 5
        // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);


        //*************************** RIVER ******************************
        String river = "\nYou are on the River. The river is the source"
                + "\nof life for our city. The river marks the eastern "
                + "\nboundary of the city - it is wilderness to the East.";

        // create a new Location object
        Location loc = new Location();

        // use setters in the Location class to set the description and symbol
        loc.setDescription(river);
        loc.setSymbol("~~~");

        // set this location object in each cell of the array in column 4      
        for (int i = 0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 4, loc);
        }
        //**************************** RIVER ******************************
        
        //**************************** FARM ******************************
        // define the string for a farm land location
        String farmland = "\nYou are on the fertile banks of the River."
                + "\nIn the springthis low farmland floods and is covered with rich"
                + "\nnew soil. Wheat is planted as far as you can see.";

        // set a farmland location with a hint
        loc = new Location();
        loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
        loc.setSymbol("!!!");
        for (int i = 0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 0, loc);
        }
        
        //**************************** FARM ******************************
        
        
        //**************************** TOWN ******************************
        // define the string for a farm land location
        String town = "\nYou are on the fertile banks of the River."
                + "\nIn the springthis low farmland floods and is covered with rich"
                + "\nnew soil. Wheat is planted as far as you can see.";

        // set a town location with a hint
        loc = new Location();
        loc.setDescription(town + "\nOne bushel will plant two acres of wheat.");
        loc.setSymbol("!!!");
        for (int i = 0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 1, loc);
        }
        
        //**************************** TOWN ******************************
        
        
        //**************************** ROAD ******************************
        // define the string for a road location
        String road = "\nYou are on the fertile banks of the River."
                + "\nIn the springthis low farmland floods and is covered with rich"
                + "\nnew soil. Wheat is planted as far as you can see.";

        // set a road location with a hint
        loc = new Location();
        loc.setDescription(road + "\nOne bushel will plant two acres of wheat.");
        loc.setSymbol("!!!");
        for (int i = 0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 2, loc);
        }
        
        //**************************** ROAD ******************************

        
         //**************************** FOREST ******************************
        // define the string for a forest location
        String forest = "\nYou are on the fertile banks of the River."
                + "\nIn the springthis low farmland floods and is covered with rich"
                + "\nnew soil. Wheat is planted as far as you can see.";

        // set a road location with a hint
        loc = new Location();
        loc.setDescription(forest + "\nOne bushel will plant two acres of wheat.");
        loc.setSymbol("!!!");
        for (int i = 0; i < MAX_ROW; i++) {
            theMap.setLocation(i, 3, loc);
        }
        
        //**************************** FOREST ******************************
        
        
        // Must go at the end.
        theGame.setMap(theMap);
    }

}