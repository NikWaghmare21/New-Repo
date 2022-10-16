package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngTest {
	@BeforeClass
	public void beforeclass() {
		System.out.println("i");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("i");
	}
	
	

}
