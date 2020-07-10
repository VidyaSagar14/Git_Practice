public class HW1{
	public static void main(String args[]){
		int[] source={12,13,14};
		int[] dest=new int[3];
		System.arrayCopy(source,0,dest,0,source.length);//Not working
		for(int i=0;i<dest.length;i++)
			System.out.print("Element at index"+i+":"+dest[i]);

	}
}
