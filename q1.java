package compinnoTest;

import java.util.Scanner;

class Codechef
{
public static void main (String args[]) throws java.lang.Exception
{
int d=0,i=0;
Scanner sc =new Scanner (System.in);
int t=sc.nextInt();
int a[]=new int[60];
a[0]=0;
a[1]=1;
for( i=2;i<60;i++);
{
a[i]=(a[i-2]+a[i-1])%10;
}
for ( i=0;i<t;i++)
{
long n=sc.nextLong();
long at=1;
while(at<=n)
{
at*=2;
}
System.out.println(a[(int)((at/2-1)%60)]);
}
}
}

