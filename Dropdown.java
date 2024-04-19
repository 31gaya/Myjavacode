package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dd=		driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s1= new Select(dd);//need to create select class object
		//s1.selectByIndex(8); // 
		s1.selectByVisibleText("Books");
		//s1.selectByValue("search-alias=lawngarden");
		WebElement E2=driver.findElement(By.id("twotabsearchtextbox"));
		E2.sendKeys("world");
		E2.sendKeys(Keys.ENTER);// need to enter with the help of keysfunctionality
		WebElement E3= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[5]"));
		E3.click();
	}
	

}
