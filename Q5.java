package compinnoTest;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" enter value");
	  Scanner sc= new Scanner(System.in);  // enter value
		int a=sc.nextInt();
		
		for (int i = 0; i <a; i++) 
		{
			int b=sc.nextInt(); // input array
			int c[]=new int[b];  // creating new array
			
			int multi=0;
			for (int j = 0; j < c.length; j++) 
			{
				c[j]=sc.nextInt();
				
			}
			boolean flag=false;  // take boolean
			for (int j = 0; j < c.length-1; j++) 
			{
				multi=c[j]*c[j+1];
				if(multi==c[j]|| multi == c[j+1])
				{
					flag=true;
				}
			}
		
		if(flag)
		{
			System.out.println("yes");
		}
		else
			
		{
			System.out.println("no");
		}
	}

}}
