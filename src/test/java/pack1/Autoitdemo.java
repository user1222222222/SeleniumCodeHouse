package pack1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoitdemo {
	WebDriver driver;

	@Test
	public void download() throws IOException

	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		Actions action1 = new Actions(driver);
		action1.moveToElement(driver.findElement(By.id("uploadfile"))).click().build().perform();

		Runtime runtime = Runtime.getRuntime();

		 Process process=runtime.exec("C:\\Users\\ashut\\Downloads\\upload2.exe");
	}
}
