package demoProject1.test;

import org.testng.annotations.Test;

import bsh.Capabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
		caps = DesiredCapabilities.chrome();

		caps.setBrowserName("chrome");
		caps.setPlatform(Platform.LINUX);
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"), caps);
		driver.manage().window().maximize();
	}

	@Test
	public void testCase1() throws InterruptedException {
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(
				By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > button"))
				.click();
		Thread.sleep(2500);
		driver.switchTo().alert().accept(); // Accept = ok / yes
		driver.findElement(
				By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > button"))
				.click();
		Thread.sleep(2500);
		driver.switchTo().alert().dismiss(); // Cancel / No
		driver.findElement(
				By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(6) > div.panel-body > button"))
				.click();
		driver.switchTo().alert().sendKeys("Text to Alert");
		Thread.sleep(2500);
		driver.switchTo().alert().accept(); // Cancel / No
	}

	@Test
	public void testCase2() {
		driver.get("https://mvnrepository.com/artifact/org.arquillian.cube/arquillian-cube-requirement");
		System.out.println(driver.getTitle());
	}

	@Test
	public void testCase3() throws Exception {
		driver.get("https://www.southwest.com/");
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='lightbox_pop']")));
//		driver.findElement(By.xpath("//button[contains(text(), 'English')]")).click();
//		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'Southwest® gift card')]")).click();
		driver.findElement(By.id("amount")).sendKeys("900");
		driver.findElement(By.id("recipientEmail")).sendKeys("decong2345@outlook.es");
		driver.findElement(By.id("recipientEmail")).sendKeys("decong2345@outlook.es");
		System.out.println("Texto de alert " + driver.switchTo().frame(driver.findElement(By.id("lightbox_pop"))));
	}

//	@Test
//	public void testCase3() {
//		driver.get("https://chromedriver.chromium.org/downloads");
//		System.out.println(driver.getTitle());
//	}
	@AfterTest
	public void quit() {
//		driver.quit();
	}
}