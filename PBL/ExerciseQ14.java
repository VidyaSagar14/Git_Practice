class ExerciseQ14{
	public static void main(String args[]){
		int num=1234,sum=0,rem,temp=num;
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			sum+=rem;
		}
		System.out.println(temp+"->"+sum);
	}
}

