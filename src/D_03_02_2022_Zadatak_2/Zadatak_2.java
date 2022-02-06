package D_03_02_2022_Zadatak_2;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_2 {

	public static void main(String[] args) {
//		Napisati program koji:
//			Ucitava stanicu https://www.wikipedia.org/
//			Sa stranice sakuplja sve linkove (jezike) i svaki link otvara u novom prozoru pretrazivaca
//			Svaki link potrebno je otvoriti u novom tabu.
//			Skripta: window.open(arguments[0]);
		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		Scanner s = new Scanner(System.in);
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://www.wikipedia.org/");

		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class, 'central-featured')]//a"));

		for (int i = 0; i < list.size(); i++) {
			js.executeScript("window.open(arguments[0]);", list.get(i));
		}



	}

}
