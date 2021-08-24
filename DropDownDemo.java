import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo extends SetProperty{


	public static void main(String[] args) throws Exception {
		// Multiple dropdown tests
		
		setProp(); //setspropertyfrom classfile SetProperty
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement cookies = driver.findElement(By.xpath("//a[@title='Accept Cookies']"));
		cookies.click();
		WebElement element = driver.findElement(By.xpath("//select[@id='Form_submitForm_Industry']"));
		WebElement employees = driver.findElement(By.xpath("//select[@id='Form_submitForm_NoOfEmployees']"));
		WebElement country = driver.findElement(By.xpath("//select[@id='Form_submitForm_Country']"));
		
		Select select = new Select(element);
		Select selectEmployees= new Select(employees);
		Select selectCountry = new Select(country);
		System.out.println(select.isMultiple());
		select.selectByValue("Business Services/Consultancy");
		
		Thread.sleep(1000);
		selectEmployees.selectByIndex(2);
		Thread.sleep(1000);
		selectCountry.selectByVisibleText("India");
		Thread.sleep(1000);
		System.out.println("Closing the browser ...bye");
		//driver.close();
		driver.quit();
		
	

	}

}
