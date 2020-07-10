import java.util.*;
class CW23{//Stack
	public static void main(String args[]){
		Stack<Integer>s=new Stack<Integer>();
		s.push(6);
		s.push(12);
		s.push(8);
		s.push(34);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s);
		int pos=s.search(12);
		System.out.println("position: "+pos);
		System.out.println(s.peek());

	}
}