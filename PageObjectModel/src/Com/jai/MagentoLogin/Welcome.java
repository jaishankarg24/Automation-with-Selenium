package Com.jai.MagentoLogin;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;

public class Welcome {
	
	WebDriver driver;
	
	By myAccount = By.xpath("//a[text()='My Account']");
	
	public Welcome(WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickonMyAccount() {
		
		driver.findElement(myAccount).click();
	}
}
