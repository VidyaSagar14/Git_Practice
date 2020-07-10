//collection framework
import java.util.*;
class CW19{
	public static void main(String args[]){
		ArrayList<String> al=new ArrayList<String>();
		al.add("mm");
		al.add("aa");
		al.add("cc");
		al.add(1,"ff");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.set(2,"ss");
		System.out.println(al);
		String k=al.get(1);
		System.out.println(k);
		System.out.println(al.size());
		//Display elements individually
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		System.out.println(" ");
		for(String i:al)
			System.out.println(i);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		ArrayList<String>a2=new ArrayList<String>(al.subList(0,2));
		System.out.println(a2);
		String k1="mm";
		System.out.println(al.contains(k1));
		System.out.println(al.indexOf(k1));
		ArrayList a3=(ArrayList)al.clone();
		System.out.println(a3);
		System.out.println(al.isEmpty());
	}
}
	