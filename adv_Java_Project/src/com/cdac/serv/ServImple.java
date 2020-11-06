package com.cdac.serv;

import java.util.List;
import com.cdac.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.DaoImplement;
import com.cdac.dto.Customer;
import com.cdac.dto.HomeOrderData;
import com.cdac.dto.ItemD;
import com.cdac.dto.Total;
import com.cdac.dto.User;

@Service
public class ServImple implements Service1 {

	
	@Autowired
	private DaoImplement dao;
	
	@Override
	public int regUser(User user) {
		
	int k = dao.addUser(user);
		return k;
		
	}

	@Override
	public boolean findUser(User user) {
	boolean a =	dao.checkUser(user);
	return a;
		
	}

	@Override
	public int regItem(ItemD itemD) {
		return dao.additem(itemD);
	}

	@Override
	public List<ItemD> selectAllItem(int userId) {
		return dao.showAllitems(userId);
	}

	@Override
	public ItemD findExpenxe(int itemId) {
		
		return dao.findExpenxe1(itemId);
	}

	@Override
	public void modifyExpense(ItemD expense) {
		dao.updateExpense(expense);
		
	}

	@Override
	public void removeExpense(int expenseId) {
		dao.deleteExpense(expenseId);
		
	}

	@Override
	public void addsolditemA(int itemId) {
	  dao.addsale_t(itemId);
		
	}

	@Override
	public List totalsales2(int userId) {
	return	dao.totalsales1(userId);
		
	}

	@Override
	public int addCus1(Customer cusData) {
		
		return dao.addCus(cusData);
	}

	public boolean findcus(Customer cus) {
		
		return dao.checkcus(cus);
	}

	@Override
	public List<ItemD> showTypesToUser1(String type) {
		
		return dao.showTypesToUser2(type);
	}
	
	@Override
	
	public void addorder(HomeOrderData homeData) {
		 dao.addorder(homeData);
	}
	
	@Override
	public List showsalebycity1(int userid) {
		return dao.showsalebycity(userid);
		
	}

}
