import java.util.*;
class CW20{
	public static void main(String args[]){
LinkedList<Integer>list1=new LinkedList<Integer>();
int n,x;
System.out.println("Enter te size");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Insert number");
		for(int i=0;i<n;i++)
		{
			x=sc.nextInt();
			list1.add(x);
		}
	System.out.println(list1);
	LinkedList<Integer>list2=new LinkedList<Integer>();
	System.out.println("2nd linked list");
	list2.add(-65);
	list2.add(-88);
	System.out.println("adding 2nd linked to first linked list");
	list1.addAll(list2);
	System.out.println(list1);
	list1.addAll(2,list2);
	System.out.println(list1);
	list1.addFirst(20);
	list1.addLast(13);
	//list1.addAll(list2);
	System.out.println(list1);
	list1.add(4,3636);//insert at particular position
	System.out.println(list1);
	list2.clear();
	System.out.println(list2);
	Object s=list1.clone();
	System.out.println("Clone fo 1st linked list");
	System.out.println(s);
	boolean v=list1.contains(-65);
	System.out.println(v);
	System.out.println("Element at 6th position");
	System.out.println(list1.get(6));
	System.out.println("Element at 1st position");
	System.out.println(list1.getFirst());
	System.out.println("Element at last position");
	System.out.println(list1.getLast());
	int m1=list1.lastIndexOf(6);
	System.out.println(m1);
	Object h=list1.poll();
	System.out.println("Deleting first element:-"+h);
	System.out.println(list1);
	Object h1=list1.pollLast();
	System.out.println("Deleting Last element:-"+h1);
	System.out.println(list1);
	System.out.println("Updating the value at 2nd position");
	list1.set(2,56);
	System.out.println(list1);
	System.out.println(list1.size());
	System.out.println(" ");
	System.out.println("Deleted element is "+h);
	h=list1.removeFirstOccurrence(4);
	System.out.println("Deleted element is "+h);
	h=list1.removeLastOccurrence(4);


	}
}
