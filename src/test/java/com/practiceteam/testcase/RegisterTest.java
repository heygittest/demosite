package com.practiceteam.testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.practiceteam.pages.Register;
import com.practiceteam.pages.WebTablePage;

public class RegisterTest extends Register{
	
	public static WebTablePage tablepage;
	public static Register reg;
	public RegisterTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		Register reg= new Register();
		tablepage= new WebTablePage();
	}
	@Test(priority=-1)
	public void newentry() throws Exception
	{
		reg.register("Test", "Last", "sd", "tst@test.com","87787" , "Female", "cricket", "English", "Android", "Australia",
 "Australia", "2019", "3", "3", "Test@123465");
		
	}
	
	
}
