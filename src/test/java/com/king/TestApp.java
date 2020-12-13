package com.king;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestApp {
	@Test
	public void testGcd(){
		int result = App.gcd(28,12);
		assertEquals(result, 4);
	}

	@Test
	public void testAnother(){
		int result = App.gcd(45, 120);
		assertEquals(result, 15);
	}
}
