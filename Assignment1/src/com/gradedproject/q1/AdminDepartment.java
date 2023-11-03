package com.gradedproject.q1;

public class AdminDepartment extends SuperDepartment {

	// Method of the welcome message for Admin Department
	public String departmentName() {
		return "Welcome to Admin Department";
	}

	// Method of return statement for getTodaysWork
	public String getTodaysWork() {
		return "Complete your documents submission";
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
