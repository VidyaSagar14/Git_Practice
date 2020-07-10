class ExerciseQ17{
	public static void main(String args[]){
		int num=456787654,rev=0,temp=num,rem;
	while(num!=0)
	{
		rem=num%10;
		num/=10;
		rev=(rev*10)+rem;
	}
	if(temp==rev)
		System.out.println(temp +" "+"is Pallindrome");
	else
		System.out.println(temp+" "+"is not pallindrome");
	}
}