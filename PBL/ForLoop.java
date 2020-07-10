class ForLoop
{
		public static void main(String args[]){
			int b[]={10,20,30,40,50,-60,70};
			System.out.println(b.length);
			
			int a[]=new int[5];
			for(int i=0;i<5;i++)
				a[i]=i+10;
			System.out.println(a.length);
			
			for(int i=0;i<7;i++)
				System.out.println("\t" +b [i]);
			
			System.out.println("\n");
			//for each loop
			for(int v : a){
				System.out.println("\t" + v);
			}
		}
}