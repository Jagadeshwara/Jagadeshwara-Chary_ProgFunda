package com.gradedproject.q1;

public class HrDepartment extends SuperDepartment {

	// Method of the welcome message for Hr department
	public String departmentName() {
		return "Welcome to Hr Department";
	}

	// Method of return statement for doActivity
	public String doActivity() {
		return "team lunch";
	}

	// Method of return statement for getTodaysWork
	public String getTodaysWork() {
		return "Fill today's marksheet and mark your attendance";
	}

	// Method of return statement for getWorkDeadline
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	// Method of return statement for isTodayAHoliday
	public String isTodayAHoliday() {
		return "Today is not a Hilday";
	}

}
