package compinnoTest;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();      // intput value
		
		for (int i = 0; i <a; i++)
		{
			int[] b=new int[3];       // creat array      
			for (int j = 0; j < b.length; j++) 
			{
				b[j]=sc.nextInt();     // I am getting each no. through scanner 
			}
			boolean flag=false;         // taking boolean 
				if(b[0]==1 && b[1]==1 && b[2]==8)
					flag=true;                     //if right make boolean true else it remain false
				else if(b[0]==1 && b[1]==1 && b[2]==4)
					flag=true;
				
				if(flag)                          
					System.out.println("yes");   //if condition true then print  true
				else
					System.out.println("no");   //else print no
		}
	}

}
