package com.nt.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.nt.base.UIBase;

public class CommonUtils extends UIBase {

	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICITLY_WAIT = 10;

	public static Workbook book;
	public static Sheet sheet;
	public static DataFormatter formatter;
	public static String TestData_File = System.getProperty("user.dir") + "/resources/NewTourTestData.xlsx";
	public static String folderPath = System.getProperty("user.dir") + "/screenshots";

	public static Object[][] getTestData(String sheetName) {

		formatter = new DataFormatter();
 
		FileInputStream file = null;
		try {
			file = new FileInputStream(TestData_File);
		} catch (FileNotFoundException e) {
			e.getLocalizedMessage();
		}

		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		sheet = book.getSheet(sheetName);
		// we are storing data in two dimensional object array
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// iterating through excel sheet
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				String str = formatter.formatCellValue(sheet.getRow(i + 1).getCell(j));
				// data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
				data[i][j] = str;
			}
		}
		return data;
	}

	public static void cleanFolder() {

		File dir = new File(folderPath);
		if (dir.isDirectory() == false) {
			System.out.println("Not a directory. Do nothing.");
		} else {
			File[] files = dir.listFiles();
			for (File file : files) {
				System.out.println("Deleting old file: " + file.getName());
				file.delete();
			}
			System.out.println("Screenshots folder cleaned.");
		}

	}
}
