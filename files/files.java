package files;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

//Reading from file - character by character
//public class files 
//{
//	public static void main(String[] args) throws FileNotFoundException, IOException
//	{
//		File f=new File("C:\\Users\\Supraja Boga\\Desktop\\Notes.txt");
//		FileReader fr=new FileReader(f);
//		int i=fr.read();
//		while(i!=-1)
//		{
//			System.out.print((char)i);
//			i=fr.read();
//		}
//		fr.close();
//	}
//}


//Reading from file - line by line
//public class files 
//{
//	public static void main(String[] args) throws FileNotFoundException, IOException
//	{
//		File f=new File("C:\\Users\\Supraja Boga\\Desktop\\Notes.txt");
//		FileReader fr=new FileReader(f);
//		BufferedReader br=new BufferedReader(fr);
//		String line=br.readLine();
//		while(line!=null)
//		{
//			System.out.println(line);
//			line=br.readLine();
//		}
//		br.close();
//	}
//}


//Readall linesfrom flat file
public class files 
{
	public static void main(String[] args) throws IOException  
	{
		//To Read a file data
		var result = Files.readAllLines(Paths.get("C:\\\\Users\\\\Supraja Boga\\\\Desktop\\\\Notes.txt"));
		
		for(var r:result)
			System.out.println(r);
	}
}
