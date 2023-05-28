package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5Dependent {
  @Test(description = "Login TestCase")
  public void Loginmethod() {
	  Reporter.log("Login Performed");
  }
  @Test(description ="create user TestCase")
  public void Creatusermethodmethod() {
	  Reporter.log(" create user Performed");
  }
  
}
