package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testSquare() {
		Square s = new Square(5);
		assertTrue(s.getHeight() == 5);
		assertTrue(s.getWidth() == 5);
	}


}
