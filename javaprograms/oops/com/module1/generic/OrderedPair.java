package com.module1.generic;

public class OrderedPair<K,V> implements Pair<K, V> {
	private K key;
	private V value;
	
	OrderedPair(K key,V value){
		this.key=key;
		this.value=value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "OrderedPair [key=" + key + ", value=" + value + "]";
	}
	
}
