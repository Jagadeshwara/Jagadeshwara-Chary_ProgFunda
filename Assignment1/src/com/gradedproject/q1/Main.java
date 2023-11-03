package com.gradedproject.q1;

public class Main {
	
	// Main method
	public static void main(String[] args) {

		// Creating the object for AdminDepartment Class 
		AdminDepartment admdept = new AdminDepartment();
		// Printing the return statements of Admin Department
		System.out.println(admdept.departmentName());
		System.out.println(admdept.getTodaysWork());
		System.out.println(admdept.getWorkDeadline());
		System.out.println(admdept.isTodayAHoliday());

		System.out.println();
		
		// Creating the object for HRDepartment Class 
		HrDepartment hrdept = new HrDepartment();
		// Printing the return statements of Hr Department
		System.out.println(hrdept.departmentName());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.isTodayAHoliday());

		System.out.println();

		// Creating the object for TechDepartment Class 
		TechDepartment techdept = new TechDepartment();
		// Printing the return statements of Tech Department
		System.out.println(techdept.departmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayAHoliday());
	}
}
