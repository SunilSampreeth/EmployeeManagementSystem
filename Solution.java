package com.jspiders;

import java.util.Scanner;
import com.customexception.InvalidChoiceException;
public class Solution {
	
	
	public static void main(String[] args) {

		//Upcasting 
		EmployeeManagementSystem ems = new EmployeeManagementSystemImpl();
		Scanner sc = new Scanner(System.in);
	
		
		

		System.out.println("Employee Management DataBase Project");
		System.out.println("------------------------------");
		while(true) {
			System.out.println("1.Add Employee\n2.Display Employe");
			System.out.println("3.Display All Employee\n4.Remove Employee");
			System.out.println("5.Remove All Employee\n6.Update Employee\n7.Count Employee");
			System.out.println("8.Sort Employee\n9.Exit\nEnter your Choice");

			int choice=sc.nextInt();
			switch(choice) {

			case 1: ems.addEmployee();
			break;
			case 2: ems.displayEmployee();
			break;
			case 3: ems.displayAllEmployee();
			break;
			case 4: ems.removeEmployee();
			break;
			case 5: ems.removeAllEmployee();
			break;
			case 6: ems.updateEmployee();
			break;
			case 7: ems.countEmployee();
			break;
			case 8: ems.sortEmployee();
			break;
			case 9: System.out.println("Thank you");
			System.exit(0);
			default: 
				try {
					throw new InvalidChoiceException("Invalid Exception");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}	
	}
}
