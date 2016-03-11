package ua.com.intend.java.OOPLesson;

public class Poroshenko extends President {
		
	public Poroshenko(String name, String party, int age, int wealth,
			boolean isPresident) {
		super(name, party, age, wealth, isPresident);
	}
	
	private String presidentSon, presidentWife;
	private int presidentNumberOfChildren, presidentNumberOfLovers;
	
	
	public int increasePresidentWealth(int presidentWealth)
	{
		return presidentWealth+=200;
	}
	
	public String changeWife(String presidentWife)
	{
		return "Lusia";
	}
	
	public int changeNumberOfLovers(int numberOfLovers)
	{
		return numberOfLovers++;
	}
	
	public void killPresident()
	{
		System.out.println("President being killed!");
	}
	
	
	public String getPresidentSon() {
		return presidentSon;
	}
	public void setPresidentSon(String presidentSon) {
		this.presidentSon = presidentSon;
	}
	public String getPresidentWife() {
		return presidentWife;
	}
	public void setPresidentWife(String presidentWife) {
		this.presidentWife = presidentWife;
	}
	public int getPresidentNumberOfChildren() {
		return presidentNumberOfChildren;
	}
	public void setPresidentNumberOfChildren(int presidentNumberOfChildren) {
		this.presidentNumberOfChildren = presidentNumberOfChildren;
	}
	public int getPresidentNumberOfLovers() {
		return presidentNumberOfLovers;
	}
	public void setPresidentNumberOfLovers(int presidentNumberOfLovers) {
		this.presidentNumberOfLovers = presidentNumberOfLovers;
	}
	
	
}
