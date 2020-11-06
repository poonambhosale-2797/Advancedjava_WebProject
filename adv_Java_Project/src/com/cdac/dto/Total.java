package com.cdac.dto;

public class Total {
	private int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Total() {
		
	}

	public Total(int total) {
		super();
		this.total = total;
	}

	@Override
	public String toString() {
		return "Total [total=" + total + "]";
	}
	
	

}
