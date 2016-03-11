/*3. Найменший елемент масиву замінити цілою частиною середнього арифметичного всіх елементів. 
Якщо в масиві є декілька найменших елементів, то замінити останній з них.*/
package ua.com.intend.java.task3;

import java.util.Arrays;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		
		Integer [] array = {7, 6, 1, 2, 3, 4, 5, 6, 1, 8, 9, 10};  	
		
		int average = 0;
		 if (array.length > 0)
		 {
		     double sum = 0;
		     for (int j = 0; j < array.length; j++) {
		          sum += array[j];
		     }
		    average = (int)(sum / array.length);
		 }
		 
		 System.out.println("Середнє арифметичне елементів масиву: "+(int)(average));  
		Integer min = Integer.valueOf(array[0]);
		for(int i = 0; i != Integer.valueOf(array.length); i++){
            if(Integer.valueOf(array[i]) < min){
                min = Integer.valueOf((array[i]));
            }
        } 
		
		 System.out.println("Мінімальний елемент масиву: "+min); 
		
		 List<Integer> list = Arrays.asList(array); 
		 System.out.println("Масив до зміни: ");
		 printList(list); 
		 
		 	Integer integerAverage = new Integer(average); 
			
             int index = list.lastIndexOf(min); 
             System.out.println("\nІндекс останнього мінімального елементу в списку: "+index);
             list.set(index, integerAverage); 
             System.out.println("Масив після зміни: ");
             printList(list); 
	}
		public static void printList(List<Integer> list) {
            for (Integer e : list) {
                System.out.print(e + " ");
            }
		}
}
