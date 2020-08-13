/***
 * there is some jar files issue in this code 
 * so it's not working here but this is how we can read data from the excel file
 * please run this code in maven project 
 */

package selenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcelSheet {

	public static void main(String[] args) throws Exception {

		String TestDate_SHEET = "D:\\Programming (Imp)\\JAVA\\Code\\Files\\Facebook.xlsx";

		// linking file to code
		FileInputStream file = new FileInputStream(TestDate_SHEET);

		// creating or loading excel file
		Workbook book = WorkbookFactory.create(file);
		
		// using particular sheet
		Sheet sheet = book.getSheet("login");
		
		// creating two dimensional object array for reading row and cell
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 1; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i).getCell(j).toString();
			}
		}

		for (Object[] x1 : data) {
			for (Object x2 : x1) {
				System.out.print(x2 + " ");
			}
			System.out.println();
		}

	}
}
