package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_data")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name = "c_id")
	private int cId;
	@Column(name = "c_name")
	private String cName;
	@Column(name = "c_email")
	private String eMail;
	@Column(name = "c_username")
	private String userName;
	@Column(name = "c_password")
	private String userPass;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public Customer() {
		
	}
	public Customer(int cId, String cName, String eMail, String userName, String userPass) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.eMail = eMail;
		this.userName = userName;
		this.userPass = userPass;
	}
	
	
	
	
	

}
