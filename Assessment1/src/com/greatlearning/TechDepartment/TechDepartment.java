package com.greatlearning.TechDepartment;

import com.greatlearning.SuperDepartment.SuperDepartment;

//Creating 3rd subclass TechDepartment of superclass SuperDepartment

public class TechDepartment extends SuperDepartment {
	
	public String departmentName() {
		return " Tech Department ";
    }
	
	public String getTodaysWork() {
		return "Complete coding of module 1";
    }
	
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
 
	public String getTechStackInformation() {
		return "Core Java";
	}
}
