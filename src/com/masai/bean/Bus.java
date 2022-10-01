package com.masai.bean;

import java.sql.Time;
import java.util.Date;

public class Bus {
	private int busNo;
	private String busname;
	private String busRoute;
	private String busType;
	private int seat;
	private String arriveTime;
	
	private String departuretime;
	private String date;
	
	public Bus() {
		
	}

	public Bus(int busNo, String busname, String busRoute, String busType, int seat, String arriveTime,
			String departuretime, String date) {
		super();
		this.busNo = busNo;
		this.busname = busname;
		this.busRoute = busRoute;
		this.busType = busType;
		this.seat = seat;
		this.arriveTime = arriveTime;
		this.departuretime = departuretime;
		this.date = date;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public String getBusname() {
		return busname;
	}

	public void setBusname(String busname) {
		this.busname = busname;
	}

	public String getBusRoute() {
		return busRoute;
	}

	public void setBusRoute(String busRoute) {
		this.busRoute = busRoute;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getDeparturetime() {
		return departuretime;
	}

	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", busname=" + busname + ", busRoute=" + busRoute + ", busType=" + busType
				+ ", seat=" + seat + ", arriveTime=" + arriveTime + ", departuretime=" + departuretime + ", date="
				+ date + "]";
	}
	
	
	

}
