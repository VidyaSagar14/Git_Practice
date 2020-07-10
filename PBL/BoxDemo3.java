class Demo{
	protected int length,breadth;
}

class BoxDemo3{
	public static void main(String args[]){
		Demo ob1;
		ob1 = new Demo();
		ob1.length=10;
		ob1.breadth=20;
		System.out.println(ob1.length + " " + ob1.breadth);
	}
}