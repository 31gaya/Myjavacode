package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
public class SBI {

	public static void main(String[] args) 
	{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm");
	driver.manage().window().maximize();

}
	}
