package com.greatlearning.AdminDepartment;

import com.greatlearning.SuperDepartment.SuperDepartment;

//Creating 1st subclass AdminDepartment of superclass SuperDepartment

public class AdminDepartment extends SuperDepartment{
	
	public String departmentName() {
		return " Admin Department ";
    }
	
	public String getTodaysWork() {
		return "Complete your documents Submission";
    }
	
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

}
