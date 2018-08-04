package com.matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {
	
	private List<Employee> empList;
	private Map<String,Employee> map = new HashMap<String,Employee>();
	public Customer(){
	
		empList = new ArrayList<Employee>();
	}
	private long custId;

	
	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}
	
	public void addEmployee(Employee emp){
		empList.add(emp);
	}
	
	public List<Employee> showAll(){
		
		return empList;
		
	}
	
	public void remove(int id){
		
	}
	public Employee getById(int id){
		return new Employee();
	}
	
	public void update(int id){
		
	}
	
	public void showBillDetails(int id){
		
	}
	public void showProductDetails(int id){
		
	}
	
	public void showCatelogDetails(int id){
		
	}
	public void showLast_10Days_HistoryDetails(int id){
		
	}
	public void showLast_3Days_HistoryDetails(int id){
		
	}
	public void updateProfile(int id){
		
	}
	public void showPaymentHistory(int id){
		
	}
	public void showRewardPoints(int id){
		
	}
	
	
	
	
	

}
