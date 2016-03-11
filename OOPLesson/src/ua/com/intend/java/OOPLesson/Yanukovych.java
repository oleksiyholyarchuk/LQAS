package ua.com.intend.java.OOPLesson;

public class Yanukovych extends President{

	public Yanukovych(String name, String party, int age, int wealth,
			boolean isPresident) {
		super(name, party, age, wealth, isPresident);
	}
	private String presidentMedia, presidentCar;
	private int presidentRating;
	private boolean presidentHealth;
	
	
	public boolean isPresidentHealthy()
	{
		return false;
	}
	
	public int lowerPresidentRating(int presidentRating)
	{
		return presidentRating--;
	}
	
	public String getPresidentMedia() {
		return presidentMedia;
	}
	public void setPresidentMedia(String presidentMedia) {
		this.presidentMedia = presidentMedia;
	}
	public String getPresidentCar() {
		return presidentCar;
	}
	public void setPresidentCar(String presidentCar) {
		this.presidentCar = presidentCar;
	}
	public int getPresidentRating() {
		return presidentRating;
	}
	public void setPresidentRating(int presidentRating) {
		this.presidentRating = presidentRating;
	}
	public boolean isPresidentHealth() {
		return presidentHealth;
	}
	public void setPresidentHealth(boolean presidentHealth) {
		this.presidentHealth = presidentHealth;
	}
	
	
	
	
}
