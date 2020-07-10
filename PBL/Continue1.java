import java.util.Scanner;
class Continue1{
	public static void main(String args[]){
		int n;
		System.out.println("Enter length:-");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

		for(int i=0;i<10;i++)
		{
			while((arr[i]!=7) && (arr[i]==5))
			{
				continue;

			}
			System.out.println(arr[i]+" ");
		}
	}
}