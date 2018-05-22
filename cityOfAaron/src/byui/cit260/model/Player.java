/*
 * The Player() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team Members: Gianna Echegaray, Hernan Rodriguez, Karly Winters
 */
package byui.cit260.model;

import java.io.Serializable;

/**
 *
 * @author Gianna
 */
public class Player implements Serializable {
    private String name;
    
    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

