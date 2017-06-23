package emp;

import java.util.Scanner;

public class positive {
	  public static void main(String[] args) 
	    {
	        Scanner in=new Scanner(System.in);
	        int size=in.nextInt();
	        if(size>0)
	        {
	        int arr[]=new int[size];
	        for(int i=0;i<size;i++)
	            arr[i]=in.nextInt();
	        for(int i:arr) 
	        {
	            for(int j:arr)
	            {
	                    if((i+j)==0)
	                    System.out.println(i+" "+j);
	            }
	        }
	        }
	        else
	        System.out.print("0");
	        in.close();
	    }
	}

