package com.cts.project.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stockExchange")
public class StockExchange {
	@Id
	private int stockid;
	private String stockexchange;
	private String brief;
	private String remarks;
	private String contactaddress;
	@Override
	public String toString() {
		return "StockExchange [stockid=" + stockid + ", stockexchange=" + stockexchange + ", brief=" + brief
				+ ", remarks=" + remarks + ", contactaddress=" + contactaddress + "]";
	}
	public int getStockid() {
		return stockid;
	}
	public void setStockid(int stockid) {
		this.stockid = stockid;
	}
	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getContactaddress() {
		return contactaddress;
	}
	public void setContactaddress(String contactaddress) {
		this.contactaddress = contactaddress;
	}
	
}
	
	
	