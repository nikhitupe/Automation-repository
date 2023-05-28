package readexceldata;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// read Data from excel sheet ipl
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the path of excel file
		Workbook wb = WorkbookFactory.create(fis);// make the file ready for read.
		Sheet sheet = wb.getSheet("IPL");// get into the sheet
		for	(int i=0; i<=7; i++)
		{
			Row row = sheet.getRow(i);
			System.out.println();
			
			
			for(int j=0;j<=1;j++)
			{
				Cell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.print(data);
			}
			
		}

		//	Row row = sheet.getRow(2);// get into desired row..
		//Cell cell = row.getCell(1);// get into desired Col/cell
	//	String data = cell.getStringCellValue();// read the value from cell 
	//	System.out.println(data);
		
		
		
	}

}
