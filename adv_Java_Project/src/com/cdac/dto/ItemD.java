package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_table1")
public class ItemD {
    @Id
    @GeneratedValue
	@Column(name = "item_id")
	private	int itemId;
	
     @Column(name = "user_Id")
	private int userId;
	@Column(name = "item_name")
	private String itemName;
	@Column(name = "item_price")
	private String price;
	private int totalItemSold;
	@Column(name = "item_type")
	private String type;
	public int getTotalItemSold() {
		return totalItemSold;
	}
	public void setTotalItemSold(int totalItemSold) {
		this.totalItemSold = totalItemSold;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public ItemD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemD(int itemId) {
		
		this.itemId = itemId;
	}
	@Override
	public String toString() {
		return "ItemD [itemId=" + itemId + ", userId=" + userId + ", itemName=" + itemName + ", price=" + price
				+ ", type=" + type + "]";
	}
	
	
	
	
}
