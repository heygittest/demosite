package com.practiceteam.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practiceteam.base.TestBase;


public class AlertPage extends TestBase {

	public AlertPage() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

		}

	@FindBy(partialLinkText="OKTab")
	public WebElement alterttype1;
	
	@FindBy(xpath = "//*[@id='CancelTab']")
	public	WebElement alerttype2;
	
	@FindBy(xpath = "//*[@id='Textbox']")
	public	WebElement alerttype3;
	
	@FindBy(xpath="/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[2]/a")
	public WebElement windows1;
	
	public void alter1() throws InterruptedException
	{
		Thread.sleep(1000);
		//alterttype1.click();
	}
	public void alter2() throws InterruptedException
	{
		Thread.sleep(1000);
		alerttype2.click();
	}
	public void alter3() throws InterruptedException
	{
		//Thread.sleep(1000);
		alerttype3.click();
	}
	
	public WindowsPage clickonWindows() throws IOException, InterruptedException
	{
		Actions action1= new Actions(driver);
		WebElement source=driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a"));
		action1.moveToElement(source).build().perform();
		Thread.sleep(1000);
		Actions action2= new Actions(driver);
		WebElement dest=driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[2]/a"));
		
		action2.dragAndDrop(source, dest).build().perform();
		//Thread.sleep(500);
		System.out.println("Windows");
		dest.click();
		return new WindowsPage();
	}
}
