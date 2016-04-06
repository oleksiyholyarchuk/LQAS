package ua.com.intend.MyMavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest2 {
   
	@Test
	public void firstTest(){
		int a = 2;
		int b = 4;
		Assert.assertTrue(a + b == 6);
	}
	
}
