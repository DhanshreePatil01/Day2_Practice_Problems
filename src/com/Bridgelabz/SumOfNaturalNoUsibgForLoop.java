package com.Bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNoUsibgForLoop {

	public static void main(String[] args)   
	{
		
	Scanner sc=new Scanner(System.in);
    
	int num; 
	int sum=0; 
	 
    System.out.println("Enter the number: ");
    num=sc.nextInt();  
       
    for(int i = 1; i <= num; ++i)  
    {  
        sum = sum + i;  
    }  
    
    System.out.println("The sum of natural numbers is: "+sum);
}
}
