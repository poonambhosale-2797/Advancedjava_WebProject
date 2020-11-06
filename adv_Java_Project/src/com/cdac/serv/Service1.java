package com.cdac.serv;

import java.util.List;

import com.cdac.dto.Customer;
import com.cdac.dto.HomeOrderData;
import com.cdac.dto.ItemD;
import com.cdac.dto.Total;
import com.cdac.dto.User;

public interface Service1 {
		
	int regUser(User user);
	 boolean findUser(User user);
	int regItem(ItemD itemD);
	List<ItemD>  selectAllItem(int userId);
	ItemD   findExpenxe(int itemId);
	void modifyExpense(ItemD expense);
	void removeExpense(int expenseId);
	void addsolditemA(int itemId);
	List totalsales2(int userId);
	int addCus1(Customer cusData);
	public boolean findcus(Customer cus);
	List<ItemD> showTypesToUser1(String type);
	void addorder(HomeOrderData homeData);
	
	List showsalebycity1(int userid);
}
