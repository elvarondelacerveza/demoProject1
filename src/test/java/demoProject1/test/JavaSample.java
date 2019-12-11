package demoProject1.test;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaSample {
	
public static WebDriver driver;
public static final String USERNAME = "marcoparra1";
public static final String AUTOMATE_KEY = "QzVY3pcWqd88cix41JAU";
public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@BeforeMethod
	public void launchDriver() throws MalformedURLException {

	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("browserName", "android");
	    caps.setCapability("device", "Samsung Galaxy S8");
	    caps.setCapability("realMobile", "true");
	    caps.setCapability("os_version", "7.0");
	    caps.setCapability("name", "Bstack-[Java] Sample Test");
	    
		driver = new RemoteWebDriver(new URL(URL),caps);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void testCase1() {
		driver.get("http://www.gmail.com/");
		System.out.println(driver.getTitle());
	}
//	@Test
//	public void testCase2() {
//		driver.get("https://www.facebook.com/");
//		System.out.println(driver.getTitle());
//	}
//	@Test
//	public void testCase3() {	
//		driver.get("https://chromedriver.chromium.org/downloads");
//		System.out.println(driver.getTitle());
//	}
//	@AfterTest
//	public void quit() {
//		driver.quit();
//	}
}
