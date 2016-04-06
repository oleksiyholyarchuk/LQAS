package ua.com.intend.MyMavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest4 {
   
	@Test
	public void thirdtTest(){
		int a = 2;
		int b = 4;
		System.out.println("test 3");
		Assert.assertTrue(b / a == 2);
	}
	
	@Test
	public void forthTest(){
		int a = 2;
		int b = 4;
		System.out.println("test 4");
		Assert.assertTrue(b * a == 8);
	}
	
}
