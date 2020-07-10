import java.util.Scanner;
class CW14{

		public static void main(String args[]){
			//BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your name:");
			String b=s.nextLine();
			System.out.println("Enter Marks in 2 subjects");
			int m1=s.nextInt();
			int m2=s.nextInt();
			int tm=m1+m2;
			System.out.println("sum"+tm);
			System.out.println("If you want to continue enter true otherwise enter false");
			boolean f=s.nextBoolean();
			if(f==false)
				return;
			}


	}
}