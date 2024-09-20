package com.module1.generic;

public class NumberBox <T extends Number>{
	T number;
	
	NumberBox(T number) {
		this.number=number;
	}
	public T getNumber() {
		return number;
	}
	@Override
	public String toString() {
		return "NumberBox [number=" + number + "]";
	}
}
