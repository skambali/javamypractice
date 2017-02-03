package Selinum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Listoflinks {
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for (int i=0;i<=list.size();i++){
			System.out.println(list.get(i).getText());
			System.out.println(list.get(i).getAttribute("href"));
		}
		
	}

}
