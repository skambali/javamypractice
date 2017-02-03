package Selinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class iFrame {
	
	//public static void main(String[] args){
	@Test
	public void iframeTest(){
		
		FirefoxProfile n= new FirefoxProfile();
		n.setAcceptUntrustedCertificates(false);
		n.setAssumeUntrustedCertificateIssuer(false);
		WebDriver driver=new FirefoxDriver(n);
		driver.get("http://www.qa.ebay.com");
		WebElement ifr=driver.findElement(By.name(""));
		driver.switchTo().frame(ifr);
		driver.switchTo().defaultContent();
		
	}
	@Test
	public void chromebrowser(){
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		System.setProperty("webdriver.driver.chrome", "c:\\ets\\");
	WebDriver driver=new ChromeDriver(dc);	
		
	}
	
	@Test
	public void iebrowser(){
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		System.setProperty("webdriver.driver.ie","c:\\test\\");
		WebDriver driver=new InternetExplorerDriver(cap);
		//force certificate issue
		
		driver.get("javaScript:document.getElementById('OverRidelink').click() ");
		
		
		driver.get("javaScript:doucment.getElementById('overRideLink').click()");

			
		
			driver.get("javaScript:document.getElemntById('overridelink').click()");
	}
	
	
 
 
 

}
