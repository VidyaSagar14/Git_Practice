class Food{
	@Deprecated
	void eatingFood()
	{
		System.out.println("jsjjs");
	}
}
class CW18{
	@SuppressWarnings("deprecation")
	public static void main(String args[])
	{
		Food ob=new Food();
		ob.eatingFood();
	}
}