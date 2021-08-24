import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SetProperty {
	
	public static RemoteWebDriver driver;
	
	public static void setProp() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\tony\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	}
	
}
