import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;//import this package
import org.openqa.selenium.firefox.FirefoxDriver;



public class SeleTest {

	public static void main(String[] args) {
		
		//  C:\Users\tony\geckodriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tony\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:\\www.rediffmail.com");
		System.out.println(driver.getTitle());
		driver.get("http:\\www.google.co.in");	
		System.out.println("closed browser");
		driver.navigate().back();
		System.out.println("back to rediffmail");
		//driver.quit();
		
	}

}
