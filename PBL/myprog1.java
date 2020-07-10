class A
 {
 public static void main(String[] args)
  {
StringBuffer sb=new StringBuffer();
String surname="Mallapudi";
String lastname="vijaya";
sb.append(surname);
System.out.println("Name: "+sb);
int n=surname.length();
sb.insert(n,lastname);
System.out.println("Full name: "+sb);
System.out.println("In reverse = "+sb.reverse());
StringBuffer s=new StringBuffer("Welcome to BBSR");
s.replace(6,10,"Aloka");
System.out.println(s);
System.out.println(s.capacity());
StringBuffer m=new StringBuffer();
System.out.println(m.capacity());
System.out.println(m.length());
System.out.println(s.length());
System.out.println(s.charAt(5));
s.setCharAt(10,'X');
System.out.println(s);
s.insert(5,"my");
System.out.println(s);
}
}