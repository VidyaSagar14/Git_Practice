class CmdLineArg{
	public static void main(String args[]){
		if(args.length>=3)
			System.out.println("Only two arguments are valid");
			if(args.length<2)
				System.out.println("Invalid");
		}
		int i1=Integer.parseInt(args[0]);
		int i2=Integer.parseInt(args[1]);
		System.out.println(i1+"technologies"+i2);
	}
}