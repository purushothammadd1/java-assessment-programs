package com.module2.files.dairy;

import java.util.HashMap;
import java.util.Objects;

public class Date {
	
	public static Integer[] nonLeapCalendar = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static Integer[] leapCalendar = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	private static final int MONTHS_IN_YEAR = 12;
	private static HashMap<Boolean, Integer[]> leapToDays = new HashMap<>();
	
	private int day;
	private int month;
	private int year;
	
	private void initMap() {
		leapToDays.put(true, leapCalendar);
		leapToDays.put(false, nonLeapCalendar);
	}
	public Date() {
		initMap();
		day =1;
		month =1;
		year =1970;
	}
	public Date(String slashSeparatedLine) {
		String[] dateComponents = slashSeparatedLine.split("/");
		day = Integer.valueOf(dateComponents[0]);
		month =Integer.valueOf(dateComponents[1]);
		year = Integer.valueOf(dateComponents[2]);
	}
	public Boolean isLeapYear() {
		return (this.year % 100 != 0 && this.year % 4 == 0) || (this.year % 400 == 0);
	}
	
	public Date(int day, int month, int year) throws InvalidDateException {
		initMap();
		if(month < 0 || month > MONTHS_IN_YEAR)
			throw new InvalidDateException("Invalid value for month: "+ month);
		Integer[] calendar = leapToDays.get(isLeapYear());
		if(day < 0 || day > calendar[month])
			throw new InvalidDateException("Invalid value for day: "+ day);
		this.day = day;
		this.month =month;
		this.year = year;
	}
	public Date nextDay() {
		Date temp = null;
		try {
			temp = new Date(this.day, this.month, this.year);
		} catch (InvalidDateException e) {
			e.printStackTrace();
		}
		temp.day++;
		Integer[] calendar = leapToDays.get(isLeapYear());
		
		if(temp.day > calendar[temp.month]) {
			temp.day = 1;
			temp.month++;
		}
		
		if(temp.month > MONTHS_IN_YEAR) {
			temp.month = 1;
			temp.year++;
		}
		return temp;
	}
	public Date prevDay() {
		Date temp =null;
		try {
			temp =new Date(this.day,this.month,this.year);
		} catch (InvalidDateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Integer[] calendar = leapToDays.get(isLeapYear());
		
		temp.day--;
		if(temp.day == 0) {
			temp.month--;
			if(temp.month == 0)
				temp.day = 31;
			else
				temp.day = calendar[temp.month];
		}
		if(temp.month == 0) {
			temp.year--;
			temp.month =MONTHS_IN_YEAR;
		}
		return temp;
	}
	private Integer[] generateCumulative(Integer[] arr) {
		Integer[] cumulative = new Integer[arr.length];
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j = 0; j <= i; j++ ) {
				sum += arr[j];
			}
			cumulative[i] = sum;
		}
		return cumulative;
	}
	public int dayOfYear() {
		Integer[] calendar =leapToDays.get(isLeapYear());
		Integer[] cumulativeCalendar = generateCumulative(calendar);
		return cumulativeCalendar[this.month - 1] + this.day;
	}
	
	public String toString() {
		return day + "/" + month + "/" + year;
	}
	public static void main(String[] args) {
		try {
			Date d=new Date(10,2,2024);
			System.out.println(d.prevDay());
			System.out.println(d.dayOfYear());
		}catch (InvalidDateException e) {
			e.printStackTrace();
		}
	}
	public int hashcode() {
		return Objects.hash(day,month,year);
	}
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
}
