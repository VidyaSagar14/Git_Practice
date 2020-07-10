class CW5{
	public static void main(String args[]){
		int a=14,b=0,c;
		System.out.
		println("Exception Demo");
		try
		{
			c=a/b;
			System.out.println("Result="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured dur to divide by 0");
		}
		System.out.println("End of program");
	}
}