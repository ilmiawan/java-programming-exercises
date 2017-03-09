package com.mitrais.cdc.java;

import java.awt.Color;

import javax.swing.*;

/*
 * Class main to run the ColorPanel4
 */
public class ColorFrame4 extends JFrame {
  public ColorFrame4() {
    super("Anonymous Inner Class");
    setContentPane(new ColorPanel4());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ColorFrame4();
  }
}