package Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_driver {

	public static void main(String[] args) throws InterruptedException
	 {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//String title =driver.getTitle ();
		//System.out.println(title);
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("btnK")).click();
		//Thread.sleep(10000);
		//driver.close();
	 }

}
  
 