package ua.com.intend.java.OOPLessonDifferentPackage;

import ua.com.intend.java.OOPLesson.President;

public class Saakashvili extends President {

	
	public Saakashvili(String name, String party, int age, int wealth,
			boolean isPresident) {
		super(name, party, age, wealth, isPresident);
	}

	public String sellPresidentMedia(String presidentMedia)
	{
		return presidentMedia = null;
	}
	
	public boolean isPresidentHealthy()
	{
		return true;
	}
	
	public int risePresidentRating(int presidentRating)
	{
		return presidentRating++;
	}
	
	
	President p4 = new President("Kasko", "null", 45, 10, false);

}
