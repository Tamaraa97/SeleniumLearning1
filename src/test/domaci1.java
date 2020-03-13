package test;


import org.openqa.selenium.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class domaci1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/itbootcamp/selenium/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itbootcamp.rs/");

		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());
		
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://itbootcamp.rs/course/testiranje-softvera-qa-nis/\\");	
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		org.openqa.selenium.Dimension d = new Dimension(300,300);
		driver.manage().window().setSize(d);
	}

}
