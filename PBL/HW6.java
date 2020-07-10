import java.util.Scanner;
class HW6{
	public static void main(String args[]){
		int n,arr[],min=0,max=0;
		System.out.println("Enter the size of the array:-");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

	System.out.println("Finding Max and Min elements of the array:-");
	for(int i=0;i<n;i++)
	{
		if(arr[i]>arr[i+1])
		{
			max=arr[i];
			min=arr[i+1];
		}
		else
		{
			max=arr[i+1];
			min=arr[i];
		}
	}
	System.out.println("Maximum & minimum element of the array is:-"+" "+max+" "+min);
	}
}




