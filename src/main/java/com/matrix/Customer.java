package com.matrix;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private List<Employee> empList;
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
	
	

}
