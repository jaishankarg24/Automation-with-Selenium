package com.abc.Launch;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocaters {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com");
		
		/*1 Tag id
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("9591");
		*/
		
		/* 2. Tag class
		WebElement email = driver.findElement(By.cssSelector("input.inputtext"));
		email.sendKeys("9591");
		*/
		
		/* 3. Tag Attribute
		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
		email.sendKeys("9591");
		*/
		
		/* 4. Tag Class Attribute
		WebElement pass = driver.findElement(By.cssSelector("input.inputtext[name='pass']"));
		pass.sendKeys("9591");
		*/
		
		driver.get("https://www.gmail.com");
		
		/* 5. a. Tag Attribute Substring starts-with ^
		 
		WebElement email = driver.findElement(By.cssSelector("input[id^='iden']"));
		email.sendKeys("jai@gmail.com");
		*/
		
		/*    b. Tag Attribute Substring ends-with $
		WebElement identifier = driver.findElement(By.cssSelector("input[id$='rId']"));
		identifier.sendKeys("jai@gmail.com");
		*/
		
		/*    c. Tag Attribute Substring contains * 
		WebElement identifier = driver.findElement(By.cssSelector("input[id*='ifi']"));
		identifier.sendKeys("jai@gmail.com");
		*/
	}

}
