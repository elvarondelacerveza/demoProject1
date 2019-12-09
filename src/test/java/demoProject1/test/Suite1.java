package demoProject1.test;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Suite1 {

	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() throws MalformedURLException {
		DesiredCapabilities caps = null;
		caps= DesiredCapabilities.chrome();
		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.ANDROID);
		driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"),caps);
		driver.manage().window().maximize();
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
