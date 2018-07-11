/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.model;

import java.io.Serializable;

/**
 *
 * @author Gianna
 */
public class Map implements Serializable{
    // stores the number of rows 
     private int rowCount;  
     
      // stores the number of columns
     private int colCount;   
     
     // a reference to a 2-dimensional array
     // of Location objects
     private Location[][] locations;     
    
 // default Map constructor
 // Purpose: Set data members to default values
 // Parameters: none
 // Returns: none
public Map(int _rows, int _cols)
 {
     rowCount = _rows;
     colCount = _cols;
        
     // create the array of location objects
     locations = new Location[_rows][_cols];        
}

// The getLocation method
// Purpose: returns the location object at the given row and column
// Parameters: a row and column
// Returns: a Location object

public Location getLocation(int row, int col)
 {
     return locations[row][col];
 }

// The setLocation method
// Purpose: stores a location object at the  row and column
// Parameters: a row and column, and a reference to a location object
// Returns: void
public void setLocation(int row, int col, Location _location)
 {
    locations[row][col] = _location;
 } 

    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }






}
