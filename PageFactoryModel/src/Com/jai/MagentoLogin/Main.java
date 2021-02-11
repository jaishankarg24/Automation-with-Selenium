package Com.jai.MagentoLogin;

//import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main {
WebDriver driver;
	@FindBy(xpath="(//a[text()='Log Out'])[1]")
	WebElement logout;

	
	public Main(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public void clickOnLogOut() {
		logout.click();
	}


}
