import java.util.Scanner;

class ExerciseQ23{
	public static void main(String args[]){
		int n,arr[],sum=0,pos1=0,pos2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:-");
		n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++)
		{
				if(arr[i]==6)
				{
					pos1=i;
					break;
			    }

		}
		for(int i=0;i<n;i++)
				{
						if(arr[i]==7)
						{
							pos2=i;
							break;
					    }

				}
		for(int i=0;i<n;i++)
					{
				if(i>=pos1 && i<=pos2)
				   continue;
				System.out.print(arr[i]+"+");
				sum+=arr[i];

					}
					System.out.println(" ");
					System.out.println(sum);

	}
}

