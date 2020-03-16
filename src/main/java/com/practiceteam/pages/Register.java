package com.practiceteam.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practiceteam.base.TestBase;

public class Register extends TestBase {

	public Register() throws IOException {
		super();
		PageFactory.initElements(driver, this);	
		// TODO Auto-generated constructor stub
	}

	/*@FindBy(xpath="//*[@id='basicBootstrapForm']/div[1]/div[1]/input")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id='basicBootstrapForm']/div[1]/div[2]/input")
	WebElement lastName;
		
	@FindBy(xpath="//*[@id='basicBootstrapForm']/div[2]/div[1]/textarea")
	WebElement address;
	
	@FindBy(xpath="//*[@id='basicBootstrapForm']/div[3]/div[1]/input")
	WebElement email;
	
	@FindBy(xpath="//*[@id='basicBootstrapForm']/div[4]/div[1]/input")
	WebElement phone;
	
	@FindBy(xpath="//*[@id='basicBootstrapForm']/div[5]/div[1]/label[1]/input")
	WebElement maleGender;
	
	@FindBy(xpath="//*[@id='basicBootstrapForm']/div[5]/div[1]/label[2]/input")
	WebElement femaleGender;
	
	@FindBy(xpath="//*[@id='basicBootstrapForm']/div[6]/div/div[1]/input")
	WebElement cricket;
	
	@FindBy(xpath="//*[@id='basicBootstrapForm']/div[6]/div/div[2]/input")
	WebElement movie;
	
	@FindBy(xpath="//*[@id='basicBootstrapForm']/div[6]/div/div[3]/input")
	WebElement hocky;
	
	@FindBy(xpath="//*[@id='msdd']")
	WebElement language;
	
	@FindBy(xpath="//*[@id='Skills']")
	WebElement skills;
	
	@FindBy(xpath="//*[@id='countries']")
	WebElement countries;
	
	@FindBy(xpath="//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span")
	WebElement contry;
	
	@FindBy(xpath="//*[@id='yearbox']")
	WebElement year;
	
	@FindBy(xpath="//*[@id='monthbox']")
	WebElement month;
	
	@FindBy(xpath="//*[@id='daybox']")
	WebElement day;
	
	@FindBy(xpath="//*[@id='firstpassword']")
	WebElement firstpassword;
	
	@FindBy(xpath="//*[@id='secondpassword']")
	WebElement secondpassword;
	
	@FindBy(xpath="//*[@id='submitbtn']")
	WebElement submitbtn;
	
	@FindBy(xpath="//*[@id='Button1']")
	WebElement refreshbtn;*/
	
	public void register(String FirstName,String LastName,String address,String email, 
	String phone,	String gender,String hobbie,String language,String skills,String contries	
	,String country	,String year	,String month ,String day	,	String password) throws Exception
	{
		WebElement firstName=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
		WebElement lastName=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input"));
		WebElement address1=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div[1]/textarea"));
		WebElement email1=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[3]/div[1]/input"));
		WebElement phone1=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div[1]/input"));
		WebElement maleGender=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div[1]/label[1]/input"));
		WebElement femaleGender=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div[1]/label[2]/input"));
		WebElement cricket=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[6]/div/div[1]/input"));
		WebElement movie=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[6]/div/div[2]/input"));
		WebElement hocky=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[6]/div/div[3]/input"));
		WebElement language1=driver.findElement(By.xpath("//*[@id='msdd']"));
		WebElement skills1=driver.findElement(By.xpath("//*[@id='Skills']"));
		WebElement countries=driver.findElement(By.xpath("//*[@id='countries']"));
		WebElement contry=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span"));
		WebElement year1=driver.findElement(By.xpath("//*[@id='yearbox']"));
		WebElement month1=driver.findElement(By.xpath("//*[@id='monthbox']"));
		WebElement day1=driver.findElement(By.xpath("//*[@id='daybox']"));
		WebElement firstpassword=driver.findElement(By.xpath("//*[@id='firstpassword']"));
		WebElement secondpassword=driver.findElement(By.xpath("//*[@id='secondpassword']"));
		WebElement submitbtn=driver.findElement(By.xpath("//*[@id='submitbtn']"));
		WebElement refreshbtn=driver.findElement(By.xpath("//*[@id='Button1']"));
		
		
		
		System.out.println("Jep");
		firstName.sendKeys(FirstName);
		lastName.sendKeys(LastName);
		address1.sendKeys(address);
		email1.sendKeys(email);
		phone1.sendKeys(phone);
		if(gender.equalsIgnoreCase("Male"))
		{
			maleGender.click();
		}
		if(gender.equalsIgnoreCase("FeMale"))
		{
			femaleGender.click();
		}
		
		if(gender.equalsIgnoreCase("Male"))
		{
			maleGender.click();
		}
		if(hobbie.equalsIgnoreCase("Cricket"))
		{
			cricket.click();
		}
		if(hobbie.equalsIgnoreCase("Movies"))
		{
			movie.click();
		}
		if(hobbie.equalsIgnoreCase("Hockey"))
		{
			hocky.click();
		}
		
		language1.sendKeys(language);
		skills1.sendKeys(skills);
		countries.sendKeys(contries);
		contry.sendKeys(country);
		year1.sendKeys(year);
		month1.sendKeys(month);
		day1.sendKeys(day);
		firstpassword.sendKeys(password);
			
		submitbtn.click();
		Thread.sleep(1000);
		//return new WebTablePage();
	}
	}
