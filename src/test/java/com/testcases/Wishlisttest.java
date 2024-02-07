package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.LoginFunction;
import com.pom.LoginFunctionality;
import com.pom.WishListFunctionality;

public class Wishlisttest extends TestBase {
	
	LoginFunction login;
	WishListFunctionality wlf;
	
	
	
	@BeforeMethod
	public void setup() {
		Intialization();
		wlf=new WishListFunctionality(driver); 
		login=new LoginFunction(driver);
		login.dologin();
		
	}
	@Test(priority=1)
	public void AddTowishlist() {
		wlf.bottle();
		wlf.homepage();
		wlf.compost();
		wlf.homepage();
		wlf.iphone();
		
	}
	
	@Test(priority=2)
	public void remove_fromwishlist() {
		wlf.wishlistremove();
	}
	
		@Test(priority=3)
		public void veify_wishlistcount() {
			wlf.wishlistcount();
			
		}
		@Test(priority=4)
		public void verifybuynow_functionality() {
			wlf.buynow_functionality();
			
		}
		
	
	@AfterMethod()
		public void teardown() {
			driver.close();
			
		}

}
