package D_01_02_2022_Zadatak_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak_1 {

	public static void main(String[] args) {
		
//		Napisati program koji :
//			Ucitava stranicu https://www.udemy.com/courses/search/?src=ukw&q=slksd
//			Klikce na dugme za jezik i proverava da li se prikazuje
//			dijalog za promenu jezika
//			Stampa u konzoli tekst “Dijalog se prikazao”
		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.navigate().to("https://www.udemy.com/courses/search/?src=ukw&q=slksd");

		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[contains(@class, 'language-selector-button--button--1wgoL')]")));
		driver.findElement(By.xpath("//button[contains(@class, 'language-selector-button--button--1wgoL')]")).click();


		boolean dijalog;
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//*[contains(@class, 'udlite-modal-title udlite-heading-lg')]")));
			driver.findElement(By.xpath("//*[contains(@class, 'udlite-modal-title udlite-heading-lg')]"));
			dijalog = true;
		} catch (Exception e) {
			dijalog = false;
		}

		if (dijalog) {
			System.out.println("Dijalog se prikazao.");
		} else {
			System.out.println("Dijalog se nije prikazao.");
		}


	}

}
