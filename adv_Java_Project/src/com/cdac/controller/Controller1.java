package com.cdac.controller;
import com.cdac.*;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

import com.cdac.dto.Customer;
import com.cdac.dto.HomeOrderData;
import com.cdac.dto.ItemD;
import com.cdac.dto.Total;
import com.cdac.dto.User;
import com.cdac.serv.ServImple;




@Controller
public class Controller1 {
	@Autowired
	ServImple ss;
  
	@RequestMapping(value = "/prep_reg_form.htm",method = RequestMethod.GET)
	public String prepRegForm(ModelMap map) {
	map.put("user", new User());
		return "reg_form";
	}
	
	@RequestMapping(value = "/reg.htm",method = RequestMethod.GET)
	public String prepRegForm1(User user,ModelMap map) {
	ss.regUser(user);
		
		return "login";
	}
	
	@RequestMapping(value = "/prep_log_form.htm",method = RequestMethod.GET)
	public String prepLogForm(ModelMap map) {
		map.put("user", new User());
		return "login";
	}
	
	@RequestMapping(value = "/login.htm",method = RequestMethod.POST)
	public String login(User user,ModelMap map,HttpSession session1) {
		
		boolean b = ss.findUser(user);
		if(b) {
			session1.setAttribute("user", user);
		//	u3 = user;
			return "home";
		}else {
			map.put("user", new User());
			return "login";
		}
	}
	@RequestMapping(value = "/byprice.htm",method = RequestMethod.GET)
	public String prepLogForm5555(ModelMap map) {
		//map.put("user2", u3);
		return "demo";
	}
	@RequestMapping(value = "/additem.htm",method = RequestMethod.GET)
	public String addItem(ModelMap map) {
	map.put("dd", new ItemD());
		return "add_item";
	}
	@RequestMapping(value = "/addnewitem.htm",method = RequestMethod.POST)
	public String addNewItem(ItemD dd ,ModelMap map,HttpSession session1) {
	
	
		int sss = ((User)session1.getAttribute("user")).getUserId();
		dd.setUserId(sss);
		ss.regItem(dd);
			return "home";
		}
	@RequestMapping(value = "/manageItem.htm",method = RequestMethod.GET)
	public String manageItem(ModelMap map) {
	map.put("dd", new ItemD());
		return "item_manager";
	}

	@RequestMapping(value = "/showItem.htm",method = RequestMethod.GET)
	public String allExpenses(ModelMap map,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<ItemD> li = ss.selectAllItem(userId);
		map.put("itmList", li);
		return "item_list";
	}
	@RequestMapping(value = "/expense_update_form.htm",method = RequestMethod.GET)
	public String expenseUpdateForm(@RequestParam int itemId,ModelMap map) {
		
		ItemD item = ss.findExpenxe(itemId);
		map.put("expense", item);
		
		return "expense_update_form";
	}
	@RequestMapping(value = "/expense_update.htm",method = RequestMethod.POST)
	public String expenseUpdate(ItemD expense,ModelMap map,HttpSession session) {
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		expense.setUserId(userId);
		ss.modifyExpense(expense);
			
		List<ItemD> li = ss.selectAllItem(userId);
		map.put("itmList", li);
		return "item_list";
	}
	@RequestMapping(value = "/expense_delete.htm",method = RequestMethod.GET)
	public String expenseDelete(@RequestParam int itemId,ModelMap map,HttpSession session) {
		
		ss.removeExpense(itemId); 
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<ItemD> li = ss.selectAllItem(userId);
		map.put("itmList", li);
		return "item_list";
	}
	@RequestMapping(value = "/showtoaddSale.htm",method = RequestMethod.GET)
	public String addSale(ModelMap map,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<ItemD> li = ss.selectAllItem(userId);
		map.put("itmList", li);
		return "addSaless_list";
	}
	@RequestMapping(value = "/addsold_item_.htm",method = RequestMethod.GET)
	public String addsolditemss_(@RequestParam int itemId,ModelMap map,HttpSession session) {
		
		ss.addsolditemA(itemId); 
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<ItemD> li = ss.selectAllItem(userId);
		map.put("itmList", li);
		return "item_list";
	}
	@RequestMapping(value = "/totalsale.htm",method = RequestMethod.GET)
	public String showtotalsale(ModelMap map,HttpSession session,@RequestParam int itemId) {
		//int userId = ((User)session.getAttribute("user")).getUserId();
		List li = ss.totalsales2(itemId);
		map.put("itmList", li);
		return "totalsalemyy";
	}
	@RequestMapping(value = "/customerWWW.htm",method = RequestMethod.GET)
	public String cusWWWWW(ModelMap map) {
	map.put("cusData", new Customer());
		return "registerUser";
	}
	@RequestMapping(value = "/cus_reg.htm",method = RequestMethod.GET)
	public String prepUserRegForm1(Customer cusData,ModelMap map) {
	ss.addCus1(cusData);
		
		return "index";
	}
	@RequestMapping(value = "/cuslogdata55.htm",method = RequestMethod.GET)
	public String cusLogForm(ModelMap map) {
		map.put("cusData", new Customer());
		return "customer_login";
	}
	@RequestMapping(value = "/cuslogin.htm",method = RequestMethod.POST)
	public String cutomer_login(Customer cus,ModelMap map,HttpSession session1) {
		boolean b = ss.findcus(cus);
		if(b) {
			session1.setAttribute("customer", cus);
		
			return "cus_home";
		}else {
			map.put("user", new User());
			return "customer_login";
		}
	}
	@RequestMapping(value = "/cusproview.htm",method = RequestMethod.GET)
	public String showTypesToUser(@RequestParam String type,ModelMap map,HttpSession session) {
		List<ItemD> li = ss.showTypesToUser1(type); 
		map.put("itmList", li);
		return "item_list22";
	}
	@RequestMapping(value = "/buyproductc.htm",method = RequestMethod.GET)
	public String buynowpagefrd(ModelMap map,@RequestParam int itemId,@RequestParam int c_id) {
		HomeOrderData hod = new HomeOrderData();
		hod.setCusId(c_id);
		hod.setProId(itemId);
		map.put("homedata", hod);
		
		return "buynowPage03";
	}

	
	@RequestMapping(value = "/ouderplaced.htm",method = RequestMethod.POST)
	public String yesOrderplaced(HomeOrderData homedata) {
		
		int pid = homedata.getProId();
		ss.addsolditemA(pid); 
		ss.addorder(homedata);
		
			return "cus_home";
		}
	@RequestMapping(value = "/logout.htm",method = RequestMethod.GET)
	public String logout(@ModelAttribute User user,HttpSession session,ModelMap map,SessionStatus status,WebRequest request) {
		 status.setComplete();
		 request.removeAttribute("user", WebRequest.SCOPE_SESSION);
		return "login";
	}
	@RequestMapping(value = "/tracksalebycity.htm",method = RequestMethod.GET)
	public String citysale(ModelMap map,HttpSession session,@RequestParam int userId) {
		//int userId = ((User)session.getAttribute("user")).getUserId();
		List li = ss.showsalebycity1(userId);
		map.put("itmList", li);
		return "citysalemyy";
	}
	
	@RequestMapping(value = "/logout1.htm",method = RequestMethod.GET)
	public String logout1(@ModelAttribute User user,HttpSession session,ModelMap map,SessionStatus status,WebRequest request) {
		 status.setComplete();
		 request.removeAttribute("customer", WebRequest.SCOPE_SESSION);
		return "index";
	}

}

