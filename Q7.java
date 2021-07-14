package compinnoTest;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		System.out.println(" intpur value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();      // taking value

		for (int i = 0; i <a; i++)       
		{ 
			int p=sc.nextInt();              
			int b[] =new int[p];          //creating array     
			int Area=1;               //using Area variable for calculating area
			int maxArea=Integer.MIN_VALUE;    
			for (int j = 0; j <b.length; j++)    
			{
				b[j]=sc.nextInt();        // I am getting each  scanner 
			}
			int cnt=0;
			for (int j = 0; j <b.length; j++)    
			{
				int x=0;
				for (int k = j+1; k <b.length; k++)    //using for loop for checking same length sticks
				{
					if (b[j]==b[k])         //if sticks are same 
					{
						x=b[j];           //store length in variable
					}
				}
				if (x!=0) 
				{
					Area=Area*x;      
					if (maxArea<Area)   
					{
						maxArea=Area;     //area stored in max area
						cnt++;            
					}

				}
			}
			if(cnt>=2)                           
				System.out.println(maxArea);   //if  condition true then print
			else
				System.out.println(-1);   //else print no

		}
	}

}


