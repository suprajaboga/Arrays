//Serialization is the process of storing the data object into a file
//De-Serialization is the process of extracting the data object from a file
//When we store the data in the form of a object, no one can read it and it can be done through deserialization only

package serialization;
import java.io.*;

class Employee implements Serializable
{
	public int id;
	public String name;
	public int salary;
	public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class serialization 
{	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		//Serialisation
//		Employee emp=new Employee(1,"Supraja",5000);
//		FileOutputStream fout=new FileOutputStream("C:\\Users\\Supraja Boga\\Downloads\\test.txt");
//		ObjectOutputStream out=new ObjectOutputStream(fout);
//		out.writeObject(emp);
//		out.close();
//		System.out.println("Object is saved in a file");
		
//		De-Serialization
		FileInputStream fin=new FileInputStream("C:\\Users\\Supraja Boga\\Downloads\\test.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		Employee emp=(Employee)in.readObject();
		System.out.println("Id : "+emp.id);
		System.out.println("Name : "+emp.name);
		System.out.println("Salary : "+emp.salary);		
	}
}
