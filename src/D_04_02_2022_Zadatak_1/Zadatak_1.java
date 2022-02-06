package D_04_02_2022_Zadatak_1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadatak_1 {

//	Napisti TestNg test koji:
//	Ucitava stranicu https://www.udemy.com/
//	U delu za pretragu ukucajte tekst “Selenium” i lupite enter
//	Sortirajte rezultate pretrage prema rejtingu (Highest Rated)
//	Dohvatite rejting prvog rezultata pretrage
//	Dohvatite rejting zadnjeg rezultata pretrage (HELP: trebace vam getText metoda)
//		[HELP] Dohvatite rejting kao listu  pa iz liste izvucite prvi i zadnji element.
//		//*[@data-purpose=\"rating-number\"]
//	Proverite da li je reting prvog veci od rejtinga zadnjeg rezultata
//	pretvaranje stringa u double link ce vam trebati za ovaj zadatak

//	Umesto prvog za Udemy imamo kupujem prodajem.
//	Ucitajte stranicu (ako treba gasite onaj dijalog sto iskace)
//	Ukucajte za pretragu iphone
//	postavice za valutu eure
//	Sortirajte prema ceni da bude najjefinije prvo
//	Onda izvrsite proveru sortiranja kao sto je bilo za udemy

	WebDriver driver;
	JavascriptExecutor js;
	Actions actions;
	WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.kupujemprodajem.com/index.php");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("kpBoxCloseButton"))).click();

	}

	@Test
	public void kupujemProdajem() throws InterruptedException {

		driver.get("https://www.kupujemprodajem.com/");

		driver.findElement(By.className("kpBoxCloseButton")).click();

		driver.findElement(By.id("searchKeywordsInput")).sendKeys("Iphone");
		driver.findElement(By.id("searchKeywordsInput")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"priceSecondSelection\"]/div/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//input[@action-name='currency-eur']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@action-name='confirm']")).click();
		driver.findElement(By.xpath("//div[@id='orderSecondSelection']//span[@class='choiceLabelText']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-text='Jeftinije']")).click();
		driver.findElement(By.xpath("(//input[@name='submit[search]'])[3]")).click();
		Thread.sleep(3000);

		List<WebElement> cene = driver.findElements(By.xpath("//span[@class='adPrice ']"));
		String d = "din";
		String e = "€";
		double najjeftiniji = 0;
		double najskuplji = 0;

		String cenaMin = cene.get(0).getText();
		String cenaMax = cene.get(cene.size() - 1).getText();

		if (cenaMin.contains(d)) {
			cenaMin = cenaMin.replaceAll(d, "");
			cenaMin = cenaMin.trim();
			double cenaDouble = new Double(cenaMin);
			najjeftiniji = cenaDouble / 118;

		} else if (cenaMin.contains(e)) {
			cenaMin = cenaMin.replaceAll(e, "");
			cenaMin = cenaMin.trim();
			double cenaDouble = new Double(cenaMin);
			najjeftiniji = cenaDouble;

		}
		if (cenaMax.contains(d)) {
			cenaMax = cenaMax.replaceAll(d, "");
			cenaMax = cenaMax.trim();
			double cenaDouble = new Double(cenaMax);
			najskuplji = cenaDouble / 118;

		} else if (cenaMax.contains(e)) {
			cenaMax = cenaMax.replaceAll(e, "");
			cenaMax = cenaMax.trim();
			double cenaDouble = new Double(cenaMax);
			najskuplji = cenaDouble;

		}
		Assert.assertTrue(najskuplji > najjeftiniji, "Nije sortirano.");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
