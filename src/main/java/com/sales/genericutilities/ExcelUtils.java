package com.sales.genericutilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	/**
	 * This method is used to read the data from the Excel file
	 * @Chaitra
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
public String readDataFromExcelFile(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
	Workbook book = WorkbookFactory.create(fis);
	String value = book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return value;
}
/**
 * This Method is used to get the count of the row
 * @Chaitra
 * @param sheet
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public Object getLastRowNo(String sheet) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
	Workbook book = WorkbookFactory.create(fis);
	int row_count = book.getSheet(sheet).getLastRowNum();
	return row_count;
}
/**
 * This method is used to write the data into excel file
 * @param sheet
 * @param row
 * @param cell
 * @param value
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void WriteDataIntoExcel(String sheet, int row, int cell, String value) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
	Workbook book = WorkbookFactory.create(fis);
	book.getSheet(sheet).getRow(row).createCell(cell).setCellValue(value);
	FileOutputStream fout=new FileOutputStream(IpathConstants.ExcelPath);
	book.write(fout);
	book.close();
}
/**
 * This method is used to read the multiple data from the excel file
 * @param sheet
 * @param cel
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public HashMap<String, String> readMultipleData(String sheet,int cel) throws EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet(sheet);
	int row_count = sh.getLastRowNum();
	HashMap<String, String> map=new HashMap<String, String>();
	
	for(int i=0;i<=row_count;i++)
	{
		String key = sh.getRow(i).getCell(cel).getStringCellValue();
		String value = sh.getRow(i).getCell(cel+1).getStringCellValue();
		map.put(key, value);
	}
	return map;
}
public Object[][] dataProvider(String sheet) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet(sheet);
	int lastRow = sh.getLastRowNum()+1;
	int lastCell = sh.getRow(0).getLastCellNum();
	Object[][] obj=new Object[lastRow][lastCell];
	for (int i = 0; i < lastRow; i++) {
		for (int j = 0; j < lastCell; j++) {
		obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
		}
	}
	return obj;
}
}

