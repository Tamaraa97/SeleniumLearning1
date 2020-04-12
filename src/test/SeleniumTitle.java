package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


@SuppressWarnings("unused")
public class SeleniumTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/itbootcamp/selenium/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://itbootcamp.rs/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		driver.manage().window().maximize();
		String expectedTitle = "ITBootcamp - Besplatna IT prekvalifikacija - Free IT Bootcamp in cooperation with the Divac Foundation";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Titlovi su isti");
		else 
			System.out.println("Titlovi se razliku");
		driver.close();
		driver.quit();

	}

}
