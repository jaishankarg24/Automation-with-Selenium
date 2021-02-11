package com.jai.exm;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://echoecho.com/javascript4.htm");
		
		WebElement pop1 = driver.findElement(By.name("B1"));
		Thread.sleep(5000);
		pop1.click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(5000);
		a.accept();
		
		Thread.sleep(5000);
		driver.close();

	}

}

/*
This is an alert box!
*/