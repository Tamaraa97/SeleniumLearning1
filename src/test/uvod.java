package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uvod {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/itbootcamp/selenium/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//razlika izmedju close i kvita,close zatvara samo poslednji koji je otvoren,kvit zatvara sve otvorene prozore,obavezno na kraj jer posle driver komanda ne radi
		//uzima title sa google i ispisuje google
		
		driver.navigate().to("https://www.youtube.com");
		title =  driver.getTitle();
		System.out.println(title);
		
	/*	driver.navigate().back();
		
		driver.navigate().forward();*/
		
		WebElement search = driver.findElement(By.id("search"));
		
		search.sendKeys("Sport");
		//search.sendKeys(Keys.ENTER);
		
		WebElement lupica = driver.findElement(By.id("search-icon-legacy"));
		lupica.click();
		//driver.findElement(By.id("search-icon-legacy")).click();
		//elements,kada imamo vise klasa sa istim elementima a mi zelimo da izvucemo jednu
		driver.close();
	}

}
