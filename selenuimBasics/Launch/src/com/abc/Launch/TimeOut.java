package com.abc.Launch;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
								//Max Time it will wait in-order to get into the url.
		driver.get("https://www.magento.com");
		
		WebElement link = driver.findElement(By.linkText("My Account"));
		link.click();
		
		
		

	}

}
