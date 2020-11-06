package com.cdac.dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Customer;
import com.cdac.dto.HomeOrderData;
import com.cdac.dto.ItemD;
import com.cdac.dto.Total;
import com.cdac.dto.User;

@Repository
public class DaoImplement implements DaoInterface {
	
	

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int addUser(User user) {
	int z =	hibernateTemplate.execute(new HibernateCallback<Integer>() {

			
			public Integer doInHibernate(Session session) throws HibernateException {
				
				Transaction tr = session.beginTransaction();
			    int i = (int) session.save(user);
				tr.commit();
				session.flush();
				session.close();
				return i;
			}
		});
		
		
		
		return z;
	}

	@Override
	public boolean checkUser(User user) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where user_Name = ? and user_password = ?");
				q.setString(0, user.getUserName());
				q.setString(1, user.getPassWord());
				List<User> li = q.list();
				
				boolean flag = !li.isEmpty();
				if(flag==false) {
			
				}else {
					user.setUserId(li.get(0).getUserId()); 
				}
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
			
		});
		return b;
		
		
		
	}

	@Override
	public int additem(ItemD itemD) {
int z =	hibernateTemplate.execute(new HibernateCallback<Integer>() {
            
			
			public Integer doInHibernate(Session session) throws HibernateException {
				
				Transaction tr = session.beginTransaction();
			    int i = (int) session.save(itemD);
				tr.commit();
				session.flush();
				session.close();
				return i;
			}
		});
		
		
		
		return z;
		
		
		
		
		
	}

	@Override
	public List<ItemD> showAllitems(int userId) {
		List<ItemD> itemList = hibernateTemplate.execute(new HibernateCallback<List<ItemD>>() {

			@Override
			public List<ItemD> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from ItemD where user_Id = ?");
				q.setInteger(0, userId);
				List<ItemD> li = q.list();
				System.out.println(li); 
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return itemList;
	}

	@Override
	public ItemD findExpenxe1(int itemId) {
		ItemD expense = hibernateTemplate.execute(new HibernateCallback<ItemD>() {

			@Override
			public ItemD doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				ItemD ex = (ItemD)session.get(ItemD.class, itemId);
				tr.commit();
				session.flush();
				session.close();
				return ex;
			}
			
		});
		return expense;
		
	}

	@Override
	public void updateExpense(ItemD expense) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(expense);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public void deleteExpense(int expenseId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new ItemD(expenseId));
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public void addsale_t(int itemId) {
		ItemD expense = hibernateTemplate.execute(new HibernateCallback<ItemD>() {

			@Override
			public ItemD doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				ItemD ex = (ItemD)session.get(ItemD.class, itemId);
				int k = ex.getTotalItemSold();
				++k;
				ex.setTotalItemSold(k);
				session.update(ex);
				tr.commit();
				session.flush();
				session.close();
				return ex;
			}
			
		});
		
		
	}

	@Override
	public List totalsales1(int userId) {
List lik =		hibernateTemplate.execute(new HibernateCallback<List>() {

			@Override
			public List doInHibernate(Session session) throws HibernateException {
				List li = new ArrayList();
				for(int i=0;i<8;i++) {
					if(i==0) {
						String sumHql = "select sum(totalItemSold) from ItemD where user_Id = 1 and item_type = 'Electronic'";
						Query sumQuery = session.createQuery(sumHql);
						li.add(sumQuery.list());
					}
					if(i==1) {
						String sumHql = "select sum(totalItemSold) from ItemD where user_Id = 1 and item_type = 'Eletrical'";
						Query sumQuery = session.createQuery(sumHql);
						li.add(sumQuery.list());
					}
					if(i==2) {
						String sumHql = "select sum(totalItemSold) from ItemD where user_Id = 1 and item_type = 'Fashion'";
						Query sumQuery = session.createQuery(sumHql);
						li.add(sumQuery.list());
					}
					
					if(i==3) {
						String sumHql = "select sum(totalItemSold) from ItemD where user_Id = 1 and item_type = 'Home Application'";
						Query sumQuery = session.createQuery(sumHql);
						li.add(sumQuery.list());
					}
					if(i==4) {
						String sumHql = "select sum(totalItemSold) from ItemD where user_Id = 1 and item_type = 'Toys'";
						Query sumQuery = session.createQuery(sumHql);
						li.add(sumQuery.list());
					}
					if(i==5) {
						String sumHql = "select sum(totalItemSold) from ItemD where user_Id = 1 and item_type = 'Sports'";
						Query sumQuery = session.createQuery(sumHql);
						li.add(sumQuery.list());
					}
					if(i==6) {
						String sumHql = "select sum(totalItemSold) from ItemD where user_Id = 1 and item_type = 'Other'";
						Query sumQuery = session.createQuery(sumHql);
						li.add(sumQuery.list());
					}
				}
				
				
				

				
				return li;
			}
		});
		
		
		System.out.println(lik.get(0));
		return lik;
	
	}
	
	public int addCus(Customer cusData) {
		int z =	hibernateTemplate.execute(new HibernateCallback<Integer>() {

				
				public Integer doInHibernate(Session session) throws HibernateException {
					
					Transaction tr = session.beginTransaction();
				    int i = (int) session.save(cusData);
					tr.commit();
					session.flush();
					session.close();
					return i;
				}
			});
			
			
			
			return z;
		}
	
	@Override
	public boolean checkcus(Customer cus) {
		boolean b = hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Customer where c_username = ? and c_password = ?");
				q.setString(0, cus.getUserName());
				q.setString(1, cus.getUserPass());
				List<Customer> li = q.list();
				
				cus.setcId(li.get(0).getcId());
				boolean flag = !li.isEmpty();
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
			
		});
		return b;
	
	
}

	@Override
	public List<ItemD> showTypesToUser2(String type) {
		List<ItemD> itemList = hibernateTemplate.execute(new HibernateCallback<List<ItemD>>() {

			@Override
			public List<ItemD> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from ItemD where type = ?");
				q.setString(0, type);
				List<ItemD> li = q.list();
				System.out.println(li); 
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
			
		});
		return itemList;
		
	}
	@Override
	public void addorder(HomeOrderData homedata) {
		     hibernateTemplate.execute(new HibernateCallback<Integer>() {

				
				public Integer doInHibernate(Session session) throws HibernateException {
					
					Transaction tr = session.beginTransaction();
				    int i = (int) session.save(homedata);
					tr.commit();
					session.flush();
					session.close();
					return i;
				}
			});
			
			
			
			
		}
	
	@Override
	public List showsalebycity(int userId) {
List lik =		hibernateTemplate.execute(new HibernateCallback<List>() {

			@Override
			public List doInHibernate(Session session) throws HibernateException {
				List li = new ArrayList();
				for(int i=0;i<=2;i++) {
					if(i==0) {
						String sumHql = "select count(d_City) from HomeOrderData where d_City = 'Mumbai'";
						Query sumQuery = session.createQuery(sumHql);
						li.add(sumQuery.list());
					}
					if(i==1) {
						String sumHql = "select count(d_City) from HomeOrderData where d_City = 'Thane'";
						
						Query sumQuery = session.createQuery(sumHql);
						li.add(sumQuery.list());
					}
					if(i==2) {
						String sumHql = "select count(d_City) from HomeOrderData where d_City = 'Pune'";
						Query sumQuery = session.createQuery(sumHql);
						li.add(sumQuery.list());
					}
					
					
				}
				
				
				

				
				return li;
			}
		});
		
		
		System.out.println(lik.get(0));
		return lik;
	
	}

	
}
	


