interface M{
	void show1();
}

interface N{
	void show2();
}

class A{
	void show3()
	{
		System.out.println("class A");
	}
}

class B extends A implements M,N
{
	public void show1()
	{
		System.out.println("Interface M");
	}
	public void show2()
	{
			System.out.println("Interface N");
	}
}
class CW3{
	public static void main(String args[]){
		B ob = new B();
		ob.show1();
		ob.show2();
		ob.show3();
	}
}

