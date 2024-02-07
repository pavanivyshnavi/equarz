package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.LoginFunction;
import com.pom.LoginFunctionality;
import com.pom.ProfileFunctionality;
import com.utils.Utils;

public class ProfileTest extends TestBase {
	LoginFunction login;
	ProfileFunctionality profile;
	Utils util;
	String sheetname="Registration";
	
	public ProfileTest() {
		super();
	}
	@DataProvider
	public String[][] setdata1() throws Throwable {
		return Utils.setdata(sheetname);
	}
	@BeforeMethod
	public void setup() {
		Intialization();
		login=new LoginFunction(driver);
		profile=new ProfileFunctionality(driver);
		login.dologin();
	}
	@Test(priority=1, dataProvider="setdata1" , dataProviderClass=ProfileTest.class)
	public void edit(String fname1,String lname1,String mail1,String num1,String password12,String conpassword1) throws Throwable {
		profile.profile_edit(fname1, lname1, mail1, num1, password12, conpassword1);
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	

}
