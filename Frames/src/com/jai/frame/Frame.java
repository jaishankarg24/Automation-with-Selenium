package com.jai.frame;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///E:/Automation/iFramePage2.html");
		
		WebElement mn = driver.findElement(By.id("mname"));
		mn.sendKeys("shelby");
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		WebElement fn = driver.findElement(By.xpath("//input[@id='frame']"));
		fn.sendKeys("thomas");
		
	}

}
