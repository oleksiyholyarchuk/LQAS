/*2. Задано масив цілих чисел. Вивести масив в оберненому порядку, 
а потім видалити з нього повторні входження кожного елемента.*/
package ua.com.intend.java.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		
		Integer[] array = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4};
		
		for(int i = 0; i <= array.length  - 1; i++) {
			  System.out.print(array[i] + "  ");
			}
		System.out.println("\n-----------------------------");
		
		for(int i = array.length-1; i >= 0; i--) {
			  System.out.print(array[i] + "  ");
			}
		System.out.println("\n-----------------------------");
		
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(array));
		printList(set);
	}
		public static void printList(Set<Integer> set) {
            for (Integer e : set) {
                System.out.print(e+" ");
            }
	}
}
