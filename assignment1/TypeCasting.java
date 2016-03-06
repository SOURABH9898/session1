package com.acadglid.java.core.session1.assignment1;

import java.util.Scanner;

public class TypeCasting {

	private static Scanner s;
	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter first number");
		int numb1=s.nextInt();
		System.out.println("Enter second number in float");
		float numb2=s.nextFloat();
		System.out.println(numb2);
		System.out.println("The result in integer format is "+TypeCasting.add(numb1,numb2));
	}
	static int add(int a, float b){
		return (int)(a+b);
	}

}
