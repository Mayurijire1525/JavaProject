package com.app.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private int empId;
	private String name;
	private LocalDate doj;
	private String phoneNo;
	private String adharNo;
	private EmpType type;
	private double hourlysalary;
	private double monthlysalary;
	private static int counter=100;
	public Employee(String name, LocalDate doj, String phoneNo, String adharNo, EmpType type,
			 double monthlysalary,double hourlysalary) {
		super();
		this.empId = ++counter;
		this.name = name;
		this.doj = doj;
		this.phoneNo = phoneNo;
		this.adharNo = adharNo;
		this.type = type;
		this.hourlysalary = hourlysalary;
		this.monthlysalary = monthlysalary;
	}
	public Employee(int empId2) {
		this.empId=empId2;
	}
	public Employee(String adharNo2) {
		this.adharNo=adharNo2;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public EmpType getType() {
		return type;
	}
	public void setType(EmpType type) {
		this.type = type;
	}
	public double getHourlysalary() {
		return hourlysalary;
	}
	public void setHourlysalary(double hourlysalary) {
		this.hourlysalary = hourlysalary;
	}
	public double getMonthlysalary() {
		return monthlysalary;
	}
	public void setMonthlysalary(double monthlysalary) {
		this.monthlysalary = monthlysalary;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Employee.counter = counter;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", doj=" + doj + ", phoneNo=" + phoneNo + ", adharNo="
				+ adharNo + ", type=" + type + ", hourlysalary=" + hourlysalary + ", monthlysalary=" + monthlysalary
				+ "\n]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(adharNo, empId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(adharNo, other.adharNo) || empId == other.empId;
	}
	
	
}
