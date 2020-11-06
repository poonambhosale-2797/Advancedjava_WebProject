package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "home_order_data")
public class HomeOrderData {
	@Id
	@GeneratedValue
	private int orderno;
	@Column(name = "cus_Id")
	private int cusId;
	
	@Column(name = "pro_Id")
	 private int proId;
	
	@Column(name = "d_Name")
     private String dName;
	@Column(name = "d_Mobile_Number")
     private String dMobileNumber;
	@Column(name = "d_City")
     private String dCity;
	@Column(name = "d_Complet_Address")
     private String dCompletAddress;
	public HomeOrderData() {
		
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public HomeOrderData(String dName, String dMobileNumber, String dCity, String dCompletAddress) {
		super();
		this.dName = dName;
		this.dMobileNumber = dMobileNumber;
		this.dCity = dCity;
		this.dCompletAddress = dCompletAddress;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdMobileNumber() {
		return dMobileNumber;
	}
	public void setdMobileNumber(String dMobileNumber) {
		this.dMobileNumber = dMobileNumber;
	}
	public String getdCity() {
		return dCity;
	}
	public void setdCity(String dCity) {
		this.dCity = dCity;
	}
	public String getdCompletAddress() {
		return dCompletAddress;
	}
	public void setdCompletAddress(String dCompletAddress) {
		this.dCompletAddress = dCompletAddress;
	}
	@Override
	public String toString() {
		return "HomeOrderData [dName=" + dName + ", dMobileNumber=" + dMobileNumber + ", dCity=" + dCity
				+ ", dCompletAddress=" + dCompletAddress + "]";
	}
     
     
}
