import java.util.Scanner;
class HW5{//Sum and avg of array
	public static void main(String args[]){
		System.out.println("Enter the size of the array:-");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

		System.out.println("Displaying Sum of all the elements of the array and its average:-");
		int sum=0;
		float avg;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		avg=sum/n;
		System.out.println("Sum and avg are"+" "+sum+" "+avg);
	}
}
