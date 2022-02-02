package D_28_01_2022;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://s.bootsnipp.com/iframe/WaXlr");

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite broj zvezdica od 1 do 5: ");
		int x = s.nextInt();

		switch (x) {
		case 1:
			driver.findElement(By.id("rating-star-1")).click();
			break;
		case 2:
			driver.findElement(By.id("rating-star-2")).click();
			break;
		case 3:
			driver.findElement(By.id("rating-star-3")).click();
			break;
		case 4:
			driver.findElement(By.id("rating-star-4")).click();
			break;
		case 5:
			driver.findElement(By.id("rating-star-5")).click();
			break;
		default:
			break;
		}

		

		driver.close();


	}

}
