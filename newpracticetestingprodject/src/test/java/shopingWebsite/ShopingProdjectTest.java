package shopingWebsite;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopingProdjectTest {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	@Ignore
	public void testDoDressesExist() {
		driver.get("http://automationpractice.com/index.php");
		WebElement searchFor = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]"));
		searchFor.sendKeys("dress");
		searchFor.submit();
		List<WebElement> wEs = driver.findElements(By.tagName("img"));
		assertEquals("", false, wEs.isEmpty());
	}

	@Test
	public void checkoutTest() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		WebElement searchFor = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]"));
		searchFor.sendKeys("dress");
		searchFor.submit();
		Thread.sleep(1000);
		WebElement selectItem = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[2]/h5/a"));
		selectItem.click();
		Thread.sleep(1000);
		WebElement addToCart = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[4]/div/div/div/div[4]/form/div/div[3]/div/p/button"));
		addToCart.click();
		Thread.sleep(1000);
		WebElement precedToCheckout1 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		precedToCheckout1.click();
		Thread.sleep(1000);
		WebElement precedToCheckout2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
		precedToCheckout2.click();
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input"));
		username.sendKeys("MeatPie@gmail.com");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input"));
		password.sendKeys("password");
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));
		submit.click();
		Thread.sleep(1000);
		WebElement precedToCheckout3 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
		precedToCheckout3.click();
		Thread.sleep(1000);
		WebElement tickBox = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input"));
		tickBox.click();
		Thread.sleep(1000);
		WebElement precedToCheckout4 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span"));
		precedToCheckout4.click();
		Thread.sleep(1000);
		WebElement precedToCheckout5 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a"));
		precedToCheckout5.click();
		Thread.sleep(1000);
		WebElement precedToCheckout6 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
		precedToCheckout6.click();
		WebElement precedToCheckout7 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/p/strong"));
		
		assertEquals("Your order on My Store is complete.", precedToCheckout7.getText());
		
		
		
		
		
		
		
		
	}
	
	@After
	public void destroy() {
		driver.close();

	}
}







