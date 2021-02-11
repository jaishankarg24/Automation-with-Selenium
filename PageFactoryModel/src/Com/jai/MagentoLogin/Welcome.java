package Com.jai.MagentoLogin;

//import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {
WebDriver driver;
	
	@FindBy(xpath="//a[text()='My Account']")
	WebElement myAccount;
	
	
	public Welcome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonMyAcct() {
		
		myAccount.click();
	}
}
