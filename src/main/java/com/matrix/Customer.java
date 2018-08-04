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
	
	

}
