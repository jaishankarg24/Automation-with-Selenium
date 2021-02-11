package com.jai.exm;

import org.openqa.selenium.Dimension;



import org.openqa.selenium.firefox.FirefoxDriver;

public class FireOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		Dimension dim = driver.manage().window().getSize();
		System.out.println("The Height of the browser is" +dim.height);
		System.out.println("The width of the browser is" +dim.width);
		
		Dimension newdim = new Dimension(dim.width/2, dim.height/2);
		System.out.println("the height" +newdim.height);
		System.out.println("the Width" +newdim.width);
		
		driver.manage().window().setSize(newdim);

	}

}

/*
The Height of the browser is779
The width of the browser is1294
the height389
the Width647
*/