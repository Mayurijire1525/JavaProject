package com.app.customordering;

import java.util.Comparator;

import com.app.entities.Employee;

public class EmployeeSortByDoj implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDoj().compareTo(o2.getDoj());
		
	}
	

}
