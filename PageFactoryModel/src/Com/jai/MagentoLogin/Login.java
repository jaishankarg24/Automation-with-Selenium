package Com.jai.MagentoLogin;

//import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

WebDriver driver;

	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="(//input[@id='pass'])[1]")
	WebElement pass;
	
	@FindBy(xpath="(//button[@id='send2'])[1]")
	WebElement login;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String emaill) {
		email.sendKeys(emaill);
	}
	
	public void enterPassword(String passs) {
		pass.sendKeys(passs);
	}
	
	public void clickOnLoginn() {
		login.click();
	}
}

