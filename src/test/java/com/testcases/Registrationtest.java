package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.RegisterFunctionality;
import com.utils.Utils;

public class Registrationtest extends TestBase {
	
	String Excelsheet_name="Registration";
	RegisterFunctionality register;
	
	
	@DataProvider
	
	public String[][] Testdata() throws Throwable {
		return Utils.setdata(Excelsheet_name);
	}
	
	@BeforeMethod
	public void setup() {
		Intialization();
		register=new RegisterFunctionality(driver);
		 
	}
	@Test(priority = 1,dataProvider = "Testdata", dataProviderClass = Registrationtest.class,description = "Registering user")
	public void verifyregisterfunctionality(String firstn, String Lastn, String Email, String pnumber,
			String pword, String conpword)  {
		register.Registeruser(firstn, Lastn, Email, pnumber, pword, conpword);

		
	}
	
	@AfterMethod
	public void teardown()  {

   driver.close();
   
	}


}
