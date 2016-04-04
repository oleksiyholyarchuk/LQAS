package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestExample {
@BeforeTest
@Parameters({"usrName", "pwd"})
public void setUp(String usrName, String pwd) {
  // code that will be executed before tests
}
@Test
public void test1() {
     // test1 steps
     System.out.println("test1 passed");
}
@Test
public void test2() {
     // test2 steps
     System.out.println("test2 passed");
}
}