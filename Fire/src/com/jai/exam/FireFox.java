package com.jai.exam;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		Dimension dim = driver.manage().window().getSize();
		System.out.println("The Height of the browser is:" +dim.height);
		System.out.println("The width of the browser is:" +dim.width);
		
		
	}

}
/*
The Height of the browser is:779
The width of the browser is:1294
*/