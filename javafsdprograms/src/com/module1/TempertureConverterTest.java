package com.module1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TempertureConverterTest {
	
	@Test
	void testToFahrenhit() {
		assertEquals(98.6f, TempertureConverter.toFahrenhit(37f),0.001f);
		assertEquals(212f, TempertureConverter.toFahrenhit(100f),0.001f);
	}
	
	@Test
	void testToCelsius() {
		assertEquals(37f, TempertureConverter.toCelsius(98.6f), 0.001f);
		assertEquals(100f, TempertureConverter.toCelsius(212f), 0.001f);
	}
	
	@Test
	void testConvertTemperature() {
		assertEquals(98.6f, TempertureConverter.convert(37f, TempertureConverter.C_TO_F), 0.001f);
		assertEquals(37f, TempertureConverter.convert(98.6f, TempertureConverter.F_TO_C), 0.001f);
	}
}
