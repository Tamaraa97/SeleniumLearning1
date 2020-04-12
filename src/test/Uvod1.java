package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Test
public class Uvod1 {
	//napisali smo ga opet ovde da bi za sve testove bio definisan
	//i da ne bi morali svaki put ponovo da pisemo
	
	WebDriver driver;
	String title;
	
	@BeforeClass
	public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "src/itbootcamp/selenium/resources/chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	}
	
	public void testGoogle() {
	driver.get("https://google.com");
	title = driver.getTitle();
	System.out.println(title);
	//moze hard assert zato sto je poslednji u nasoj klasi
	//tacnije poslednja linija koda
	Assert.assertEquals(title, "Google");
	}
	
	public void testYoutube() {
		driver.navigate().to("https://www.youtube.com");
		title =  driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "YouTube");
	}
	
	@AfterClass
	public void closeBrowser() {
	driver.close();
	}
}
