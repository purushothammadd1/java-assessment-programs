package com.practise.time;

public class Time {
	private int second;
	private int minute;
	private int hour;
	public Time() {
		super();
	}
	public Time(int second, int minute, int hour) {
		super();
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	@Override
	public String toString() {
		return "Time [second=" + second + ", minute=" + minute + ", hour=" + hour + "]";
	}
	
	public void setTime(int second,int minute,int hour) {
		//No input validation
		this.second=second;
		this.minute=minute;
		this.hour=hour;
	}
	public Time nextSecond() {
		second++;
		if(second >=60) {
			second=0;
			minute++;
			if(minute >=60) {
				minute =0;
				hour++;
				if(hour >=24) {
					hour =0;
				}
			}
		}
		return this;
		
	}

}
