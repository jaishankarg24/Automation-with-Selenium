package com.jai.mouse;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		
		Actions action = new Actions(driver);
	
		action.moveToElement(search).click().pause(5000).keyDown(Keys.SHIFT).sendKeys("jaishankar").sendKeys(Keys.ENTER).build().perform();
		
		
		
		//Thread.sleep(5000);
		
		//action.moveToElement(myAcc).click().build().perform();

	}

}
