package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Facebook_Java 
    {

	public static void main(String[] args) 
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("komalborkar@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("12345");
	driver.findElement(By.name("login")).click();
	
	

	
	

	}

}
