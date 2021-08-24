import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest extends SetProperty {

	public static void main(String[] args) throws Exception{
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\tony\\geckodriver.exe");
		//RemoteWebDriver driver = new FirefoxDriver();
		
		setProp();
		String firstName = "Mama";
 		String surName = "C";
 		String mobileNo = "9949352315";
 		driver.get("https://en-gb.facebook.com/");
		WebElement element = driver.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy"));
		
		Thread.sleep(2000);
		element.click();				
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.inputtext._58mg._5dba._2ph-")).sendKeys(firstName);
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(surName);
		driver.findElement(By.cssSelector("input[name='reg_email__")).sendKeys(mobileNo);
		
		driver.findElement(By.cssSelector("input._8esa[value='2']")).click();
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));//this didnt work until system restarted
		List<WebElement> month = driver.findElements(By.xpath("//*[@id='month']//option"));
		List<WebElement> year = driver.findElements(By.xpath("//*[@id='year']//option"));
		
		
		//chooseDate(day, "20");
		//chooseMonth(month, "Jun");ben ben
		//lemuel.ben79@gmail.com
		chooseYear(year, "1989");
		
		// Using Select class for "day" dropdown only
		Select daySelect = new Select(day);
		daySelect.selectByIndex(20);
		}

	public static void chooseDate(List<WebElement> date, String str){
	
		for(int i=0; i<date.size(); i++) {
		if(date.get(i).getText().equals(str)) {
			date.get(i).click();
			break;
		}
		}	
	}
	
	public static void chooseMonth(List<WebElement> month, String mth){
		
		for(int i=0; i<month.size(); i++) {
		if(month.get(i).getText().equals(mth)) {
			month.get(i).click();
			break;
			
		}
			}
	}
	
	public static void chooseYear(List<WebElement> year, String yr) {
		for(int i=0; i<year.size(); i++) {
			if(year.get(i).getText().equals(yr)) {
				year.get(i).click();
				break;
					}
			}
		}
}
