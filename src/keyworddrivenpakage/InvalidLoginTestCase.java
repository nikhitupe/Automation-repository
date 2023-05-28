package keyworddrivenpakage;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH,"InvalidCrediantial");
		for(int i=1;i<rc;i++) 
		{
			String invalidusername = flib.readExcelData(EXCEL_PATH,"InvalidCrediantial", i, 0);
			String invalidpassword = flib.readExcelData(EXCEL_PATH,"InvalidCrediantial", i, 1);
			
			driver.findElement(By.name("username")).sendKeys(invalidusername);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(invalidpassword);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
				
		}
		bt.closeBrowser();
	}

}
