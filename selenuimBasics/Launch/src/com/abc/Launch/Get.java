package com.abc.Launch;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Get {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver","F:\\selenium Components\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		*/
		
		/*
		System.setProperty("webdriver.gecko.driver","F:\\selenium Components\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		*/
		
		System.setProperty("webdriver.ie.driver","F:\\selenium Components\\IEDriverServer.exe");
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}

}
