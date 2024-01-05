package interviewQuestion;

import java.nio.file.*;

//There are multiple ways of writing and reading a text file in Java. this is required while dealing with many applications. There are several ways to read a plain text file in Java e.g. you can use FileReader, BufferedReader, or Scanner to read a text file. Every utility provides something special e.g. BufferedReader provides buffering of data for fast reading, and Scanner provides parsing ability.
//Methods:
//Using BufferedReader class
//Using Scanner class
//Using File Reader class
//Reading the whole file in a List
//Read a text file as String

public class ReadTxt {
	 public static String readFileAsString(String fileName)
		        throws Exception
		    {
		        String data = "";
		        //data = new String(
		           // Files.readAllBytes(Path.get(fileName)));
		        return data;
		    }		 
		    public static void main(String[] args) throws Exception
		    {
		        String data = readFileAsString(
		            "C:\\Users\\abhi\\Desktop\\test.java");
		        System.out.println(data);
		    }
		    
}
