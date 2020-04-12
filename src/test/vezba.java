package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vezba {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/itbootcamp/selenium/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		
		WebElement elem, elem1;
		elem = driver.findElement(By.name("firstname"));
		elem.click();
		elem.sendKeys("Tamara");
		
		elem1 = driver.findElement(By.name("lastname"));
		elem1.click();
		elem1.sendKeys("Pecnik");
		//sve klikabilne stvari,i gde se unose podaci su web elementi
		
		WebElement gender =  driver.findElement(By.id("sex-1"));
		gender.click();
		
		
		WebElement years = driver.findElement(By.id("exp-0"));
		years.click();
		
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("2020-03-06");
		
		WebElement profession = driver.findElement(By.id("profession-1"));
		profession.click();
		
		WebElement tools = driver.findElement(By.id("tool-2"));
		tools.click();
		
	
		WebElement continents = driver.findElement(By.id("continents"));
		continents.click();
		continents.sendKeys("Europe");
		
		WebElement button = driver.findElement(By.id("submit"));
		button.click();
		
		WebElement link = driver.findElement(By.linkText("Selenium Webdriver Tutorials Series"));
		link.click();
		
		
		
		
		
		
		
		
		
		

	}

}
