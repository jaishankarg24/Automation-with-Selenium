package Com.jai.MagentoLogin;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	
	By email = By.xpath("//input[@id='email']");
	By password = By.xpath("(//input[@id='pass'])[1]");
	By login = By.xpath("(//button[@id='send2'])[1]");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterEmail(String em) {
		driver.findElement(email).sendKeys(em);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickonLogin() {
		driver.findElement(login).click();
	}
}
