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
public enum TeamMember implements Serializable {
    
    memberOne("Karly", "Winters"),
    memberTwo("Hernan", "Rodriguez"),
    memberThree("Gianna", "Echegaray");
    
    private String name;
    private String title;
    private ArrayList<Game> games = new ArrayList<Game>();
            
    TeamMember(String name, String title) {
      this.name = name;
      this.title = title;
    }

    public String getName() {
        return name;
    }
    public String getTitle() {
        return title;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }


}
