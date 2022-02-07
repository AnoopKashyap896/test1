package com.test.junit1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArithmatTest {
	private Arithmat calc;

	@Before
	public void setUp() throws Exception {
		calc=new Arithmat();
	}

	@After
	public void tearDown() throws Exception {
		calc=null;
	}

	@Test
	public void testAdd() {
		assertTrue(calc.add(10, 10)==20);
	}
	@Test
	public void testSubtract() {
		assertTrue(calc.subtract(10, 1)==9);
	}
	@Test
	public void testAdd1() {
		assertTrue(calc.add(10, 0)==10);
	}

}
