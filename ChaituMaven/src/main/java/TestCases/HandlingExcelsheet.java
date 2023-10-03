package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;


 
public class HandlingExcelsheet {
	@Test
	public void loginFunctionality() throws IOException
	{FileInputStream fs=new FileInputStream("C:\\Users\\user\\Desktop\\data.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(fs);
	
	//XSSFRow row=sheet.getRow(1);
	//XSSFCell cell=row.getCell(0);
	//System.out.println(sheet.getRow(1).getCell(0));
	}
}
