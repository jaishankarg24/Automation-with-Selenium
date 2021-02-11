package Com.jai.MagentoTest;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;

import Com.jai.MagentoLogin.Login;
import Com.jai.MagentoLogin.Main;
import Com.jai.MagentoLogin.Welcome;

public class MagentoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.magento.com");
		
		Welcome welcome = new Welcome(driver);
		welcome.clickonMyAccount();
		
		Login login = new Login(driver);
		login.enterEmail("jaishankarg24@gmail.com");
		login.enterPassword("jsg240697@");
		//login.enterPassword("neenu@123");
		login.clickonLogin();
		
		Main main = new Main(driver);
		main.clickonLogOut();
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
