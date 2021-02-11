package Com.jai.MagentoLogin;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Main {
WebDriver driver;
	
	By logout = By.xpath("(//a[text()='Log Out'])[1]");
	
	public Main(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickonLogOut() {
		driver.findElement(logout).click();
	}

}
