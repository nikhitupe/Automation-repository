package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetLastRow {


			// read the data from IpL sheet
			public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
				
				//Read multiple data using for loop
				
				// generalize the row count
				 FileInputStream fis2 = new FileInputStream("./data/TestData.xlsx");
				 WorkbookFactory.create(fis2);
				
				for(int i=1;i<=9;i++)
				{
				FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the path of excel file
				Workbook wb = WorkbookFactory.create(fis);//make the file ready for read
				Sheet sheet = wb.getSheet("IPL");// get into sheet
				Row row = sheet.getRow(i); // get into desired row
				Cell cell = row.getCell(0); // get the desire cell/col
				String data = cell.getStringCellValue();// get the value from cell/col
				Thread.sleep(2000);
				System.out.println(data);
				}

	}

}
