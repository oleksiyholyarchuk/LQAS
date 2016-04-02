package collections;

import java.util.*;
import java.io.*;

public class ArrayListTest {
	ArrayList lst = new ArrayList();
	Random generator = new Random();

	void addRandom() {
		lst.add(new Integer(generator.nextInt()));
	}

	// toString #1
	
	/*public String toString() {
		return lst.toString();
	}*/
	
	// toString #2
	public String toString() {
		String res = "";
		Iterator iter = lst.iterator();
		for(int i = 0; iter.hasNext(); i++) {
		if( i%6 == 0 )
		res += "\n";
		res += " " + iter.next().toString(); // !!!
		}
		return res;
		}

	public static void main(String args[]) {
		ArrayListTest tst = new ArrayListTest();
		for (int i = 0; i < 100; i++)
			tst.addRandom();
		System.out.println("��� ��������� �����: " + tst.toString());
	}
	
}
