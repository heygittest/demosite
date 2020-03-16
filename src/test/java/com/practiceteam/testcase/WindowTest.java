package com.practiceteam.testcase;

import java.io.IOException;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.practiceteam.pages.WindowsPage;

public class WindowTest extends WindowsPage {

	WindowsPage objwindows;
	public WindowTest() throws IOException, InterruptedException {
		super();
		// TODO Auto-generated constructor stub
		 objwindows= new WindowsPage();
	}
	
	@Test (priority=3)
	public void callto_windowspage() throws InterruptedException
	{
		objwindows.windowtype2click();
		String windowhandle= driver.getWindowHandle();
		Set<String> windowhandles= driver.getWindowHandles();
		int cnt= windowhandles.size();
		System.out.println(cnt +"cnt:");
		Assert.assertEquals(cnt, 2);
		for (String windows1:windowhandles)
		{
			if(!(windowhandles.equals(windowhandle)))
			{
				driver.switchTo().window(windows1);
			
			}
		}
	}
}
