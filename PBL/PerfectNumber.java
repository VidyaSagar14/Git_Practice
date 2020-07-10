class PerfectNumber
{
		public static void main(String args[])
		{
				int n,i,k,sum;
				n=6;
				k=0;
				sum=0;
				
				for(i=1;i<n/2;i++)
				{
					if(n%i==0)
						k++;
						sum+=k;
				}
					if(n==sum)
						System.out.print("pefect number");
					else
						System.out.print("NOP");
		}
}