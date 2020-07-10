class CW11{
	public static void main(String args[]){
		String s2="Hello";
		StringBuffer s=new StringBuffer();
		StringBuffer s1=new StringBuffer(50);
		StringBuffer s3=new StringBuffer("God");

		s.append(s2);

		System.out.println(s.length());
		System.out.println(s.capacity());
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println(s3.length());
		System.out.println(s3.capacity());
		s.insert(4,'a');
		System.out.println(s);
		s.setCharAt(4,'d');
		System.out.println(s);
	}
}