package com.gl.departments;

public class Main {

	public static void main(String[] args) {
		
		TechDepartment techdeDepartment=new TechDepartment();
		AdminDepartment admDepartment=new AdminDepartment();
		HrDepartment hrDepartment=new HrDepartment();
		
		System.out.println("Welcome to " + admDepartment.departmentName());
		System.out.println(admDepartment.getTodaysWork());
		System.out.println(admDepartment.getWorkDeadline());
		System.out.println(admDepartment.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to " + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to " + techdeDepartment.departmentName());
		System.out.println(techdeDepartment.getTodaysWork());
		System.out.println(techdeDepartment.getWorkDeadline());
		System.out.println(techdeDepartment.getTechStackInformation());
		System.out.println(techdeDepartment.isTodayAHoliday());
		
		
		
	}

}
