/*1. Написати програму для роботи з списком. У першій половині списку замінити елементи Е1 на Е2;*/

package ua.com.intend.java.task1;
import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
	
	public static void main(String[] args)
	{
		ArrayList <String> list = new ArrayList<String>();
		list.add("Java");
        list.add("Scala");
        list.add("Groovy");
        list.add("Kotlin");
        
        printList(list);
        System.out.println("---------------------------------");
        
        Collections.swap(list, 0, (list.size() - 1)/2);
        
        printList(list);
	}
        
        public static void printList(ArrayList<String> list) {
            for (String e : list) {
                System.out.println(e);
            }

	}

}
