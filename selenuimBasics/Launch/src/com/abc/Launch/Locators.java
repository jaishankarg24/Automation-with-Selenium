package com.abc.Launch;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","E:\\seleniumComponents\\chromedriver.exe");
		
		 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	
		driver.findElement(By.id("email"));
		/*1
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("9591870456");
		
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1234");
		*/
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("1234");
		
		WebElement pass = driver.findElement(By.className("inputtext"));
		pass.sendKeys("1234");
		//*/
		

	}

}
