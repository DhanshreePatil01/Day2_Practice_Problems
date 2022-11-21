package com.Bridgelabz;

import java.util.Scanner;

public class ReverseIntegerUsingForLoop {

	public static void main(String[] args) {
		
	int num;
    int reversed = 0;
    
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number: " );
	num=sc.nextInt();
    
   	   
	for( ;num != 0; num=num/10)   
	{  
	int remainder = num % 10;  
	reversed = reversed * 10 + remainder;  
	}  

    System.out.println("Reversed Number: " + reversed);
  }
}
