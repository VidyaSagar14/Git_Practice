
import java.util.Scanner;
class AscOrder{
		int n,arr[],min[];
		min=new int[n];
			public void input()
			{
				System.out.println("Enter the size of the Array:-");
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();
				arr=new int[n];

				for(int i=0;i<n;i++)
					arr[i]=sc.nextInt();

				}


			void display()
			{
					for(int i=0;i<n;i++)
						System.out.print(arr[i]+"\t");
			}
			/*int swap(int a,int b)
			{
				int temp=a;
				a=b;
				b=a;
				return(a,b);
			}*/

			void sort()
			{
				for(int i=0;i<n;i++)
				{
					min[i]=arr[i];
					if(arr[i]>arr[i+1])
					{
						int temp;
						temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
						min[i]=arr[i];

					}
				}
				for(int i=0;i<n;i++)
					System.out.print(min[i]+" ");
			}
}


class ArraySortAsc{
	public static void main(String args[]){
		AscOrder obj=new AscOrder();
		obj.input();
		obj.display();
		System.out.println("Before sort:-");
		obj.sort();
		System.out.println("After sort:-");
		obj.display();
	}
}




