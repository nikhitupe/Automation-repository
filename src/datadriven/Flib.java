package datadriven;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
// it is used to store generic reusable methods..
	// all the methods are non static
public String readExcelData(String excelpath,String sheetName, int rowCount,int cellCount) throws EncryptedDocumentException, IOException

{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
}


public void WriteExcelData(String excelpath, String sheetName,int rowCount,int cellCount, Date data,String excel) throws EncryptedDocumentException, IOException
{
	
	FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	Row row = sheet.getRow(rowCount);
	
	
	 Cell cell = row.createCell(cellCount);
	 cell.setCellValue(data);

	FileOutputStream fos = new FileOutputStream(excelpath);
	wb.write(fos);
	
}
public int rowcount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
{
	
	FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	 
	Sheet sheet = wb.getSheet(sheetName);
	int rc = sheet.getLastRowNum();
	return rc;
}






}











