package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGExample {
	
	public int add(int a, int b){
		return a + b;
	}
	
	@Test (groups = "add")
	public void testAdd(){
		int expectedResult = 5;
		Reporter.log("asserting add method: ", true);
		Assert.assertEquals(add(2, 3), expectedResult);		
	}
	
	@Test (groups = "addadd" ) 
	public void testAddAdd(){
		int expectedResult = 10;
		Reporter.log("asserting add method: ", true);
		Assert.assertEquals(add(2, 3) + add(3, 2), expectedResult);		
	}
	

}
