package com.greatlearning.service;

import com.greatlearning.AdminDepartment.AdminDepartment;
import com.greatlearning.AdminDepartment.HrDepartment;
import com.greatlearning.TechDepartment.TechDepartment;

//Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment

public class DriverclassMain {
	
	public static void main(String[] args) {
    
		AdminDepartment Admin = new AdminDepartment(); // Creating object of AdminDepartment
		HrDepartment hr= new HrDepartment(); //Creating object of AdminDepartment
		TechDepartment tech= new TechDepartment(); ////Creating object of TechDepartment
		String admname= Admin.departmentName();
		String namehr= hr.departmentName();
		String nametech= tech.departmentName();
		String admstatus= Admin.getTodaysWork();
		String hrstatus= hr.getTodaysWork();
		String techstatus= tech.getTodaysWork();
		String admdeadline= Admin.getWorkDeadline();
		String hrdeadline= hr.getWorkDeadline();
		String admtest= Admin.isTodayAHoliday();
		String hrtest= hr.isTodayAHoliday();
		String techtest= tech.isTodayAHoliday();
		String act= hr.doActivity();
		String info= tech.getTechStackInformation();
		
		// Displaying all the functionalities of AdminDepartment
        System.out.println("Welcome to" +admname);
		System.out.println(admstatus);
		System.out.println(admdeadline);
		System.out.println(admtest);
		
		// Displaying all the functionalities of HrDepartment
		System.out.println("\nWelcome to" +namehr);
		System.out.println(act);
		System.out.println(hrstatus);
		System.out.println(hrdeadline);
		System.out.println(hrtest);
		
		// Displaying all the functionalities of TechDepartment
		System.out.println("\nWelcome to" +nametech);
		System.out.println(techstatus);
		System.out.println(info);
		System.out.println(techtest);
		
              
}
}