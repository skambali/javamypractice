package Selinum;

import java.util.List;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class elemetSelection {
	
	public static void main(String[] args){
		WebDriver driver=new FirefoxDriver();
		driver.findElement(By.id("id")).sendKeys("c:\\file\\");
		
		driver.findElement(By.name("FileName")).sendKeys("c:\\file\\");
		driver.get("http://www.google.com");
		
		WebElement city= driver.findElement(By.name("city"));
		
				Select sel=new Select(city);
				sel.selectByIndex(1);
				 
	
	List<WebElement> alloption=sel.getOptions();
	alloption.size();
	for(int i=0;i<=alloption.size();i++){
		WebElement aopt=alloption.get(i);
		System.out.println(aopt.getText());
		
	}
	}

}
