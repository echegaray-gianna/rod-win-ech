/*
 * The TeamMember() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team Members: Gianna Echegaray, Hernan Rodriguez, Karly Winters
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
    
    private final String name;
    private final String title;
    private ArrayList<Game> games = new ArrayList<>();
            
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

    //ListItem
    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }


}
