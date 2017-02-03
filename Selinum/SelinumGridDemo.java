package Selinum;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SelinumGridDemo {

	@Test
	public void main() throws MalformedURLException{
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
	 
		cap.setCapability("browser", "Firfox");
		cap.setCapability("OS","WINDOSW");
		cap.setCapability("browserstack.debug", "true");
		cap.setCapability("browser", "Firfox");
		
		/*DesiredCapabilities cap=DesiredCapabilities.firefox();
		 cap.setPlatform(Platform.WINDOWS);
		*/
		URL url= new URL("http:/wwww.google.com");
		WebDriver driver= new RemoteWebDriver(url,cap);
		driver.get("http://www.google.com");
		driver.getTitle();
		driver.quit();  
		
		
	}
}
