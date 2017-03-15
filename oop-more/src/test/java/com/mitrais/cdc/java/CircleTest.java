package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testRadius() {
		 Circle c = new Circle(10);
		 assertTrue(c.getRadius() == 10);
	}

	
	@Test
	public void testArea() {
		Circle c = new Circle(10);
		double rad = Math.PI * 10 * 10;
		assertTrue(c.getArea() == rad);
	}

	@Test
	public void testToString() {
		Circle c = new Circle(10);
		assertNotNull(c.toString());
		assertTrue(c.toString().getClass().equals(String.class));
	}
	
	


}
