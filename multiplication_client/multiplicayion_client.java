//To make this available for the client,install JDK in client's system. In my system, right click on project->export->java->runnable jar file
//browse and select the jar file->finish. Now, go to the directory and create a .bat file, open with the notepad and type this
//java -jar <filename>.jar , Now double double click on the bat file and you can execute the program and send this application file
//to client and done

package multiplication_client;
import java.util.*;
import java.io.*;

public class multiplicayion_client 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		try
		{
			for(int i=1;i<=10;i++)
				System.out.println(n + " * " + i + " = " + n*i);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Only numbers are allowed");
		}
		sc.nextLine();
	}
}
