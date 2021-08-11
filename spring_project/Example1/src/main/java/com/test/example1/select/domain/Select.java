package com.test.example1.select.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class Select {
	
	private int idx;
	private Date rsdate;
	private int curpeople;
	private int totalpeople;
	private int price;
	private Timestamp regDate;
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public Date getRsdate() {
		return rsdate;
	}
	public void setRsdate(Date rsdate) {
		this.rsdate = rsdate;
	}
	public int getCurpeople() {
		return curpeople;
	}
	public void setCurpeople(int curpeople) {
		this.curpeople = curpeople;
	}
	public int getTotalpeople() {
		return totalpeople;
	}
	public void setTotalpeople(int totalpeople) {
		this.totalpeople = totalpeople;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	
	// java.sql.TimeStamp -> java.util.Date
	public Date getDate() {
		return new Date(getRegDate().getTime());
	}
	
	
	@Override
	public String toString() {
		return "Select [idx=" + idx + ", rsdate=" + rsdate + ", curpeople=" + curpeople + ", totalpeople=" + totalpeople
				+ ", price=" + price + ", regDate=" + regDate + "]";
	}
	
	
	
	
}
