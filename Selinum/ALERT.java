package Selinum;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ALERT {

	public static void main (String[] args)
	
	{
		
		//Save to Desk
			
		WebDriver driver=new FirefoxDriver();
		FirefoxProfile pro=new FirefoxProfile();
		//common
		pro.setPreference("broweser.download.foldrlits","app/zip");
		//save to desk
		
		FirefoxProfile prof=new FirefoxProfile();
		//0 to desktop
		prof.setPreference("browser.helperapps.neverask.savetodisk", "app/value"); 
		prof.setPreference("browser.download.folderlist", 0);
		
		//2 custome path
		
		FirefoxProfile fr=new FirefoxProfile();
		prof.setPreference("Browser.helperapps.neverask.savetodisk", "app/valiue");
		prof.setPreference("browser.download.folderlist", 2);
		prof.setPreference("Browser.download.dir", "c:\\dir\\pat");
		
		//alert and popup
	//	WebDriver driver=new FirefoxDriver();
		Alert an= driver.switchTo().alert();
		an.accept();
		an.dismiss();
		an.accept();
		
	}
}
