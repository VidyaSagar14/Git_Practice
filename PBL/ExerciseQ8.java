class Quest{
	int prime(int num){
		int count=0;
		for(int i=2;i<num/2;i++){
			if(num%i==0)
				count++;
			}
			if(count==0){
				System.out.println("Prime");
					return 1;
			}
			else{
				System.out.println("Not Prime");
				return 0;
			}
	}
}


class ExerciseQ8{
	public static void main(String args[]){
		Quest ob = new Quest();
		ob.prime(12);
	}
}



