package com.Bridgelabz;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num;
        int reversed = 0;
	    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: " );
		num=sc.nextInt();
	    
	   	   
		while(num != 0) 
		{
	    
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
           num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	  }
}

