package com.jai.ecx;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.magento.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		
		/*for (int i = 0; i < size; i++) {
			String text = links.get(i).getText();
			System.out.println(text);
		}*/
		
		for ( WebElement y : links)
		{
			String text = y.getText();
			System.out.println(text);
			if (text.equals("My Account")==true)
			{
				y.click();
				break;
			}
		}
		
		driver.close();
	}

}
