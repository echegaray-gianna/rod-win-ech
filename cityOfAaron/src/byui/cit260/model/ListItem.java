/*
 * The ListItem() class file for the cityOfAaron project.
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
public class ListItem implements Serializable {
    
    //class instance variables
    private String name;
    private int number;

    //contructor
    public ListItem() {
    }

    //getting and setting   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    

   
    
    
}
