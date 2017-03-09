package com.mitrais.cdc.java.easier;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FlipCoins2Test {

	@Test
	public void test() {
		List<String> stringList = new ArrayList<String>();
		stringList.add("head");
		stringList.add("tail");
		
		String result = FlipCoins2.flipCoins();
		assertFalse(result.equals(null));
		assertTrue(result.getClass().equals(String.class));
		assertTrue(stringList.contains(result.toLowerCase()));
	}

}