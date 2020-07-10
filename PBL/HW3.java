import java.util.*;
class Students{
	String name,branch;
	int roll;
}


class HW3{
	public static void main(String args[]){
		int n;
		System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Students[] obj=new Students[n];
		for(int i=0;i<n;i++)
			obj[i]=new Students();


		System.out.println("Enter the name,branch and roll of students:-");
		for(int i=0;i<n;i++)
		{
			obj[i].name=sc.next();
			obj[i].branch=sc.next();
			obj[i].roll=sc.nextInt();
		}
	System.out.println(" ");
		System.out.println("Dispalying the students information:-");
		System.out.println("Name \t Branch \t\tRoll");
		for(int i=0;i<n;i++)
			System.out.println(obj[i].name+"\t"+obj[i].branch+"\t"+obj[i].roll);
		System.out.println(" ");
	}


}


