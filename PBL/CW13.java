import java.io.*;
class CW13{
	public static void main(String args[])throws IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name:");
		String s=b.readLine();
		System.out.println("Enter Marks in 2 subjects");
		int m1=Integer.parseInt(b.readLine());
		int m2=Integer.parseInt(b.readLine());
		int tm=m1+m2;
		System.out.println("sum"+tm);
		boolean f=Boolean.parseBoolean(b.readLine());
		System.out.println(f);

	}
}