class A{
	int a;

}
class B extends A{
	int b;
	void setValue(){
		a=10;
		b=20;

	}
	void getValue(){
		int a=1,b=1;
		System.out.println(a+" "+b);
	}


}
class CW{
	public static void main(String args[]){
		B ob= new B();
		ob.setValue();
		ob.getValue();
	}
}