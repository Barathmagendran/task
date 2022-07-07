package org.emp;

import java.util.Scanner;

public class MarkList {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		System.out.println("studentname:"+s);
		int i=sc.nextInt();
		System.out.println("studenId:"+i);
		byte b=sc.nextByte();
		System.out.println("mark1:"+b);
		byte b1=sc.nextByte();
		System.out.println("mark2:"+b1);
		byte b2=sc.nextByte();
		System.out.println("mark3:"+b2);
		int y =sc.nextInt();
		System.out.println("total:"+(b)+(b1)+(b2));
		
		
		
	}

}
