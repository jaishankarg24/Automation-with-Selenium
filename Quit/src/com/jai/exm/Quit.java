package com.jai.exm;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///E:/Automation/page1.html");
		
		WebElement link = driver.findElement(By.linkText("Click Here To Open"));
		Thread.sleep(5000);
		link.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
