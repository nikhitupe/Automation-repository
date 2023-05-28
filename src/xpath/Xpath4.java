package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath4 {//on FlipKart...

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("hp laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//search
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();//Brand
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and text()='HP']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();//windows
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Dedicated Graphics Memory']")).click();//DEDICATED GRAPHICS MEMORY
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='8 GB']")).click();//8GB
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Type']")).click();//Type
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Laptop']")).click();//LapTop
		Thread.sleep(2000);
		
		String priceOfFirsSuggeString = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
		Thread.sleep(2000);
		System.out.println(priceOfFirsSuggeString);
		driver.quit();

	}

}
//(//div[@class='_4rR01T']/anscestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']){1