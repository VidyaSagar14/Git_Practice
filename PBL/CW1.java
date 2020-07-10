abstract class Bank{
	void display()
	{
		System.out.println("This is the bank");
	}
	abstract void savingInterest(int r);
}

class PNB extends Bank{
	void savingInterest(int r)
	{
			System.out.println("Saving interst of PNB is"+r);
	}
}

class CW1{
	public static void main(String args[]){
		Bank ob=new PNB();