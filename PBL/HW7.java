import java.util.Scanner;
class HW7{
	public static void main(String args[]){
		int n,arr[],i,key;
		System.out.println("Enter the size of the array:-");
		Scanner c=new Scanner(System.in);
		n=c.nextInt();
		arr=new int[n];
		for(i=0;i<n;i++)
			arr[i]=c.nextInt();
		System.out.println("Enter the Number to search:-");
		key=c.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i]==key)
				System.out.println(i);
			else
				System.out.println("-1");
		}
	}
}

