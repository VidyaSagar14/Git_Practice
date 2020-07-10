class AlphaNumber{
	public static void main(String args[]){
		char alp='A';
		if(alp >= 'a' && alp<='z' || alp >= 'A' && alp<='Z')
			System.out.println("Alphabet"+" "+alp);
		else
			System.out.println("Digit"+" "+alp);
	}
}