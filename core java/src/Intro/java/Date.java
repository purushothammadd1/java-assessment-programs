package Intro.java;

public class Date {
	private int day;
	private int month;
	private int year;
	
	
	private static final int MAX_MONTH =12;
	
	public static final int[] NON_LEAP_CALENDAR = {0, 31,28,31,30,31,30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_CALENDAR = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	//DATA IS CODE
	
	public Date() {
		day=1;
		month=1;
		year=1970;
	}
	public static boolean isLeapYear(int year) {
		return (year % 400 ==0) || (year % 100 !=0 && year % 4 ==0);
	}
	public Date(int day,int month,int year) {
		if(year <0) {
			System.out.println("Invalid year, setting to 1970");
			year =1970;
		}
		else {
			this.year=year;
			
		}
		if(month < 0 || month >MAX_MONTH) {
			System.out.println("Invalid month, setting to 1");
			month =1;
		}
		else {
			this.month=month;
		}
		int[] realCalendar = isLeapYear(year) ? LEAP_CALENDAR: NON_LEAP_CALENDAR;
		if(day < 0 || day > realCalendar[month]) {
			System.out.println("Invalid day, setting to 1");
			day=1;
		}
		else {
			this.day=day;
		}
	}
	public Date nextDay() {
		int[] realCalendar =isLeapYear(year) ? LEAP_CALENDAR : NON_LEAP_CALENDAR;
		Date temp =new Date();
		temp.day=day+1;
		temp.month=month;
		temp.year=year;
		if(temp.day > realCalendar[month]) {
			temp.month +=1;
			temp.day =1;
		}
		if(temp.month > MAX_MONTH) {
			temp.year +=1;
			temp.month =1;
		}
		return temp;
	}
	public String toString() {
		return String.format("%02d/%02d/%d", day,month,year);
	}
	

}
