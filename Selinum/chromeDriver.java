package Selinum;

import java.nio.channels.AcceptPendingException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class chromeDriver {
public static void main (String [] args)
{
	DesiredCapabilities des=  DesiredCapabilities.chrome();
	des.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
	
	System.setProperty("WebDriver.chrome,driver","C://usersr//kambali//Desktop//QA//java//chromedriver_win32//chromedriver.exe");
//System.setProperty("webDriver.chrome.driver", value)
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	
}
}
