package compinnoTest;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		System.out.println(" input value ");
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();      //enter value
		
		for (int i = 0; i <h; i++)   //use for loop
		{               
			int a=sc.nextInt();    
			int b=sc.nextInt();    
			int p=sc.nextInt();    
			if(p==1)              
				a=a*2;           //if only one turn is their then multiply alice number by 2
			else if(p==2)
			{ 
				a=a*2;          
				b=b*2;
			}
			else if(p==3) // use if else if condition
			{
				a=(a*2)*2;
				b=b*2;
			}
			else if(p==4)
			{
				a=(a*2)*2;
				b=(b*2)*2;
			}
			int c=a;       
			int d=b;        //after completing all  Bob value stored in d
			int division=0;  //tacking variable division for calculating division 
			if(c>d)
				division=(int)(c/d);   //find division 
			else
				division=(int)(d/c);   // find  division
			System.out.println(division);   
		}
	}

}
