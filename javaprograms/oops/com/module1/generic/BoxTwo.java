package com.module1.generic;

public class BoxTwo<T,U> {
	T first;
	U second;
	
	public BoxTwo(T first, U second) {
		this.first=first;
		this.second=second;
	}
	T getFirst() {
		return first;
	}
	U getSecond() {
		return second;
	}
	public String toString() {
		return "BoxTwo{"+"first=" + first +", second="+ second+'}';
	}
}
