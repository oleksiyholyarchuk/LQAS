/*������ ��������� ���� � ����������� ��� �������� ������. ������ ����� ������ ������� ���������, 
����� ��� �� �� ���������. �������� ��������� ����, ��� ��������� ���������� ����������� ���� � ��������; 
����������� ��� �� ������ ���������. ³��������� ������ ������� �� �����. ����������� ������� ��������� ��������.*/

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
