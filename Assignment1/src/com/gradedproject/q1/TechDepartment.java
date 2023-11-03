package com.gradedproject.q1;

public class TechDepartment extends SuperDepartment{
	
	// Method of welcome message for Tech Department
	public String departmentName() {
		return "Welcome to Tech Department";
	}
	
	// Method of statement for getTodaysWork
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}
	
	// Method of statement for getWorkDeadline
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	// Method of return statement for getTechStackInformation
	public String getTechStackInformation() {
		return "Core Java";
	}
	
	// Method of return statement for isTodayAHoliday
	public String isTodayAHoliday() {
		return "Today is not a Hilday";
	}

}
