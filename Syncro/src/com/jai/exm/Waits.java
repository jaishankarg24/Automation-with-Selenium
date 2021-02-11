package com.jai.exm;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.magento.com");
		WebElement link = driver.findElement(By.linkText("My Account"));
		link.click();
		
		//Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("jaishankarg24@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("jsg240697@");
		
		WebElement btn = driver.findElement(By.id("send2"));
		btn.click();
		
		//Thread.sleep(5000);
		/*
		WebElement linkk = driver.findElement(By.linkText("Log Out"));
		linkk.click();
		*/
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out")));
		logout.click();
		

	}

}
