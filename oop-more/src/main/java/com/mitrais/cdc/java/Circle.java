package com.mitrais.cdc.java;

/** Represents a simplistic Circle. Used to illustrate encapsulation 
 *  (private instance variables and associated accessor methods) and
 *  JavaDoc (these comments).
 *  
 *  To Do:
 *  1. Change the variable visibility to private and create getter setter
 *  2. Add some simple JavaDoc comments above each class, constructor, and public method, and generate javadoc.
 *  3. Add a toString method 
 */

public class Circle {
	
  public double radius;

  /** Builds a Circle with the given radius. */
  
  public Circle(double radius) {
	  // set local radius from parameter
  }


  public double getArea() {
    return(Math.PI * radius * radius);
  }

  public void setArea(double area) {
    radius = Math.sqrt(area / Math.PI);
  }
}