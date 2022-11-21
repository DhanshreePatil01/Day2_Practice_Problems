package com.Bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args)   
	{     
		Scanner sc=new Scanner(System.in);
        
		int num; 

        System.out.println("Enter the number: ");
        num=sc.nextInt();   
        
        int i=1;
        int sum=0;   
        
        while(i <= num)
        {
            sum += i;
            i++;
        }
        System.out.println("The sum of natural numbers is: "+sum);
     }
}