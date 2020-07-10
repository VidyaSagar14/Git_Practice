interface A{     //prototype
	int x=10;
	void display();
}

class B implements A{
	int y;
	public void display()
	{
		y=25;
		int s=x+y;
		System.out.println("Sum = "+s);
	}
}
class CW2{
	public static void main(String args[]){
		A ob = new B();
		ob.display();
	}
}

