package Selinum;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class TestNG {
 @BeforeSuite
 
 	@BeforeClass
	public void test0(){
		
		//@Test(priority=0)
			System.out.println("first P0 is a:");
			
		}
	
	@AfterClass
public void testA(){
		
		//@Test(priority=0)
			System.out.println("first user is a:");
			
		}
	
	@BeforeMethod
public void testB(){
		
		//@Test(priority=0)
			System.out.println("User in Before Method class:");
			
		}
	
	@AfterMethod
public void testC(){
		
		//@Test(priority=0)
			System.out.println("User in After Method class:");
			
		}
	
	@Test
	public void testign(){
		System.out.println("its test Method");
	}
	/*public void test(){
	
	//@Test(priority=0)
		System.out.println("first P0 is a:");
		
	}
	
	
	 
	//@Test(priority=1)
	public void test1(){
		System.out.println("second P1");
	}
	
	//@Test(priority=9)
	public void test8(){
		System.out.println("second P1");
	}
	      @AfterClass
	public void loginMethod(){
		System.out.println("Login method");
	}
	*/
 }
	
