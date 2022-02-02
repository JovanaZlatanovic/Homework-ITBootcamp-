package D_28_01_2022_Zadatak_2;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_2 {

	public static void main(String[] args) throws InterruptedException {
		
//		
//		Napisati program koji vrsi dodavanje 5 reda u tabelu. 
//		Maksimizirati prozor
//		Ucitati stranicu https://www.tutorialrepublic.com/snippets/bootstrap/table-
//			with-add-and-delete-row-feature.php
//		Dodati red podataka - jedan red u jednoj iteraciji 
//		Kliknite na dugme Add New
//		Unesite name,departmant i phone (mogu da budu uvek iste vrednost)
//		Kliknite na zeleno Add dugme
//		Na kraju programa ugasite pretrazivac.
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php");

		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			driver.findElement(By.xpath("//*[contains(@class, 'btn btn-info add-new')]")).click();

			System.out.println("Enter name: ");
			String name = s.next();
			System.out.println("Enter last name: ");
			String lastName = s.next();
			System.out.println("Enter department: ");
			String department = s.next();
			System.out.println("Enter phone number: ");
			String phone = s.next();

			driver.findElement(By.id("name")).sendKeys(name + " " + lastName);
			driver.findElement(By.id("department")).sendKeys(department);
			driver.findElement(By.id("phone")).sendKeys(phone);
			driver.findElement(By.xpath("//*[contains(@class,"
					+ " 'table table-bordered')]/tbody//tr[last()]/td[4]/a[1]")).click();
		}

		Thread.sleep(2000);

		driver.close();
	}

}
