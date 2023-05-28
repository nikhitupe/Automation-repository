package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  
	 // System.out.println("Hi TestNG!!");
	  
	  Reporter.log("Hii TestNG!!",true);
	  }
  @Test
  
  public void g()
  {
	  
	//System.out.println("hey java!!!");  
	Reporter.log("hey java!!!",true);
  }
}
