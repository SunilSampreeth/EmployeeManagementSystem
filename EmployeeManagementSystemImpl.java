package com.jspiders;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



import com.customexception.EmployeeNotFoundException;
import com.customexception.InvalidChoiceException;

public class EmployeeManagementSystemImpl implements EmployeeManagementSystem{
	
	Scanner sc = new Scanner(System.in);
	
	Map<String,Employee> db=new LinkedHashMap<String,Employee>();

	@Override
	public void addEmployee() {
		System.out.println("Enter your Name");
		String name= sc.next();
		System.out.println("Enter your Age");
		int age= sc.nextInt();
		System.out.println("Enter your Salary");
		Double salary= sc.nextDouble();
		Employee e1 =new Employee(name, age, salary);
		db.put(e1.getId(), e1);
		System.out.println("Employee Record Inserted Succesfully");
		System.out.println("Your Employee Id id :"+e1.getId());
		System.out.println("---------------------------");
	
	}

	@Override
	public void displayEmployee() {
		System.out.println("Enter Your Id");
		String id=sc.next();
		id=id.toUpperCase();
		
		if(db.containsKey(id)) {
			Employee obj = db.get(id);
//			System.out.println("Id "+obj.getId());
//			System.out.println("Name "+obj.getName());
//			System.out.println("Age "+obj.getAge());
//			System.out.println("Salary "+obj.getSalary());
			System.out.println(obj);  // obj.toString()
		}
		else {
			try {
				throw new EmployeeNotFoundException("Employee Records are Not Available to Display");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	
	}

	@Override
	public void displayAllEmployee() {
		Set<String> keys = db.keySet(); // JSP101 , JSP102
		System.out.println("Student Record are as Follows");
		System.out.println("---------------------------");
		
		if(db.size()!=0) {
		for(String key:keys) {
			System.out.println(db.get(key));
			
		}
		}
		else {
			try {
			throw new EmployeeNotFoundException("Employee data is not found to displya");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	}
	@Override
	public void removeEmployee() {
		System.out.println("Enter your Id");
		String id = sc.next();
		id=id.toUpperCase();
		if(db.containsKey(id)) { 
			 db.remove(id);
			System.out.println("Employee Record Deleted Succesfully");
		}
		else try {
			throw new EmployeeNotFoundException("Employee Records are Not Found");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void removeAllEmployee() {
		System.out.println(db.size()+" Employee Record Is Available");
		db.clear();
		System.out.println("All Employee Record are Deleted");
		System.out.println("-----------------------");

		
	}

	@Override
	public void updateEmployee() {
		System.out.println("Enter your Id");
		String id = sc.next().toUpperCase();;  //Accept the Id --> String
		// convert lower case to Upper case

		if(db.containsKey(id)) {

			Employee std = db.get(id);

			System.out.println("1.Update Name\n2.Update Age\n3.Update Marks\nEnter choice");
			int choice= sc.nextInt();

			switch(choice) {
			case 1: System.out.println("Enter Update Name");
			String name=sc.next();
			std.setName(name); 
			System.out.println("Name Updated Successfully`");
			break;
			case 2:System.out.println("Enter Update Age");
			int age=sc.nextInt(); //std.setAge(sc.nextInt());(
			std.setAge(age); 

			break;
			case 3: System.out.println("Enter Update Marks");
			std.setSalary(sc.nextDouble());
			break; 
			default:  try {
				throw new  InvalidChoiceException("Invalid Choice , Kindly Valid Choice");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}

			}
		}
		else {
			try {
				throw new EmployeeNotFoundException("Student Records  Not Found");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void countEmployee() {
		System.out.println("Total Number of Employee is : "+db.size());
		System.out.println("--------------------");
	}

	@Override
	public void sortEmployee() {
	
		
	}
	

}
