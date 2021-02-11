package com.jai.exm;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gett {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.magento.com");
		
		WebElement link = driver.findElement(By.linkText("My Account"));
		//link.click();
		
		System.out.println("The Text is " +link.getText()); 
		//driver.close();
		System.out.println("The Text is " +link.getAttribute("href")); 
		System.out.println("The Text is " +link.getTagName()); 
		driver.close();
	}

}
/*
The Text is My Account
The Text is https://account.magento.com/
The Text is a
*/