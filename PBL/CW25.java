//Serialization and Deserialization
import java.io.*;
class Emp implements Serializable
{
	int Empid;
	String name;
	int salary;
	Emp(int e,String n,int s)
	{
		Empid=e;
		name=n;
		salary=s;
	}
}
//object serialization and deserialization
class CW25
{
	public static void main(String args[])
	{
		try
		{
			Emp ob=new Emp(201,"Krishna",48000);
			FileOutputStream fout=new FileOutputStream("emp.txt");//file will be created in current diretory where we are working
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(ob);
			out.close();
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		//object deserialization
		try
		{
			FileInputStream fin=new FileInputStream("emp.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			Emp ob2=(Emp)in.readObject();
			in.close();
			fin.close();
			System.out.println("Emp Id:"+ob2.Empid);
			System.out.println("Emp Name:"+ob2.name);
			System.out.println("Salary:"+ob2.salary);
		}
		catch(Exception e){System.out.println(e);}
	}
}