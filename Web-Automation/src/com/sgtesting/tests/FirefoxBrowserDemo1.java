package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo1 {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		closeApplication();
	}
	private static void LaunchBrowser()
	{
		try {
			System.setProperty("webdriver.gecko.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser = new FirefoxDriver();
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
