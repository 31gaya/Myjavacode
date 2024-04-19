package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotechminds_Registration {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Gayatri");
		driver.findElement(By.id("lname")).sendKeys("Borkar");
		driver.findElement(By.id("email")).sendKeys("Gayatriborkar1994@gmail.com");
       	driver.findElement(By.name("password")).sendKeys("1234");
       	driver.findElement(By.id("Present-Address")).sendKeys("Dighori");
       	driver.findElement(By.xpath("//textarea[@id='Permanent-Address']")).sendKeys("darshan Appartment Dighori");
       	driver.findElement(By.xpath("//input[@id='Pincode']")).sendKeys("1234");
        driver.findElement(By.name("Submit")).click();
	}
	}
