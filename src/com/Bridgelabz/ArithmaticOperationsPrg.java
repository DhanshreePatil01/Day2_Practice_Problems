package com.Bridgelabz;

import java.util.Scanner;

public class ArithmaticOperationsPrg {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	   
	  System.out.println("Input first number: ");
	  int num1 = sc.nextInt();
	   
	  System.out.println("Input second number: ");
	  int num2 = sc.nextInt();
	  
	  System.out.println("Input third number: ");
	  int num3 = sc.nextInt();
	   
	 
	  System.out.println("Arithmatic Operation 1 : "+num1 + " + " + num2 + " * " + num3 + " = "+ (num1 + num2 * num3));
	   
	  System.out.println("Arithmatic Operation 2 : "+num3 + " + " + num1 + " / " + num2 + " = "+ (num3 + num1 / num2));
	  	   
	  System.out.println("Arithmatic Operation 3 : "+num1 + " % " + num2 + " + " + num3 + " = "+ (num1 % num2 + num3));
	   
	  System.out.println("Arithmatic Operation 4 : "+num1 + " * " + num2 + " + " + num3 + " = "+ (num1 * num2 + num3));
	 }
	
}
