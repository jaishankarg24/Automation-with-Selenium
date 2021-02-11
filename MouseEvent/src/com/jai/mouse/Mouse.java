package com.jai.mouse;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		
		WebElement acct = driver.findElement(By.xpath("(//span[text()='Account & Lists'])[1]"));
		WebElement myAcc = driver.findElement(By.xpath("//span[text()='Your Account']"));
		
		Actions action = new Actions(driver);
	
		action.moveToElement(acct).build().perform(); 
		Thread.sleep(5000);
		
		action.moveToElement(myAcc).click().build().perform();
		
		// OR
		
		//action.moveToElement(acct).pause(5000).moveToElement(myAcc).click().build().perform();
		
		WebElement signn = driver.findElement(By.xpath("(//span[text()='Sign in'])[4]"));
		
		action.moveToElement(signn).click().build().perform();
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("ap_email"));
		
		action.moveToElement(email).sendKeys("jaishankarg24@gmail.com").build().perform();
		
		
		
		
		

	}

}
