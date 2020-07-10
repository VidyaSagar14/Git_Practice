class Super{
	void func(){
		System.out.println("Hello");
	}
	void func1(){
		System.out.println("Ram");
	}

}

class Sub extends Super{
	void func(){
		System.out.println("Goodnight");
	}
	void func1(){
		System.out.println("Shyam");
		}

}

class TCSQ{
	public static void main(String args[]){
		Super ob=new Sub();
		ob.func();
		ob.func1();

	}
}
