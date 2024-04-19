package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amzon_India {
	
public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement E1= driver.findElement(By.xpath("(//input)[5]"));
		E1.sendKeys("Shoe");
		WebElement submit = driver.findElement(By.xpath("(//input)[6]"));
		submit.click();
	WebElement E2=	driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		E2.click();

	}

}
