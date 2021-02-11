package com.abc.Launch;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class myCode {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","E:\\seleniumComponents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();

	}

}
/*
https://www.selenium.dev/
SeleniumHQ Browser Automation
*/