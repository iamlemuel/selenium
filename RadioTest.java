import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RadioTest extends SetProperty {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\tony\\geckodriver.exe");
		//RemoteWebDriver driver = new FirefoxDriver();
		
		setProp();
		
	//www.Cardekho.com
		
	/*	driver.get("http:\\www.cardekho.com");
		Thread.sleep(3000);
		//locate element select budget
		driver.findElement(By.cssSelector(".searchbox > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > i:nth-child(3)")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='bmvBrand']")).click();//  "//*[@id=\'bmvBrand\']" also valid xpath
		driver.close();
		
		*/
		
		
	//Faceboook create account
		
		
		
	    String firstName = "Mama";
 		String surName = "C";
 		String mobileNo = "9949352315";
 		driver.get("http:\\www.facebook.com");
		WebElement element = driver.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy"));
		
		Thread.sleep(2000);
		element.click();				
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.inputtext._58mg._5dba._2ph-")).sendKeys(firstName);
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(surName);
		driver.findElement(By.cssSelector("input[name='reg_email__")).sendKeys(mobileNo);
		
		driver.findElement(By.cssSelector("input._8esa[value='1']")).click();
		Thread.sleep(1000);
		List<WebElement> day = driver.findElements(By.xpath("//*[@id='day']//option"));
		List<WebElement> month = driver.findElements(By.xpath("//*[@id='month']//option"));
		List<WebElement> year = driver.findElements(By.xpath("//*[@id='year']//option"));

 
		for(int i=0; i<day.size(); i++) {
			if(day.get(i).getText().equals("str")) {
				day.get(i).click();
				break;
			}
				
		}
		
		for(int i=0; i<month.size(); i++) {
			if(month.get(i).getText().equals("Mar")) {
				month.get(i).click();
				break;
			}
		}
		
		for(int i=0; i<year.size(); i++) {
			if(year.get(i).getText().equals("2009")) {
				year.get(i).click();
				break;			}
		}
	//	System.out.println(day.get(5).getText());
	//	System.out.println(month.get(3).getText());
	//	System.out.println(year.get(3).getText());
		
/*		driver.findElement(By.cssSelector("input._8esa[value='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input._8esa[value='-1']")).click();
		driver.close();
		
		*/ 
	
		
	}

}