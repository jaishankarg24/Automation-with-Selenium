package com.demo.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Combo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://account.magento.com/customer/account/create/");
		
		WebElement drop = driver.findElement(By.id("company_type"));
		drop.click();
		
		Select select = new Select(drop);
		select.selectByIndex(1);
		Thread.sleep(5000);
		
		select.selectByValue("deployment");
		Thread.sleep(5000);
		
		select.selectByVisibleText("Analyst/Media");
	}

}
