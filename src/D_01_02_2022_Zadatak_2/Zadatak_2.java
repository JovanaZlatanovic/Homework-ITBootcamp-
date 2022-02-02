package D_01_02_2022_Zadatak_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak_2 {

	public static void main(String[] args) throws InterruptedException {
		
//		Napisti program koji:
//			Ucitava stranicu https://videojs.com/city
//			Pusta video klikom na play dugme
//			Cekamo da se video ucita
//			Tako sto proveravamo da li vise to play dugme nije vidljivo

		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebDriverWait waitForVideo = new WebDriverWait(driver, Duration.ofSeconds(60));

		driver.manage().window().maximize();
		driver.get("https://videojs.com/city");

		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//button[contains(@class, 'vjs-big-play-button')]")));
		driver.findElement(By.xpath("//button[contains(@class, 'vjs-big-play-button')]")).click();

		boolean playButton;
		try {
			driver.findElement(By.xpath("//button[contains(@class, 'vjs-big-play-button')]"));
			playButton = true;
		} catch (Exception e) {
			playButton = false;
		}

		if (playButton) {
			System.out.println("Pritisnuto dugme za play");
		} else {
			System.out.println("Nije pritisnuto dugme za play");
		}

		
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
