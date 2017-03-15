package com.mitrais.cdc.java;

/** Represents a simplistic Rectangle. Also see the Square subclass.
 *  <p>
 *  
 *  To Do:
 *  1. Change the variable visibility to private and create getter setter
 *  2. Add some simple JavaDoc comments above each class, constructor, and public method. and generate javadoc.
 *  3. Add a toString method 
 */

public class Rectangle {
  public double width, height;

  /** Builds a Rectangle with the given width and height. */
  
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return(width * height);
  }
  
}