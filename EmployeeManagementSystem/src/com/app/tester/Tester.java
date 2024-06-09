package com.app.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.customordering.EmployeeSortByDoj;
import com.app.entities.Employee;
import com.app.utils.EmployeeUtils;
import com.app.utils.Validation;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			List<Employee> emplist=new ArrayList<>();
			boolean exit=false;
			while(!exit) {
				System.out.println("---Application Menu---");
				System.out.println("1.Add full time employee\r\n"
						+ "2.Add part time employee\r\n"
						+ "3.Delete an employee by Emp Id\r\n"
						+ "4.Search employee details by Aadhaar number\r\n"
						+ "5.Display all employee details\r\n"
						+ "6.Display all employee details sorted by date of joining\r\n"
						+ "7.Exit");
				System.out.println("Enter your choice");
				int c=sc.nextInt();
			
			try {
				switch(c) {
				case 1:
					//Name, Date of joining, Phone Number, Aadhaar number  

					System.out.println("Enter Name Date of joining, Phone Number, Aadhaar number ,Monthly salary ");
					Employee e=Validation.inputValidation(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),c);
					emplist.add(e);
					System.out.println("Full time Employee Details added successfully");
					break;
				case 2:
					System.out.println("Enter Name Date of joining, Phone Number, Aadhaar number ,Hourly salary ");
					Employee e1=Validation.inputValidation(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),c);
					emplist.add(e1);
					System.out.println("part time Employee Details added successfully");
					break;
				case 3:
					System.out.println("Enter employee Id");
					System.out.println(EmployeeUtils.deleteEmployee(sc.nextInt(),emplist));
					break;
				case 4:
					System.out.println("Enter adhar no");
					Employee e2=EmployeeUtils.searchByAdharNo(sc.next(),emplist);
					System.out.println(e2);
					break;
				case 5:
					System.out.println(emplist);
					break;
				case 6:
					Collections.sort(emplist, new EmployeeSortByDoj());
					System.out.println("Successfully sorted by DOJ");
					System.out.println(emplist);
					break;
				case 7:
					System.out.println("Exiting------");
					break;
				default:
					System.out.println("Invalid input");
					break;
				}
			}
			catch(Exception e) {
				sc.nextLine();
				System.out.println(e);
			}
		
			
		}

	}

}
}