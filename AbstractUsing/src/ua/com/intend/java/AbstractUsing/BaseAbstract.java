package ua.com.intend.java.AbstractUsing;

public abstract class BaseAbstract {

	public abstract void setValue();
	
	public String getValue(){
		String s = "Returned from Abstract";
		return s;
	}
	
	public int getIntValue(){
		int i = 100500;
		return i;
	}
	
	private String getVaString(){
		String s = "Private String";
		return s;
	}
	
	String getProtectedString(){
		String s = "Protected String";
		return s;
	}
}
