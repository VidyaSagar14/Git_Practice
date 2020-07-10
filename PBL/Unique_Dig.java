import java.util.Scanner;
class Unique_Dig{
	public static void main(String args[]){
		int num,arr[],y,c=0;
		System.out.println("Enter any number:-");
		Scanner tk=new Scanner(System.in);
		num=tk.nextInt();
		y=num;
		while(y!=0)
		{
			y=y/10;
			c++;
		}

		arr=new int[c];
		int i=0;
		for(y=num;y>0;y=y/10)
		{
			arr[i]=y%10;
			i++;
		}
		for(i=0;i<c;i++)
			System.out.print(arr[i]+" ");

		for(i=0;i<c;i++)
		{
			c=0;
			for(int j=i+1;j<c;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
					//arr[j]=(-99999);
				}
				if(c==0)
					System.out.println(arr[i]);
			}
		}
	}
}








