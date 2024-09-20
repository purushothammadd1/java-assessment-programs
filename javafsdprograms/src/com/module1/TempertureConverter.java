package com.module1;

public class TempertureConverter {

	public static final boolean C_TO_F =true;
	public static final boolean F_TO_C =false;
	
	public static float toFahrenhit(float celsius) {
		return celsius * 9f/5f + 32f;
	}
	
	public static float toCelsius(float fahrenhit) {
		return (fahrenhit - 32f) * 5f / 9f;
	}
	public static float convert(float temp, boolean conversionCode) {
		if(conversionCode == C_TO_F) {
			return toFahrenhit(temp);
		}else {
			return toCelsius(temp);
		}
	}
	public static void main(String[] args) {
		float celsiusTemp=38f;
		System.out.println(toFahrenhit(celsiusTemp));
		System.out.println(toCelsius(98.6f));
	}
}
