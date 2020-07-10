import java.util.*;
class Fibonacci{
	public static void main(String args[]){
		int a=0,b=1,sum=0,count=0,n;
		System.out.println("Enter the nth position for the fib number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//System.out.print(a+" "+b+" ");
		for(int i=0;i<n-1;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			//System.out.print(sum+" ");
		}
		System.out.print(sum+" ");
	}
}

