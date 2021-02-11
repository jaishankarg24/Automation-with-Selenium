package com.jai.exm;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com");
		
		WebElement round = driver.findElement(By.id("RoundTrip"));
		
		if(round.isSelected()==true) {
			System.out.println("Round Trip radio button is Selected");
		}
		else {
			round.click();
		}
		
		WebElement rDate = driver.findElement(By.id("ReturnDate"));
		
		if(rDate.isDisplayed()==true) {
			rDate.sendKeys("Wed, 10 Jun, 2020");
		}
		else {
			System.out.println("return Date is not Displayed");
		}
		
		

	}

}
