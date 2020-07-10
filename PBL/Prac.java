class Prac
{
	public static void main(String args[])
	{
		int n,i,k;
		n=13;
		k=0;
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
				k++;
		}
			if(k==0)
				System.out.print("prime");
			else
				System.out.print("Not prime");
	}
	
}