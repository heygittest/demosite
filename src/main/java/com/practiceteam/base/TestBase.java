package com.practiceteam.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	public static File file;
	public static FileInputStream fis;
	public String browser;
	public String url;
	// init property variable and load property details
	public TestBase() throws IOException
	{
		
		file=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\praticeteam\\properties\\prop.properties");
		fis=new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);
	}
	// get the browser and the url
	@BeforeTest
	public void init() throws InterruptedException
	{
		browser=prop.getProperty("browser");
		url=prop.getProperty("url");
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Ajit\\eclipse-workspace\\autoprac\\src\\test\\resources\\browser\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\src\\test\\resources\\browser\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		driver.get(url);
		Thread.sleep(500);
	}
	
}
