import java.util.Comparator;

import cd.CD;

public class CDComparator implements Comparator<CD> {
	public int compare(CD cd1, CD cd2) {
		return cd1.getArtistName().compareTo(cd2.getArtistName());
	}
}