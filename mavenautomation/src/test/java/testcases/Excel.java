package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public String getCellDate() throws IOException{
		String filepath = "C:\\Users\\CHINNU\\eclipse-workspace\\mavenautomation\\src\\main\\java\\Testcases\\Instrument.xlsx";
		
	FileInputStream fs = new FileInputStream(new File(filepath));
	
	XSSFWorkbook wb = new XSSFWorkbook(fs);
	XSSFSheet sh = wb.getSheet("Sheet1");
	XSSFRow rw = sh.getRow(1);
	return rw.getCell(0).getStringCellValue();
	
	
		

	}

}
