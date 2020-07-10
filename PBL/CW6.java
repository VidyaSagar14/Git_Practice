class CW6{
	public static void main(String args[]){
		int a=14,b;
		int A[]={12,15,7};
		try
		{
			b=a/args.length;
			A[8]=20;
		}
		catch(ArithmeticException e)
		{
				System.out.println("Divide by zero error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of range error");
		}
	}
}
