package compinnoTest;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		System.out.println(" enter value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();      

		for (int i = 0; i <a; i++)       
		{ 
			int b=sc.nextInt();              
			int c[] =new int[b];          // taking array      
			for (int j = 0; j <c.length; j++)    //use for loop
			{
				c[j]=sc.nextInt();        //  use Scanner
			}
			int max=0;     //use variable
			int secondmax=0;     //using secondMax variable for comparison

			for (int j = 0; j < c.length; j++)  
			{
				if (max<c[j])          //if condition provide
				{
					secondmax=max;     //and putting variable into second max variable
					max=c[j];
				}
			}
			System.out.println(secondmax);  
		}
	}

}


