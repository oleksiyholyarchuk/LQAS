package ua.com.intend.java.RandomDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/*Date parsing, generating random Date, put it into Collection and extract from there Y, M, D separately*/

public class RandomTest {

    public static void main(String[] args) {
    	
    	ArrayList <Integer> list = new ArrayList<Integer>();

    	String pattern = "yyyy-MM-dd HH:mm:ss.S";
    	SimpleDateFormat format = new SimpleDateFormat(pattern);
    	try{
    		Date date = format.parse("2016-03-23 00:00:00.0");
    		System.out.println("Parsed date: " + date);
    	} catch (ParseException e) {
    		e.printStackTrace();
    	}
    	
    //------------------------------	
    	 GregorianCalendar gc = new GregorianCalendar();

         int year = randBetween(1900, 2010);

         gc.set(gc.YEAR, year);

         int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

         gc.set(gc.DAY_OF_YEAR, dayOfYear);

         Integer Y = gc.get(gc.YEAR);
         Integer M = gc.get(gc.MONTH) + 1;
         Integer D = gc.get(gc.DAY_OF_MONTH);
         
         list.add(Y);
         list.add(M);
         list.add(D);
     	
     	list.get(0); //year
     	list.get(1); //month
     	list.get(2); //day
        
     	System.out.println("Year: " + gc.get(gc.YEAR) + " Month: " + (gc.get(gc.MONTH) + 1) + " Day: " + gc.get(gc.DAY_OF_MONTH));
    
     	 for(Integer element: list)
     		System.out.println(element);
   
    }
    
    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}

