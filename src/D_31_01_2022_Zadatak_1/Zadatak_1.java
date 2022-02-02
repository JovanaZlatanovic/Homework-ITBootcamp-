package D_31_01_2022_Zadatak_1;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1 {

	public static void main(String[] args) {
//		Napisati program koji:
//			Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
//			Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika 
//			element obrisao sa stranice i ispisuje odgovarajuce poruke
//			(OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
//			POMOC: Brisite elemente odozdo.
//			(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo
		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://s.bootsnipp.com/iframe/Dq2X");

		List<WebElement> elements = driver.findElements(By.xpath("//*[contains(@class, 'col-md-12')]//button"));



		for (int i = 1; i <= elements.size(); i++) {
			driver.findElement(By.xpath("//*[contains(@class, 'col-md-12')]//div[last()]/button")).click();
			Thread.sleep(2000);
			List brisanje = (List) driver
					.findElements(By.xpath("//*[contains(@class, 'col-md-12')]//button"));
			if (brisanje.size() == elements.size() - i) {
				System.out.println("Obrisan je element.");
			} else {
				System.out.println("Nije obrisan element.");
			}
		}

		driver.close();


	}

}
