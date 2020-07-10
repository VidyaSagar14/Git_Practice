import java.util.Scanner;
class CW15{
	public static void main(String args[]){
		int A[],n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the Array:-");
		n=s.nextInt();
		A=new int[n];
		System.out.println("Enter the elements of Array:-");
		for(i=0;i<n;i++)
			A[i]=s.nextInt();
		System.out.println("Array Elements are:-");
		for(i=0;i<n;i++)
			System.out.print(A[i]+"\t");
		}
	}