/*Задано текстовий файл з інформацією про музичний альбом. Кожний запис містить прізвище виконавця, 
назву пісні та її тривалість. Створити відповідний клас, для зберігання інформації використати одну з колекцій; 
відсортувати дані за назвою виконавця. Відсортовані записи вивести на екран. Передбачити обробку виключних ситуацій.*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import cd.CD;

public class App {
	private static final String FILE_PATH = "cd.txt";
	private static final String SEPARATOR = "-";

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<CD> listCD = new ArrayList<CD>();
		try {
			ArrayList<String> lines = FileReader
					.readFileToArrayList(FILE_PATH);
			for (String line : lines) {
				String[] info = line.split(SEPARATOR);
				String artistName = info[0].trim();
				String songName = info[1].trim();
				Double time = Double.valueOf(info[2].trim());
				CD cd = new CD(artistName, songName, time);
				listCD.add(cd);
			}

		} catch (IOException e1) {
			e1.printStackTrace();
			return;
		}

		System.out.println("CD before sorting:");
		printCD(listCD);
		
		Collections.sort(listCD, new CDComparator());
		
		System.out.println("CD after sorting by artistName:");
		printCD(listCD);
	}

	private static void printCD(ArrayList<CD> listCD) {
		for (CD cd : listCD) {
			System.out.println("  " + cd.toString());
		}
	}
}
