import java.util.Scanner;
class ExerciseQ20{
	public static void main(String args[]){
		int n,arr[],count=0;
		System.out.println("Enter the size of the array:-");
		Scanner q = new Scanner(System.in);
		n=q.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=count;
			count++;
		}
		System.out.println("Displaying the corrsponding ASCII value");
		for(int i=0;i<n;i++)
			System.out.print((char)arr[i]+" ");
	}
}