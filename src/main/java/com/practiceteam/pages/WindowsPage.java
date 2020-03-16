package com.practiceteam.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.practiceteam.base.TestBase;


public class WindowsPage extends TestBase {
	
	public WindowsPage() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub

		  PageFactory.initElements(driver, this);
		
	}
			
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")
	WebElement windowtype2;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[2]/div[2]/button")
	WebElement windowtype2click ;
		
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")
	public WebElement windowtype3;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")
	public WebElement windowtype1;
	
	public void windowtype2click() throws InterruptedException
	{
		
			Thread.sleep(1000);
			WebElement a= driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
			//windowtype2.click();
			a.click();
			WebElement b=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button"));
			b.click();
		//windowtype2click.click();
		
	}
}
