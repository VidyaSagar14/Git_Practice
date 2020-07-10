import java.util.Scanner;
class HW4{
	public static void main(String args[]){
		int n;
		System.out.println("Enter the size of the array:-");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements in the array:-");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

		System.out.println("Displaying the elements of the array:-");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");


		System.out.println("Copying the elements of one array to another array:-");
		int[] arr1=new int[n];
		for(int i=0;i<n;i++)
			arr1[i]=arr[i];

		System.out.println("Displaying the copied array");
		for(int i=0;i<n;i++)
			System.out.print(arr1[i]+" ");
		}
	}

