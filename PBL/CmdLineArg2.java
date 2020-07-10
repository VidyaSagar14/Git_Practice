class CmdLineArg2{
	public static void main(String args[]){
		if(args.length<2)
			System.out.println("Invalid Arguments");
		else{
				int num=Integer.parseInt(args[1]);
				String gender=args[0];
			if((gender.equals("Female")) && (num>=1 && num<=58))
				System.out.println("percentage of intersest 8.2%");
			if((gender.equals("Female")) && (num>=59 && num<=120))
				System.out.println("percentage of intersest 7.6%");
			if((gender.equals("Male")) && (num>=1 && num<=60))
				System.out.println("percentage of intersest 9.2%");
			if((gender.equals("Male")) && (num>=61 && num<=120))
				System.out.println("percentage of intersest 8.3%");
			}
	}
}
