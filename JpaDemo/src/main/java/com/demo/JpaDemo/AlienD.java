package com.demo.JpaDemo;

public class AlienD {
	
	private int sid;
	private String name;
	private String tech;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "AlienD [sid=" + sid + ", name=" + name + ", tech=" + tech + "]";
	}
	
	

}
