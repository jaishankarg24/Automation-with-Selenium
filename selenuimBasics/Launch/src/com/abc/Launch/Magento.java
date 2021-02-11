package com.abc.Launch;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magento {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.magento.com");
		
		WebElement link = driver.findElement(By.linkText("My Account"));
		link.click();
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("jaishankarg24@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("jsg240697@");
	
		
		WebElement login = driver.findElement(By.id("send2"));
		login.click();
		
		Thread.sleep(5000);
		WebElement logout = driver.findElement(By.linkText("Log Out"));
		logout.click();
		Thread.sleep(5000);
		
		driver.close();
	}

}
