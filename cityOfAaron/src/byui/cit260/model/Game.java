/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Gianna
 */
public class Game implements Serializable{

    private Player player;
    private CropData cropData;
    private ArrayList<ListItem> items = new ArrayList<>();
    
    
    public Game() {
    }

    //Player
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    //CropData
    public CropData getCropData() {
        return cropData;
    }

    public void setCropData(CropData cropData) {
        this.cropData = cropData;
    }

    //ListItem
    public ArrayList<ListItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<ListItem> items) {
        this.items = items;
    }
    
    
 }
