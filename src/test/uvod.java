package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uvod {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tamara\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		driver.navigate().to("https://www.youtube.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.findElement(By.id("search")).sendKeys("Sport");
		driver.findElement(By.id("search-icon-legacy")).click();
		
	}

}
