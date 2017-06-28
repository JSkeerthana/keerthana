package guvitest;

import java.util.Scanner;

public class star {

	public static void main(String[] args)
	{
		  int rows, i, j;

	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter number of rows in square pattern");
	        rows = s.nextInt();

	       
	        for(i = 0; i < rows; i++){
	           
	            for(j = 0; j < rows; j++){
	                System.out.print("*");
	            }
	            System.out.print("\n");
	            s.close();
	        }
	    }
	}
	
