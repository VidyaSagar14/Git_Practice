import java.util.*;
class Myclass1{
		int A[][],r,c;
		void input()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter rows and columns");
			r=sc.nextInt();
			c=sc.nextInt();
			A=new int[r][c];
			System.out.println("Enter the elements of the 2D Array");

			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
					A[i][j]=sc.nextInt();
				//System.out.println(" ");
			}
	}
	void Display()
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				System.out.print(A[i][j]+" ");
			System.out.println(" ");
			}
		}
}

class CW16{
	public static void main(String args[]){
		Myclass1 obj=new Myclass1();
		obj.input();
		obj.Display();
	}
}



