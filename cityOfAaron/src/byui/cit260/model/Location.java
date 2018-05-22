/*
 * The Location() class file for the cityOfAaron project.
 * CIT-260
 * Spring 2018
 * Team Members: Gianna Echegaray, Hernan Rodriguez, Karly Winters
 */
package byui.cit260.model;

import java.io.Serializable;

/**
 *
 * @author Hernan
 */
public class Location implements Serializable {
    
    private String description;
    private String symbol;

    public Location() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    
    
}
