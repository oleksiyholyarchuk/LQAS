package automationFramework;

import org.testng.annotations.Test;
 
public class Dependent {
 
  @Test (dependsOnMethods = { "OpenBrowser" })
 
  public void SignIn() {
 
  System.out.println("This will be executed second (SignIn)");
 
  }
 
  @Test
 
  public void OpenBrowser() {
 
  System.out.println("This will be executed first (Open Browser)");
 
  }
 
  @Test (dependsOnMethods = { "SignIn" })
 
  public void LogOut() {
 
  System.out.println("This will be executed third (Log Out)");
 
  }

}