class CW7{
	public static void main(String args[]){
		int a=14,b=30,c;
		String s=null;
		try
		{
			int k=s.length();
			System.out.println("length="+k);
		}
		catch(NullPointerException e)
		{
			System.out.println("String Assigned Null Value");
		}
		finally
		{
			c=a+b;
			System.out.println("Sum="+c);
			System.out.println("End of Program");
		}
	}
}