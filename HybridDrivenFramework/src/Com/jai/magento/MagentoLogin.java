package Com.jai.magento;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.magento.com");
		
		FileInputStream fis = new FileInputStream("E:\\Automation\\HybridDrivenFramework\\src\\Com\\jai\\utilities\\HybridDriven.properties");
		Properties property = new Properties();
		property.load(fis);

		String myaccountLocater = property.getProperty("myAccount");
		String emailLocater = property.getProperty("email");
		String passwordLocater = property.getProperty("password");
		String loginLocater = property.getProperty("login");
		String logoutLocater = property.getProperty("logout");
		
		String urlData = property.getProperty("url");
		String emailData = property.getProperty("emaill");
		String passwordData = property.getProperty("passwordd");
		
		driver.get(urlData);
		driver.findElement(By.xpath(myaccountLocater)).click();
		driver.findElement(By.xpath(emailLocater)).sendKeys(emailData);
		driver.findElement(By.xpath(passwordLocater)).sendKeys(passwordData);
		driver.findElement(By.xpath(loginLocater)).click();
		driver.findElement(By.xpath(logoutLocater)).click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
