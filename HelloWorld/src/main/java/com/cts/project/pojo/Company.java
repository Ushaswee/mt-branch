package com.cts.project.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="company")
	public class Company {
	@Id
	private String companyname;
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Integer getTurnover() {
		return turnover;
	}
	public void setTurnover(Integer turnover) {
		this.turnover = turnover;
	}
	public String getCeoname() {
		return ceoname;
	}
	public void setCeoname(String ceoname) {
		this.ceoname = ceoname;
	}
	public String getBod() {
		return bod;
	}
	public void setBod(String bod) {
		this.bod = bod;
	}
	public Integer getListedinse() {
		return listedinse;
	}
	public void setListedinse(Integer listedinse) {
		this.listedinse = listedinse;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Integer getStockcode() {
		return stockcode;
	}
	public void setStockcode(Integer stockcode) {
		this.stockcode = stockcode;
	}
	private Integer turnover;
	 private String ceoname;
	 private String bod;
	 private Integer listedinse;
	 private String sector;
	 private String remarks;
	 private Integer stockcode;
	 @Override
	public String toString() {
		return "Company [companyname=" + companyname + ", turnover=" + turnover + ", ceoname=" + ceoname + ", bod="
				+ bod + ", listedinse=" + listedinse + ", sector=" + sector + ", remarks=" + remarks + ", stockcode="
				+ stockcode + "]";
	}
}
	
	 
	