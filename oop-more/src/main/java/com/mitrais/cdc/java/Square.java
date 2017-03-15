package com.mitrais.cdc.java;

/** Represents a simplistic Square. Designed so that Squares are Rectangles,
 *  although it is not entirely clear that this is the best design in real
 *  life, as discussed on the exercise handout.
 *  <p>
 *  
 *  To Do:
 *  1. Make your Square inherit from Rectangle, but still enforce the restriction that the width and the height are the same. 
 *  2. Add some simple JavaDoc comments above each class, constructor, and public method, and generate javadoc. 
 *  3. Add a toString method  
 */

public class Square extends Rectangle {
  
  /** Builds a Square with the given side as both its width and its height. */
  
  public Square(double side) {
    super(side, side);
  }

  private void setSides(double side) {
	  // set width and height of object
  }
  
  public void setHeight(double height) {
  }
  
  public void setWidth(double width) {
  }

  public void setArea(double area) {
    setSides(Math.sqrt(area));
  }
}