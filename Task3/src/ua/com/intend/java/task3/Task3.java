/*3. ��������� ������� ������ ������� ����� �������� ���������� ������������� ��� ��������. 
���� � ����� � ������� ��������� ��������, �� ������� ������� � ���.*/
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
		 
		 System.out.println("������ ����������� �������� ������: "+(int)(average));  
		Integer min = Integer.valueOf(array[0]);
		for(int i = 0; i != Integer.valueOf(array.length); i++){
            if(Integer.valueOf(array[i]) < min){
                min = Integer.valueOf((array[i]));
            }
        } 
		
		 System.out.println("̳�������� ������� ������: "+min); 
		
		 List<Integer> list = Arrays.asList(array); 
		 System.out.println("����� �� ����: ");
		 printList(list); 
		 
		 	Integer integerAverage = new Integer(average); 
			
             int index = list.lastIndexOf(min); 
             System.out.println("\n������ ���������� ���������� �������� � ������: "+index);
             list.set(index, integerAverage); 
             System.out.println("����� ���� ����: ");
             printList(list); 
	}
		public static void printList(List<Integer> list) {
            for (Integer e : list) {
                System.out.print(e + " ");
            }
		}
}
