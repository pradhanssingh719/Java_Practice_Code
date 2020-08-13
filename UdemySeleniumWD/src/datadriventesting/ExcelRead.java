package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {

		String path = "D:\\Programming (Imp)\\JAVA\\UdemySeleniumWD\\utilities\\Data.xlsx";
		String sheetName = "Sheet1";

		// these variable are provided by poi apache to work with excel files
		XSSFWorkbook excelWorkBook;
		XSSFSheet excelWorkSheet;
		XSSFCell cell;

		try {
			FileInputStream fileName = new FileInputStream(path);
			
			// now initialize all the variables
			//reading excel file
			excelWorkBook = new XSSFWorkbook(fileName);
			//reading sheet
			excelWorkSheet = excelWorkBook.getSheet(sheetName);
			//reading cell and row data
			cell = excelWorkSheet.getRow(1).getCell(3);
			//printing cell data
			String cellData = cell.getStringCellValue();
			System.out.println(cellData);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

}
