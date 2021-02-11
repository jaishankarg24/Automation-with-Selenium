package com.demo.example;

import org.openqa.selenium.By;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Automation/xpath.html");
		
		WebElement pwd = driver.findElement(By.xpath("/html/body/input[2]"));
		
		//WebElement pwd = driver.findElement(By.cssSelector("input[type='text']"));
		pwd.sendKeys("1234");
	}

}
