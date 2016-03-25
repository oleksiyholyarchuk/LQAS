package ua.com.intend.java.FileManipulations;

/*Use File class with try catch block and throws keyword. Read Strings numbers from text file, 
save them in ArrayList as int numbers and sort them and write to another file.*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileManipulations {

	public static void main(String[] args) throws IOException {
		try {
			readCastSortStore("text.txt");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
	public static ArrayList<Integer> readCastSortStore (String fileToRead) throws IOException {
		File file = new File(fileToRead);
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner in = new Scanner(file);
		while (in.hasNextLine()) {
			list.add(Integer.parseInt(in.next()));
		}
		in.close();
       
        Collections.sort(list);
       
        for (Integer element: list)
			System.out.println(element);
        
        FileWriter fw = new FileWriter("stored.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for (Integer element:list){
				bw.write(" \n "+element);
		}
		bw.close();
		
        return list;	
        }
}
	


