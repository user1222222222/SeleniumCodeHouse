package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import ObjectRepository.Accountpage;
import ObjectRepository.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	WebDriver driver;

	@Test

	public void BrowserStart()

	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		Loginpage login = new Loginpage(driver);
		login.EnterEmailid().sendKeys("singhchandan8555@gmail.com");
		login.EnterPassword().sendKeys("Testing@Test12");
		login.ClickLoginbutton();

		Accountpage page = new Accountpage(driver);

		Assert.assertTrue(page.VerifyBreadCrumbAccount().isDisplayed());

	}

	@AfterMethod

	public void BrowserClosure()

	{
		driver.close();
	}
}
