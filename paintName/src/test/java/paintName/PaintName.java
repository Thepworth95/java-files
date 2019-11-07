package paintName;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;


public class PaintName {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testDoDressesExist() throws InterruptedException {
		Actions action = new Actions(driver);
		driver.get("https://www.youidraw.com/apps/painter/");
		action.moveByOffset(550, 270).clickAndHold().moveByOffset(120, 0).moveByOffset(-60, 0).moveByOffset(0, 180).release().perform();
		action.moveByOffset(180, -180).clickAndHold().moveByOffset(10, 0).moveByOffset(20, 20).moveByOffset(20, 30).moveByOffset(10, 40).moveByOffset(-10, 40).moveByOffset(-20, 30).moveByOffset(-20, 20).moveByOffset(-20, 0)
		.moveByOffset(-20, -20).moveByOffset(-20, -30).moveByOffset(-10, -40).moveByOffset(10, -40).moveByOffset(20, -30).moveByOffset(20, -20).moveByOffset(10, 0).release().perform();
		action.moveByOffset(120, 180).clickAndHold().moveByOffset(0, -180).moveByOffset(60, 90).moveByOffset(60, -90).moveByOffset(0, 180).release().perform();
		Thread.sleep(10000);
	}

	
	@After
	public void destroy() {
		driver.close();

	}
}






















