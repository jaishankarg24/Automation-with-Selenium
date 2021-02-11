package com.jai.exm;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://echoecho.com/javascript4.htm");
		
		WebElement pop2 = driver.findElement(By.name("B2"));
		Thread.sleep(5000);
		pop2.click();
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(5000);
		
		al.dismiss();
	}

}

/*
Confirm boxes offer the user a choice of clicking OK or Cancel
*/