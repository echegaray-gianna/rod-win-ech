/*
 * This holds the exception classes. 
 * Authors: Hernan Rodriguez, Gianna Echegaray, and Karly Winters
 */
package byu.cit260.view;

/**
 *
 * @author karly
 */

public class CropException extends Exception {
    
    // Default constructor
    // Purpose: Initializes data members to default values
    // Parameters: none
    // Returns: none
    public CropException() {
    
    }
    // Parameterized  constructor
    // Purpose: Initializes data members to value passed as a parameter
    // Parameters: A string containing the error message
    // Returns: none
    public CropException(String string)
    {
        super(string);
        System.out.println("Error Message"); 
    } 


}
