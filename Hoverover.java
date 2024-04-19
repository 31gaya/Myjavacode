package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Hoverover {
public static void main(String[] args) 
	{
		/*ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement L1=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(L1).perform();
		WebElement E2= driver.findElement(By.xpath("//span[.='Sign in']"));
		E2.click();*/
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement E1=driver.findElement(By.xpath("//span[.='Login']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(E1).perform();
		WebElement E2=	driver.findElement(By.xpath("//span[.='Sign Up']"));
		E2.click();
		
	
	

}}
