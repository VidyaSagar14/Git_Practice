import java.util.Scanner;
class RotateArr{
	public static void main(String args[]){
		int n,arr[],temp=0,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array:-");
		n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number that how many times you want to rotate elements:-");
		d=sc.nextInt();
		for(int c=1;c<=d;c++)
		{
			temp=arr[0];
			for(int i=1;i<n;i++)
			{
				arr[i-1]=arr[i];
				arr[i]=temp;
			}

		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		}
	}





