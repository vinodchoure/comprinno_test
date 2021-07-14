package compinnoTest;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		System.out.println(" enter value");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();      //enter test cases

		for (int i = 0; i <a; i++)       
		{ 
			int b=sc.nextInt();             
			String c[] =new String[b];
			for (int j = 0; j <c.length; j++)
			{
				c[j]=sc.next();            // pass value
			}
			boolean flag=true;               //tacking boolean 
			for (int j = 0; j <c.length; j++)
			{
				if(j==c.length-1 && c[j]=="cookie")   // provading  condition
				{
					flag=false;
					break;
				}
				if(c[j]=="cookie" && c[j+1]=="cookie")   // provading second condition
				{
					flag=false;
					break;
				}
			}
			if(flag)                          
				System.out.println("yes");   // conditon true then print line
			else
				System.out.println("no");   //condition false then print line
		}
	}

}