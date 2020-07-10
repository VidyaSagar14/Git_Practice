import java.util.*;
class HW8{
	public static void main(String args[]){
		int n,arr[],temp=0;
		System.out.println("Enter the size of the array:-");
		Scanner d=new Scanner(System.in);
		n=d.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=d.nextInt();
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	System.out.println(" ");

		System.out.println("Removing duplicate elements in the array:-");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;


				}
			}
		}
		System.out.println("Displaying after deleting duplicate elements");
		for(int j=0;j<n;j++)
		{
				System.out.print(arr[j]+" ");

		}
	}
}

