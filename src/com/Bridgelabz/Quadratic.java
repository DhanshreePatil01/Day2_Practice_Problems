package com.Bridgelabz;

import java.util.Scanner;

public class Quadratic {
  
		static void roots(int a, int b, int c) {
			
			
			int delta = (b * b - 4 * a * c);
			double root1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
			double root2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
			System.out.println(root1);
			System.out.println(root2);

		}

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
			try {
				System.out.println("enter a ");
				int a = sc.nextInt();
				
				System.out.println("enter b");
				int b = sc.nextInt();
				
				System.out.println("enter c");
				int c = sc.nextInt();
				
				roots(a, b, c);
			} 
			catch (Exception e) 
			{
				System.out.println("enter correct input");
			}
			
		}
	}