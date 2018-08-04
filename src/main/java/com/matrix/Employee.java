package com.matrix;

public class Employee {
	private List<Employee> empList;
	private int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void save(Employee emp){
		
	}
	
	public Employee getEmpById(int id){
		return new Employee();
	}
	
	public void List<Employee>  getAllEmp(){
		return empList;
	}

}
