package com.jai.exm;

import java.util.ArrayList;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {

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
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		Thread.sleep(5000);
		
		for (String s : allId) {
			driver.switchTo().window(s);
			
		}
		//*/
		/*
		ArrayList<String> all = new ArrayList<String>(allId);
		driver.switchTo().window(all.get(1));
		
		WebElement link2 = driver.findElement(By.linkText("open page3"));
		Thread.sleep(5000);
		
		link2.click();
		Thread.sleep(5000);
		*/
		
		
		
	}

}
/*
[CDwindow-EC1400DA34F6829D9B6A64E9DE80EB55, CDwindow-37BECE3485B7F6755EE84A10A7C403BC]
*/