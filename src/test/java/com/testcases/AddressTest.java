package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.AddressFunctionality;
import com.pom.LoginFunction;

import com.utils.Utils;

public class AddressTest extends TestBase{
	AddressFunctionality af;
	LoginFunction login;
	Utils util;
	String sheetname="AddAddress";
	
	public AddressTest() {
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
		af=new AddressFunctionality(driver);
		login.dologin();
	}
	@Test(priority=1,dataProvider="setdata1",dataProviderClass=AddressTest.class)
	public void verify_addAddress(String personname1,String phonenum1,String city2,String pincode1,String Address2,String search1) throws Throwable {
		af.addaddress(personname1, phonenum1, city2, pincode1, Address2, search1);
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
