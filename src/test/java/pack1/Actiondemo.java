package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actiondemo {
	
	WebDriver driver;

	@Test

	public void Actiontime() throws InterruptedException

	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://omayo.blogspot.com/");
		driver.get("https://omayo.blogspot.com/");
		Actions action1 = new Actions(driver);
		WebElement Compendiumlink= driver.findElement(By.linkText("compendiumdev"));
	action1.keyDown(Keys.CONTROL).click(Compendiumlink).build().perform();
	Thread.sleep(2000);
		

	}
}