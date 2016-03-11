package cd;
public class CD {

	String artistName;
	String songName;
	Double time;

	public CD(String artistName, String songName, Double time) {
		super();
		this.artistName = artistName;
		this.songName = songName;
		this.time = time;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public Double getTime() {
		return time;
	}

	public void setTime(Double time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "CD [artistName=" + artistName + ", songName=" + songName
				+ ", time=" + time + "]";
	}

	
	
}
