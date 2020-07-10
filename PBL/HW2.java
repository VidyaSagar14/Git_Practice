class HW2{
	public static void main(String args[]){
		int x[][]=new int[3][];
		x[0]=new int[]{1,2,3};
		x[1]=new int[]{8,9};
		x[2]=new int[]{78,89,65,67};
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
				System.out.println(" ");
		}
	}
}