class Check
{
	void func()
	{
		int count,k[],j;
		for(int num=10;num<100;num++)
		{
			count=0;
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==0)
			{
				System.out.println(num);
			}
		}
	}
}

class  ExeciseQ9
{
	public static void main(String args[])
	{
		Check ob = new Check();
		ob.func();

	}
}