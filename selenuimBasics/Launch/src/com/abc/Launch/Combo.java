package com.abc.Launch;

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
		
		//selecting id of drop-down.
		WebElement drop = driver.findElement(By.id("company_type"));
		drop.click();
		
		//Creating object of Select class and passing drop reference
		Select select = new Select(drop);
		
		//1.
		select.selectByIndex(1);
		Thread.sleep(5000);
		
		//2.
		select.selectByValue("deployment");
		Thread.sleep(5000);
		
		//3.
		select.selectByVisibleText("Analyst/Media");
		

	}

}
