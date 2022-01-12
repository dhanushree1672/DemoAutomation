package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutFirefoxBrowser {
    private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lounchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		logout();
		closeApplication();
	}
    private static void lounchBrowser()
    {
    	try {
    		String path=System.getProperty("user.dir");
    		System.setProperty("webdriver.gecko.driver", path+"\\Library\\drivers\\geckodriver.exe");
    		oBrowser =new FirefoxDriver();
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void navigate()
    {
    	try {
    		oBrowser.get("http://localhost:82/login.do");
    		Thread.sleep(4000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void login()
    {
    	try {
    		oBrowser.findElement(By.id("username")).sendKeys("admin");
    		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
    		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
    		Thread.sleep(4000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void minimizeFlyOutWindow()
    {
    	try {
    		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logout()
    {
    	try {
    		oBrowser.findElement(By.linkText("Logout")).click();
    		Thread.sleep(4000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void closeApplication()
    {
    	try {
    		oBrowser.close();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
