import java.util.Scanner;
class Menu{
	public void operands(int x,int y)
	{
		System.out.println("Press 1 to perform addition and 2 for Subtraction:-");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
			if(num==1)
				System.out.println("Sum="+(x+y));
			else
				System.out.println("Subtract= "+(x-y));
		}
	}


class ExerciseQ19{
	public static void main(String args[]){
		int a,b,c;
	System.out.println("Enter two operands:");
	Menu ob=new Menu();
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	a=sc1.nextInt();
	b=sc2.nextInt();

	ob.operands(a,b);
	}
}
