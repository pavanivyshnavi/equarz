package com.utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {
	
	//Store all commonly used methods for method reusablity purpose 
	static String filepath="./src/main/java/com/testdata/equartz.xlsx";
	
	
	public static String[][] setdata(String sheetname) throws Throwable{
		File file=new File(filepath);
		FileInputStream stream=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(stream);
		XSSFSheet sheet=workbook.getSheet(sheetname);
		
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		int cols=sheet.getRow(1).getLastCellNum();
		String[][] data=new String[rows-1][cols];
		
		for(int i=0;i<rows-1;i++) {
			for(int j=0;j<cols;j++) {
			DataFormatter df=new DataFormatter();
			data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			System.out.println(data[i][j]);
			}
		}
		
		stream.close();
		workbook.close();
		return data;
	}
	
	public  void dropdown(WebElement value, String text) {
		Select sel = new Select(value);
		sel.selectByValue(text);

	}

	public static void keysRobot() throws Throwable {
		 Robot rb=new Robot();
		 rb.delay(3000);
			StringSelection ss=new StringSelection("C:\\Users\\admin\\Desktop\\vyshu marolix\\Selenium Full Material.pdf");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//copy to clipboard
			
			//ctrl+v action
			rb.keyPress(KeyEvent.VK_CONTROL);//press on ctrl key
			rb.keyPress(KeyEvent.VK_V);//ctrlv action
			rb.delay(3000);
			 
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.delay(3000);
			
			//enter key
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(3000);
			
	}
	

}
