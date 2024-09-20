package com.module1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcTest{
	private final Calc c = new Calc();
	@Test
	void test() {
		int sum =c.add(1,2);
		assertEquals(3, sum);
	}
}
