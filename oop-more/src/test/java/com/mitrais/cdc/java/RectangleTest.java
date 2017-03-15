package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testRectangle() {
		Rectangle r = new Rectangle(10, 12);
		assertTrue(r.getWidth() == 10);
		assertTrue(r.getHeight() == 12);
	}

	@Test
	public void testSetWidth() {
		Rectangle r = new Rectangle(10, 12);
		r.setWidth(20);
		assertTrue(r.getWidth() == 20);
	}

	@Test
	public void testSetHeight() {
		Rectangle r = new Rectangle(10, 12);
		r.setHeight(25);
		assertTrue(r.getHeight() == 25);
	}

	@Test
	public void testGetArea() {
		Rectangle r = new Rectangle(10, 12);
		int wideArea = 10 * 12;
		assertTrue(r.getArea() == wideArea);
	}

	@Test
	public void testToString() {
		Rectangle r = new Rectangle(10, 12);
		assertNotNull(r.toString());
		assertTrue(r.toString().getClass().equals(String.class));
	}

}
