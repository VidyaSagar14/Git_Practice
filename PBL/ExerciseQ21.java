import java.util.Scanner;
class ExerciseQ21{//check once and also find third largset and third smallest
	public static void main(String args[]){
		int n,i,j,max=0,min=0;
		System.out.println("Enter the size of the array:-");
		Scanner scc=new Scanner(System.in);
		n=scc.nextInt();
		int arr[]=new int[n];

		System.out.println("Enter the elements:-");
		for(i=0;i<n;i++)
			arr[i]=scc.nextInt();

		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");

	System.out.println(" ");

		//System.out.println("Displaying Maximum And Minimum elements in an array:-");
		max=arr[0];
		for(i=1;i<n;i++)
		{
			int max_sec;
				if(arr[i] > max)
				{
					max_sec=max;
					max=arr[i];
					System.out.println("Largest and second largest elements in an array:-"+" "+ max+" "+max_sec);
				}


		}
		System.out.println(" ");

		min=arr[0];
		for(i=1;i<n;i++)
		{
			int min_sec;
			if(arr[i] < min)
			{
				min_sec=min;
				min=arr[i];
				System.out.println("Smallest and second smallest elements in an array:-"+min+" "+min_sec);
			}


		}
	}
}


