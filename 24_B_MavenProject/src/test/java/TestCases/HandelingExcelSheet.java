package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class HandelingExcelSheet {
	
	public void loginFunctionality() throws IOException
	{
		FileInputStream cat =new FileInputStream("C:\\Users\\CHAITUKIRAN\\OneDrive\\Desktop\\Exception.xlsx");
	   
		XSSFWorkbook workbook= new XSSFWorkbook(cat);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell=row.getCell(0);
		
		System.out.println(sheet.getRow(0).getCell(0));
		
		
		
		
	}
}
