package Selinum;

import org.testng.annotations.Test;

public class runningAllTest {
 @Test
	public void test(){
		System.out.println("all");
	}
/* welcome to
 adsf
 adsf
 sadf
 sdf
 sdf*/
 
 
	@Test(dependsOnMethods={"test"})
	
	public void test1(){
		System.out.println("HI");
	}
 @Test
	public void test5(){
		System.out.println("welcome");
	}

}
 