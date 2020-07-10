import java.util.Scanner;
class Nth_Prime{//wrong try again!
	public static void main(String args[]){
		int n;
		System.out.println("Enter the nth position:-");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int pos=1;pos<=n;pos++)
		{
			int k=0;
			for(int i=1;i<=pos;i++)
			{
				for(int j=2;j<(i/2);j++)
				{
					if(i%j==0)
						k++;
				}
					if(k==0)
						System.out.println(i);
					else
						System.out.println("Not Prime");

			}
		}
	}
}

