import java.util.Scanner;
class ExerciseQ22{
	public static void main(String args[]){
		int n,arr[],x,freq=0,curr_freq,cpy=0;
		System.out.println("Enter the size of the array:-");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]= sc.nextInt();

System.out.println("Frequnecy of elements and the corresponding element:-");
		for(int i=0;i<n;i++)
		{
			curr_freq=1;
			x=arr[i];
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
					curr_freq++;
			}
			if(freq < curr_freq)
			{
				freq=curr_freq;
				cpy=x;
				System.out.println(freq+" "+cpy);

			}

		}
	//System.out.println("Maximum frequency is"+max+" ");
	}
}





