package com.demo.example;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.ie.driver","F:\\selenium Components\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("12344");

	}

}
