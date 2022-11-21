package com.Bridgelabz;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String args[]){  
		Scanner sc= new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    int num= sc.nextInt();
	 
	    int reverse=0, element, remainder; 
	    element = num;
		    
	    for(int i=0;i<num;i++)
	    {
	    	remainder= num % 10;
	    	reverse=(reverse*10)+remainder;
	    	num=num/10;
	    }
	    if (element == reverse){
	      System.out.println("palindrome");
	    }
	    else{
	      System.out.println("Not palindrome");
	    }
	  }
	}