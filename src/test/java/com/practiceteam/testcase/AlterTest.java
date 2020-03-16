package com.practiceteam.testcase;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.practiceteam.pages.AlertPage;
import com.practiceteam.pages.WindowsPage;

public class AlterTest extends AlertPage {
	public static WindowsPage winpage;
	AlertPage p;
	public AlterTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		 p= new AlertPage();
	}
	@Test (priority=1)
	public void checkAlert() throws Exception
	{
		p.alter1();
		if(driver.findElement(By.xpath("//*[@id='OKTab']/button")).isDisplayed())
		{
			driver.findElement((By.xpath("//*[@id='OKTab']/button"))).click();
			Thread.sleep(1000);
			Alert a= driver.switchTo().alert();
			String text=a.getText();
			Assert.assertEquals(text, "I am an alert box!");
			System.out.println("heloo");
			a.accept();
		}
		/*p.alter2();
		if(driver.findElement(By.xpath("//*[@id='CancelTab']/button")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
			driver.switchTo().alert();
			String s1=driver.switchTo().alert().getText();
			Assert.assertEquals(s1, "Press a Button");
			driver.switchTo().alert().dismiss();
		}*/
	}
		@Test (priority=2)
		public void callwindowspage() throws Exception
		{
			winpage=p.clickonWindows();
		}
		
	
	
}
