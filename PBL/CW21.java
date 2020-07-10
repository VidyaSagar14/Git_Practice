class MyThread extends Thread{
	public void run()
	{
		System.out.println("Thread is running");
		for(int i=0;i<10;i++){
			System.out.println(i);
			try{
				sleep(1000);
			}
			catch(InterruptedException e){}
}
		}
	}

class CW21{
	public static void main(String args[]){
		MyThread T1=new MyThread();
		MyThread T2=new MyThread();
		T1.start();
		T2.start();
		System.out.println(T1);
		System.out.println(T2);
		System.out.println(T1.isAlive());
	}
}