package com.abc.Launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Gaccount {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver","F:\\selenium Components\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		String url = "https://www.gmail.com";
		driver.get(url);
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
