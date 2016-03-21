package ua.com.intend.java.RandomNumsAndStrings;

import java.util.ArrayList;
import java.util.Random;


public class RandomTest {
	/*Generate random numbers, random numbers in range, 
	 * random arrayList of Strings with length between 6 and 15 random chars*/	
	 
	public static void main(String args[])
	    {
		Random random = new Random();
		for(int j=1;j<=random.nextInt(10);j++){
			generateRandomString();	
		}
		int minValue = 100;
		int maxValue = 1000;

		for(int i=0; i<3; i++)
		{
			int randomInteger = random.nextInt();
			System.out.println("Random Integer: " + randomInteger);
		}

		for(int i=0; i<3; i++)
		{
			int randomRangeInteger = random.nextInt(maxValue - minValue) + minValue;
			System.out.println("Random Integer in range 100-1000: " + randomRangeInteger);
	 } 
	} 
	 
	public static void generateRandomString() {
		 ArrayList<String> list = new ArrayList<String>();
		 String alphabet= "abcdefghijklmnopqrstuvwxyz";
	        String s = "";
	        Random random = new Random();
	        int randomLen = 6+random.nextInt(10);
	     
	        for (int i = 0; i < randomLen; i++) {
	            char c = alphabet.charAt(random.nextInt(26));
	            s+=c;  
	        }
	        list.add(s.toString());
	        for(String element: list)
				 System.out.println(element);
	 
	 }
}
	
