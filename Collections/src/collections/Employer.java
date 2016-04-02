package collections;

import java.util.Comparator;

public class Employer { // служащий
	int tabnom; // табельный номер
	String name; // ФИО
	static NameComparator nameComparator = new NameComparator();
	static TabComparator tabComparator = new TabComparator();
	public static Comparator getNameComparator() {
		return nameComparator;
	}
	public static Comparator getTabComparator() {
		return tabComparator;
	}
	static class NameComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((Employer)o1).name.compareTo(((Employer)o2).name);
		}
		// метод equals() реализовывать не обязательно
	}
	static class TabComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((Employer)o1).tabnom - ((Employer)o2).tabnom;
		}
	}
	//. . .
}
