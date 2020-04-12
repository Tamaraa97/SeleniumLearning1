package Lokatori;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lokatori2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/itbootcamp/selenium/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//TimeUnit klasa unutar jave koja ima sve vremenske jedinice
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://shop.demoqa.com/my-account/");
		
		//prosledjujemo vrednost drivera,i vrednost maksimalnog cekanja izvrsenja akcije
		//difoltna jedinica su sekundi,znaci ovde vazi 5sekundi
		WebDriverWait wait = new WebDriverWait(driver, 5);
		//located by locator
		//uraditi sve pre ovog dok ovaj element nije postao vidljiv
		//wait kao pravilo koda je obavezno da se pise
		//i onda bi pre svake akcije trebalo postaviti wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("jovana");
		//ispred svakog elemeta gde u nasom browseru zelimo da radimo akciju pisemo wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#password")));
		driver.findElement(By.cssSelector("input#password")).sendKeys("jovana123");
		
		driver.findElement(By.name("login")).click();
		
		driver.navigate().to("http://shop.demoqa.com/");
		
		

	}

	

}
