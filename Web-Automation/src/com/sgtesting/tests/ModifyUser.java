package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUser {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyPutWindow();
		createUser();
		modifyeUser();
		deleteUser();
		logout();
		closeApplication();
	}
		private static void launchBrowser()
		{
			try {
				String path=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void navigate()
		{
			try {
				oBrowser.navigate().to("http://localhost:82/login.do");
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
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	    private static void minimizeFlyPutWindow()
	    {
	    	try {
	    		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
	    		Thread.sleep(2000);
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	    private static void createUser()
	    {
	    	try {
	    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
	    		Thread.sleep(2000);
	    		oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
				Thread.sleep(2000);
	    		oBrowser.findElement(By.name("firstName")).sendKeys("Dhanu");
	    		Thread.sleep(2000);
	    		oBrowser.findElement(By.name("lastName")).sendKeys("Shree");
	    		Thread.sleep(2000);
	    		oBrowser.findElement(By.name("email")).sendKeys("Dhanushree1672@gmail.com");
	    		Thread.sleep(2000);
	    		oBrowser.findElement(By.name("username")).sendKeys("admin6");
	    		Thread.sleep(2000);
	    		oBrowser.findElement(By.name("password")).sendKeys("manager");
	    		Thread.sleep(2000);
	    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("manager");
	    		Thread.sleep(2000);
	    		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
	    		Thread.sleep(2000);	
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    		}
	    }
	    private static void modifyeUser()
	    {
	    	try {
	    		oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[4]")).click();
	    		Thread.sleep(2000);	
	    		//oBrowser.findElement(By.xpath("//*[@id=\"ext-gen241\"]")).click();
	    		//Thread.sleep(2000);
	    		oBrowser.findElement(By.xpath("//*[@id=\"usersForApproverDialog_cancelButton\"]/span")).click();
	    		Thread.sleep(2000);
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    		}
	    }
	    private static void deleteUser()
	    {
	    	try {
	    		oBrowser.findElement(By.xpath("//span[text()='Shree, Dhanu']")).click();
	    		Thread.sleep(2000);
	    		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
	    		Thread.sleep(2000);
	    		Alert oAlert=oBrowser.switchTo().alert();
				String strContent=oAlert.getText();
				System.out.println(strContent);
				oAlert.accept();
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


