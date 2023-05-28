package qsp0;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TO Launch EDGEBROWSER
		System.setProperty("Webdriver.edge.driver","./drivers/edge.exe");
		EdgeDriver driver = new EdgeDriver();
		Thread.sleep(200);
		driver.close();
	
	}
	}

	
