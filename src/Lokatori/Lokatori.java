package Lokatori;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lokatori {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/itbootcamp/selenium/resources/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("http://shop.demoqa.com/my-account/");
		
		driver.findElement(By.id("username")).sendKeys()
		 * ako samo jednom nesto hocemo da uradimo sa elementom onda je skroz ok 
		 * ovaj nacin pisanja koda
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("tamara");
		// staticke metode jer su povezane sa klasom(by)
		               
		driver.findElement(By.id("password")).sendKeys("tamara123");
		//pisemo CSS selektor kao string
		 //unutar inputa nalazimo css selektor
		  //# oznacava da smo pozvali neki css tag,#cssId
		//	driver.findElement(By.cssSelector("input#password")).sendKeys("tamara123");
		//.je poziv za klasu,woocommerce-Input--text
		 //tag+cssClass
		  //#password   
		driver.findElement(By.name("login")).click();
		//za vracanje na prethodnu stranicu
		driver.navigate().to("http://shop.demoqa.com/");
		//znaci pisemo tekst u okviru linka u inspectu
		driver.findElement(By.linkText("Search")).click();
		//dovoljno zbog naredbe partial da napisemo samo neka slova naseg linka
		//driver.findElement(By.partialLinkText("Sea")).click();
		
		driver.findElement(By.className("form-control")).sendKeys("dress");
		//kod da pritisne dugme enter nakon sto je uneo dress
		//Keys komanda vrsi simulaciju nase tastature
		driver.findElement(By.className("form-control")).sendKeys(Keys.ENTER);
	*/
		
		//kreiramo listu lokatora koji nisu jedinstveni
		//clanovi ove liste su tipa web element
		//koristimo metodu findElements jer ona izvlaci vise elemenata
		driver.get("http://shop.demoqa.com/product/black-cross-back-maxi-dress/");
		List<WebElement> slike = driver.findElements(By.className("noo-woo-thumbnails__image"));
		//relativna-gradimo Xpath obicna putanja //*[@id="product-1162"]/div[1]/div[1]/div[1]/div[1]/div[1]/div/div[2]/img
		//[] i vrednost u njima pokazuje hijerarhiju,npr div[1] deo prvog diva,div[2] deo drugog div u prvom divu
		//apsolutna-ful-/html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div/div[2]/img
		//pisemo .get(indeks) koju od nor 5 slika hocemo da izaberemo
		//indeksi i ovde idu od 0,i kliknuce ovde na prvu sliku
		slike.get(3).click();
		//kod gradjenja Patha koristimo samo deo [@id="product-1162"]
		
		//ako hocemo da klikne na sve slike redom koristimo for petlju
		for(int i=0; i<slike.size(); i++) {
			slike.get(i).click();	
			sacekaj();
		}
		
		//#vrednostId za povezivanje CSS
		//class="woocommerce-Input woocommerce-Input--text input-text"
		//ovaj kod oznacava da postoje 3 klase,posle svakog razmaka jedna klasa
		
	}
//van main metode pravimo metodu saacekja koja ce da radi neko cekanje
	public static void sacekaj() {
		try {
			//nije uvek idealno koristiti
			//ima slucajeva kada ima previse test caseova onda 
			//se izvrsavanje programa mnogo oduzi
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
