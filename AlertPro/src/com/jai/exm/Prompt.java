package com.jai.exm;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://echoecho.com/javascript4.htm");
		
		WebElement pop3 = driver.findElement(By.name("B3"));
		Thread.sleep(5000);
		pop3.click();
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(5000);
		
		al.sendKeys("Hello Good Evening");
		System.out.println(al.getText());
		Thread.sleep(5000);
		al.accept();

	}

}

/*
 * Prompt boxes allow the user to enter text or a value!
Prompt boxes allow the user to enter text or a value!
*/
