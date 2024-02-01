package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.LoginFunction;
import com.pom.SearchdropFunctionality;

public class SearchTest extends TestBase {
	
	SearchdropFunctionality sf;
	LoginFunction login;
	
	public SearchTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		Intialization1();
		sf=new SearchdropFunctionality(driver);
		login=new LoginFunction(driver);
		
		
	}
	@Test(priority=1)
	public void search1() {
		sf.search();
		String str=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/products?name=iphone&data_from=search&page=1", str);
	}
	@Test(priority=2)
	public void dropdown1() throws Throwable {
		sf.dropdown();
		
	}
	@AfterMethod()
		public void teardown() {
			driver.close();
		}
	
	

}
