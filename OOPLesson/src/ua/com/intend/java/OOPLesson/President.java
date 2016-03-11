/*Create class with 4 (or more) class members. Generate all getters and setters. 
Write 3 (or more) own class methods with different return types. 
Create two extended classes with the same options as parent class.
Try to use different packages and access specifies. Create static method and try to use it in main block. 
Create the container of your class objects and try to manipulate with it. 
Try to use final method in parent class and overwrite it in one of the child classes. (this is not permitted)
Try to make the parent class as abstract and create the object of that class in main block. (this is not permitted)
Create a simple interface with 1 (or more) methods and implement it by the parent class. 
Also try to use different (same) packages.*/

package ua.com.intend.java.OOPLesson;

public class President implements Stealable {

	protected String presidentName, presidentParty;
	protected int presidentAge, presidentWealth;
	protected boolean actualPresident;
	
	public String sellPresidentMedia(String presidentMedia)
	{
		return presidentMedia = null;
	}
	
	
	public President(String name, String party, int age, int wealth, boolean isPresident) {
		presidentName = name;
		presidentParty = party;
		presidentAge = age;
		presidentWealth = wealth;
		actualPresident = isPresident;
	}
	
	President p1 = new President("Petro", "BPP",50, 100, true);
	President p2 = new President("Victor", "PR", 60, 200, false);
	
	
	public void callPresidentOligarkh(String presidentName)
	{
		this.presidentName = "Oligarkh";
		p1.actualPresident = false;
		p1.increasePresidentWealth(presidentWealth);
		p2.callPresidentOligarkh(presidentName);
	}
	
	public int increasePresidentWealth(int presidentWealth)
	{
		return presidentWealth+=100;
	}
	
	public boolean isActualPresident(boolean actualPresident)
	{
		 if (actualPresident) {
	         return true;
	      } else
	    	  return false;
	}

	public String getPresidentName() {
		return presidentName;
	}



	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}



	public String getPresidentParty() {
		return presidentParty;
	}



	public void setPresidentParty(String presidentParty) {
		this.presidentParty = presidentParty;
	}



	public int getPresidentAge() {
		return presidentAge;
	}



	public void setPresidentAge(int presidentAge) {
		this.presidentAge = presidentAge;
	}



	public int getPresidentWealth() {
		return presidentWealth;
	}



	public void setPresidentWealth(int presidentWealth) {
		this.presidentWealth = presidentWealth;
	}



	public boolean isActualPresident() {
		return actualPresident;
	}



	public void setActualPresident(boolean actualPresident) {
		this.actualPresident = actualPresident;
	}



	public static void main(String[] args) {
		President p3 = new President("Mykhajlo", "null", 45, 10, false);
		p3.getPresidentAge();
		p3.isActualPresident(false);
		p3.setPresidentParty("Anticorruption movement");
		p3.presidentAge = 40;
	}


	@Override
	public void steal() {
		presidentWealth +=1000;
	}


	@Override
	public void lie() {
		System.out.println("I won't be tellin' you any truth!");
	}


	@Override
	public void control() {
		System.out.println("You're under control!");
		
	}

}
