package common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class wrapper {
	static String path = "resources//testData1.xlsx";
	static String sheet = "Sheet1";
	public static int countRows() throws IOException{
		FileInputStream fs = new FileInputStream(path);
        
	    //workbook declaration
	    Workbook wb = new XSSFWorkbook(fs);
	        
	    //Sheet declaration
	    Sheet sh = wb.getSheet(sheet);
//	    Row rows = sh.getRow(row);
	    int rows = sh.getLastRowNum();
		return rows;
		
	}
	
	public static String getDataFromExcel(int row, int col) throws IOException{
		FileInputStream fs = new FileInputStream(path);
        
	    //workbook declaration
	    Workbook wb = new XSSFWorkbook(fs);
	        
	    //Sheet declaration
	    Sheet sh = wb.getSheet(sheet);
	    Row rows = sh.getRow(row);
	    Cell cell = rows.getCell(col);
	    //    String val = cell.getStringCellValue();
	    //    System.out.println("Value is " + val);
	        
	    DataFormatter df = new DataFormatter();
	    String formatValue =    df.formatCellValue(cell);
	    System.out.println("Formatted value " + formatValue);
		return formatValue;
	}
	
	public static void writeDataInExcel(int row,int col,String val) throws IOException{
		FileInputStream fs = new FileInputStream(path);
        
	    //workbook declaration
	    Workbook wb = new XSSFWorkbook(fs);
	        
	    //Sheet declaration
	    Sheet sh = wb.getSheet(sheet);
	    Row rows = sh.getRow(row);
	    Cell cell = rows.createCell(col);
	    cell.setCellValue(val);
	    FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();
}
}
