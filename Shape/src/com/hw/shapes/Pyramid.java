package com.hw.shapes;
import java.util.Scanner;
public class Pyramid {
public static String main(String args[]) {
	
		// Pyramid block     
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int row, i, j;  
		System.out.print("Enter the number of rows you want to print: ");  
		Scanner sc = new Scanner(System.in);  
		row = sc.nextInt();  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=row-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}
		sc.close(); // Closes 'Scanner' Utility
		return null;
	}   
}  