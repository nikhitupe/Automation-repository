package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedge.driver","./driver.msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		Thread.sleep(2000);
		driver.close();
	}

}
