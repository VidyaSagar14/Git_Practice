import java.util.Scanner;
class CW17{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter Age");
		age=sc.nextInt();
		assert age>=18:"He/She is minor";
		System.out.println("He/she is Adult");
	}
}