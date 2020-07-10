import java.util.Scanner;
class check{
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	 int pass(int ar[])
	{
		for(int i=0;i<n;i++)
			ar[i]=s.nextInt();

			System.out.println("Display");
		for(int i=0;i<n;i++)
			System.out.println(ar[i]+"\t");
			return 1;
	}
	int frequency(int ar[])
	{
			int freq=0,cpy=0,curr_freq,x;
			for(int i=0;i<n;i++)
			{
				curr_freq=1;
				cpy=ar[i];
				for(int j=i+1;j<n;j++)
				{
					if(ar[i]==ar[j])
					{
						curr_freq++;
					}
				 }
					if(freq < curr_freq)
					{
						freq=curr_freq;
						x=cpy;
						return x;
					}
				}
	}

	class Hackrank{
		public static void main(String args[]){
			int arr[]=new int[4];
			check ob=new check();
			ob.pass(arr);
			ob.frequency(arr);
		}
	}

