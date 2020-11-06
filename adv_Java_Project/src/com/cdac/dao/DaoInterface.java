package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Customer;
import com.cdac.dto.HomeOrderData;
import com.cdac.dto.ItemD;
import com.cdac.dto.Total;
import com.cdac.dto.User;

public interface DaoInterface {
	int	addUser(User user);
	boolean checkUser(User user);
	int	additem(ItemD itemD);
	List<ItemD>   showAllitems(int userId);
	ItemD findExpenxe1(int itemId);
	void updateExpense(ItemD expense);
	void deleteExpense(int expenseId);
	void addsale_t(int itemId);
	List totalsales1(int userId);
	int addCus(Customer user);
	boolean checkcus(Customer cus);
	List<ItemD>  showTypesToUser2(String type);
	void addorder(HomeOrderData homedata);
	List showsalebycity(int userId);
}
