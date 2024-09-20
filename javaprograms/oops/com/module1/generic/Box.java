package com.module1.generic;

public class Box<T> {
	T x;
	T y;
	
	Box(T x,T y){
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Box [x=" + x + ", y=" + y + "]";
	}
	
}
