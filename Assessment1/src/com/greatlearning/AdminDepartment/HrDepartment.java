package com.greatlearning.AdminDepartment;

import com.greatlearning.SuperDepartment.SuperDepartment;

//Creating 2nd subclass HrDepartment of superclass SuperDepartment

public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		return " Hr Department ";
    }
	
	public String getTodaysWork() {
		return "Fill today’s time sheet and mark your attendance";
    }
	
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
}
