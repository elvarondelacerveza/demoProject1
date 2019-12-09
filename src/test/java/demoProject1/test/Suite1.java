package demoProject1.test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Suite1 {

	public static WebDriver driver;
	
	@BeforeTest
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
	}
	@Test
	public void testCase1() {
		driver.get("https://www.google.com.mx/");
		System.out.println(driver.getTitle());
	}
	@Test
	public void testCase2() {
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}
	@Test
	public void testCase3() {
		driver.get("https://chromedriver.chromium.org/downloads");
		System.out.println(driver.getTitle());
	}
	@AfterTest
	public void quit() {
		driver.quit();
	}
}
