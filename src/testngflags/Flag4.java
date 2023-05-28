package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4
{
  @Test
  public void a() {
	  Reporter.log("method a",true);
	  
  }
  @Test
  public void b() {
	  Reporter.log("method b",true);
	  
  }
  @Test
  public void c() {
	  Reporter.log("method c",true);
	  
  
}
  @Test
  public void d() {
	  Reporter.log("method d",true);
	  
  
}
  @Test
  public void e() {
	  Reporter.log("method e",true);
  }
  @Test(priority = 1)
  public void f() {
	  Reporter.log("method f",true);
  }
  @Test
  public void g() {
	  Reporter.log("method g",true);
  }
  @Test
  public void h() {
	  Reporter.log("method h",true);
	  
  }
  
  
  
	  
  
}
