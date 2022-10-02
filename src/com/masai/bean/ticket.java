package com.masai.bean;

public class ticket {
	
	private int seat;
	private String cname;
	private String mobile;
	public ticket(int seat, String cname, String mobile) {
		super();
		this.seat = seat;
		this.cname = cname;
		this.mobile = mobile;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "ticket [seat=" + seat + ", cname=" + cname + ", mobile=" + mobile + "]";
	}
	
	

}
