package com.Bridgelabz;

import java.util.Scanner;

public class Distance {

	static void calculate(int x, int y)
	{
		System.out.println("distance from "+x+" and "+y+" is " + Math.pow((x * x + y * y), 0.5));
	}

	public static void main(String[] args)
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("enter value for x : ");
			int x = sc.nextInt();
			
			System.out.print("enter value for y : ");
			int y = sc.nextInt();
			
			calculate(x, y);
			
		} catch (Exception e) {
			System.out.println("enter integer only");
		}
	}
}

