package com.jai.table;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///E:/Automation/table.html");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='tab']/tbody/tr"));
		int rsize = rows.size();
		System.out.println("the size of the rows is:" +rsize);
		
		List<WebElement> colums = driver.findElements(By.xpath("//table[@id='tab']/tbody/tr[1]/td"));
		int csize = colums.size();
		System.out.println("the size of the columns is:" +csize);
		
		WebElement firstdata = driver.findElement(By.xpath("//table[@id='tab']/tbody/tr[1]/td[1]"));
		String ftext = firstdata.getText();
		System.out.println(ftext);
		
		WebElement seconddata = driver.findElement(By.xpath("//table[@id='tab']/tbody/tr[2]/td[1]"));
		String stext = seconddata.getText();
		System.out.println(stext);
		
		WebElement thirddata = driver.findElement(By.xpath("//table[@id='tab']/tbody/tr[3]/td[1]"));
		String ttext = thirddata.getText();
		System.out.println(ttext);
		
		// or
		
		/*
		  	for (int i=0; i<= rsize; i++)
		  	{
		  		WebElement count = driver.findElement(By.xpath("//table[@id='tab']/tbody/tr["+i+"]/td[1]"));
				String text = count.getText();
				System.out.println(text);
			}
		 */
		
	}

}

/*
the size of the rows is:3
the size of the columns is:2
Manual Testing
Automation Testing
java
*/