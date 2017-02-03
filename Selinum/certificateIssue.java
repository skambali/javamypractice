package Selinum;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class certificateIssue {
	public static void main(String[] args){
		// IE browser
		System.setProperty("webdriver.ie.driver", "C:\\ad\\b");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http:\\www.ebay.com");
		driver.get("javaScript:doucment.getElementById('overRideLink').click()");
		
		//Chrome Browser
		
		DesiredCapabilities cap =DesiredCapabilities.internetExplorer();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.driver.chrome","c:\\path");
		WebDriver driver1=new ChromeDriver();
		
		
		FirefoxProfile fp=new FirefoxProfile();
		fp.setAcceptUntrustedCertificates(true);
		
		WebDriver driverf=new FirefoxDriver(fp);
	}

}
