package com.abc.Launch;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magento.com");
		
		//WebElement link = driver.findElement(By.linkText("My Ac"));
		
		WebElement link = driver.findElement(By.partialLinkText("My Ac"));
		
		link.click();
		

	}

}
