package com.app.utils;

import java.util.List;

import com.app.customexception.CustomException;
import com.app.entities.Employee;

public class EmployeeUtils {

	public static String deleteEmployee(int empId, List<Employee> emplist)throws CustomException {
		Employee emp=new Employee(empId);
		int index=emplist.indexOf(emp);
		if(index!=-1) {
			Employee eemp=emplist.remove(index);
			return emp+"Successfully removed";
		}
		throw new CustomException("No such employee to remove");
	}

	public static Employee searchByAdharNo(String adharNo, List<Employee> emplist)throws CustomException {
//		Employee e=new Employee(adharNo);
//		int index=emplist.indexOf(e);
//		if(index!=-1)
	//		return emplist.get(index);
		for(Employee e:emplist) {
			if(e.getAdharNo().equals(adharNo)) {
				return e;
			}
		}
		throw new CustomException("No such employee exist");
	}

}
