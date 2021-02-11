package Com.jai.magento;

import java.io.FileInputStream;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoLogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		FileInputStream fis = new FileInputStream("E:\\Automation\\DataDrivenFramework\\src\\Com\\jai\\utilities\\DataDriven.properties");
		Properties property = new Properties();
		property.load(fis);
		
		String urlData = property.getProperty("url");
		String emailData = property.getProperty("email");
		String passwordData = property.getProperty("password");
		
		System.out.println(urlData);
		System.out.println(emailData);
		System.out.println(passwordData);
		
		driver.get(urlData);
		
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailData);
		driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys(passwordData);
		driver.findElement(By.xpath("(//button[@id='send2'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		
		driver.quit();
		
		
		
	}

}

/*
https://www.magento.com
jaishankarg24@gmail.com
jsg240697@
*/