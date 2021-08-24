import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestFB {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tony\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https:\\www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("iamlemuel@yahoo.com");//login id
		driver.findElement(By.name("pass")).sendKeys("multicom20"); // password
		driver.findElement(By.name("login")).click();  //click on login button
		//driver.findElement(By.cssSelector("i.hu5pjgll lzf7d601")).click();
		//Thread.sleep(100);
		//driver.quit();
	}

}
//driver.findElement(By.name("email")).sendKeys("iamlemuel@yahoo.com");
//driver.findElement(By.name("email")).sendKeys("iamlemuel@yahoo.com");