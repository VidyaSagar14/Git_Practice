import java.util.*;
class CW22{
	public static void main(String args[]){
		Vector<Integer>v=new Vector<Integer>();
		v.add(20);
		v.add(5);
		v.add(7);
		v.add(14);
		System.out.println(v);
		v.add(1,1500000000);//adds the element at 1st position
		System.out.println(v);
		Vector<Integer>v1=new Vector<Integer>();
		v1.add(20);
		v1.add(8);
		v.addAll(v1);//merging two vectors
		System.out.println(v);
		v.addElement(14);
		System.out.println(v);//add element at last indexSystem.out.println(v);
		System.out.println(v.capacity());//gives the total size of th vector if the size exceed the previous one then "10+n"
		Object v2=v1.clone();
		System.out.println(v2);
		System.out.println(v.contains(8));//search wheteher the element 8 is present or not and return boolean value
		System.out.println(v.containsAll(v1));
		System.out.println(v.elementAt(5));//search at index 5 ,thhe method is of Vector class
		System.out.println(v.equals(v1));//compare the vector v with v1 interms of size and elements of vector
		System.out.println(v.firstElement());
		System.out.println(v.get(4));//search at index 4 but the get() is of collection framework
		System.out.println(v.indexOf(15));
		//System.out.println(v.insertElementAt(17,3));//error as insertElement returns void so S.O.P can't show avlue
		v.insertElementAt(17,3);
		System.out.println(v);
		System.out.println(v.isEmpty());
		System.out.println(v.lastElement());
		v.remove(4);
		System.out.println(v);
		v1.removeAllElements();
		System.out.println(v1);
		v.removeElementAt(2);
		System.out.println(v);
		v.set(4,35);
		System.out.println(v);
		System.out.println(v.size());
		v.setSize(20);
		System.out.println(v.capacity());
		System.out.println(v.subList(2,5));

	}
}