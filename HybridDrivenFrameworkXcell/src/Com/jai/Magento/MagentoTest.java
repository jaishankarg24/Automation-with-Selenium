package Com.jai.Magento;

import java.io.FileInputStream;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoTest {
	public static FileInputStream fis;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static int NumberOfRows;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String data;
	public static String actions;
	public static ChromeDriver driver;
	
	public static String getCellValues(int rowvalue, int cellvalue) {
		row = sheet.getRow(rowvalue);
		cell = row.getCell(cellvalue);
		data = cell.getStringCellValue();
		return data;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	fis = new FileInputStream("E:\\Automation\\HybridDrivenFrameworkXcell\\src\\Com\\abc\\Utilities\\Hybrid.xlsx");
	book = new XSSFWorkbook(fis);
	sheet = book.getSheetAt(0);
	NumberOfRows = sheet.getPhysicalNumberOfRows();
	
	System.out.println("the number of rows are" +NumberOfRows);
	
	for(int i=1; i < NumberOfRows; i++ ) {
		actions = getCellValues(i,2);
		System.out.println(actions);
		
		switch (actions) {
		case "open":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;
		case "navigate":
			driver.get(getCellValues(i, 4));
			break;
		case "click":
			driver.findElement(By.xpath(getCellValues(i, 3))).click();
			break;
		case "type":
			driver.findElement(By.xpath(getCellValues(i, 3))).sendKeys(getCellValues(i, 4));
			break;
		case "quit":
			driver.quit();
			break;
		}
	}
	
	
	
	}

}

/*

the number of rows are 9
open
Starting ChromeDriver 88.0.4324.27 (6347fe8bf1e48bd0c54d07dc55ca011cf40861c9-refs/branch-heads/4324@{#450}) on port 28100
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully.
Jan 21, 2021 12:50:10 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
navigate
click
type
type
click
click
quit
*/