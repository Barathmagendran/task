package org.emp;

import java.util.Scanner;

public class EmpDetails {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("emloyee details ");
	
	int ID = sc.nextInt();
	System.out.println("employee id:" +ID);
	String Name=sc.next();
	System.out.println("employee name:" +Name);
	
	String Email=sc.next();
	System.out.println("employee Email" +Email);
	int salary = sc.nextInt();
	System.out.println("employee salaery:" +salary);
	int phone= sc.nextInt();
	System.out.println("employee phone:" +phone);
	String gender =sc.next();
	System.out.println("employeegender:" +gender);
			
	}
}
