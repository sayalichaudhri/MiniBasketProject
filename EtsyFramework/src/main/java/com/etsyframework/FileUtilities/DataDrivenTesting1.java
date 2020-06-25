package com.etsyframework.FileUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataDrivenTesting1 {

	@DataProvider(name = "LoginData")
	public static Object[][] readExcelFile() throws IOException {
		Object[][] obj = null;

		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\EtsyFramework\\src\\main\\resources\\etsyframework.xlsx");
			Workbook book = new XSSFWorkbook(file);

			XSSFSheet sheet = (XSSFSheet) book.getSheet("Sheet1");
			int rows = sheet.getLastRowNum();
			int cols = sheet.getRow(0).getLastCellNum();
			obj = new Object[rows][cols];
			DataFormatter formatter = new DataFormatter();
			for (int i = 1; i <= rows; i++) {

				XSSFRow row = sheet.getRow(i);
				int columns = row.getLastCellNum();
				for (int j = 0; j < columns; j++) {
					XSSFCell cell = row.getCell(j);
					// System.out.println(formatter .formatCellValue(cell));
					obj[i - 1][j] = formatter.formatCellValue(cell);
				}

			}
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;

		
	}
}
