import java.util.*;
class CW24{
	public static void main(String args[]){
		//as we use the interface of queue we can't make the object of Queue class but can create its reference
		Queue<Integer> q=new PriorityQueue<Integer>();//from Queue the priorityQueue is inherited
		q.add(12);
		q.add(5);
		q.add(16);
		System.out.println(q);
	}
}

