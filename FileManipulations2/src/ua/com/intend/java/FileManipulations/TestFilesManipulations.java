package ua.com.intend.java.FileManipulations;

import java.io.IOException;
import java.util.ArrayList;

public class TestFilesManipulations {
	
	public static void main(String[] args) throws IOException{
		
		String username = PropertyLoader.loadProperty("user.username");
		System.out.println(username);
		
		ArrayList<String> readFile = FileReaderWriter.readFileToArrayList("testfile.txt");
		
		FileReaderWriter.printParsedFile(readFile);
		
		ArrayList<String> writeArrayToList = new ArrayList<String>();
		
		writeArrayToList.add("1");
		writeArrayToList.add("22");
		writeArrayToList.add("333");
		writeArrayToList.add("44444");
		writeArrayToList.add("555555");
		
		FileReaderWriter.writeArrayToFile("testfileToWrite.txt", writeArrayToList);
		
		int divisionResult;
		try {
			divisionResult = 50 / 0;
			System.out.println(divisionResult);
		}
		catch (ArithmeticException ex){
			System.out.println("Devision by zero!");
		}
		
	}
}
