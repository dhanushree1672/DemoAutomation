package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyProject6 {
	public static String filename="D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\ObjectMap\\objectmap.properties";
	  public static ObjectMap objmap=new ObjectMap(filename);
	  public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lounchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deletecustomer();
		logout();
		closeApplication();

	}
	private static void lounchBrowser()
	{

		try {
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			oBrowser.findElement(objmap.getLocator("loginusername")).sendKeys("admin");
			oBrowser.findElement(objmap.getLocator("loginpassword")).sendKeys("manager");
			oBrowser.findElement(objmap.getLocator("loginloginbtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow() {
		try {
			oBrowser.findElement(objmap.getLocator("homepageflyoutwin")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try {
			oBrowser.findElement(objmap.getLocator("selecttasks")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("AddnewButton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("Addcustomer")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("entercustomername")).sendKeys("customer1");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("createcustomerbtn")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try {
			oBrowser.findElement(objmap.getLocator("selecttasks")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("AddnewButton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("addproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("enterprojectname")).sendKeys("project1");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("createprojectbtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyProject()
	{
		try {
			oBrowser.findElement(objmap.getLocator("editbtninproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("modigydescriptioninproject")).sendKeys("It is new Project1");
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("closeeditbuttoninproject")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try {
			oBrowser.findElement(objmap.getLocator("editbtninproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("actionbtninproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("deletebtninproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("projectdeletepermenently")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try {
			oBrowser.findElement(objmap.getLocator("editcustomerbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("actionbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("deletebtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objmap.getLocator("deletepermenentlybtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		 {
			e.printStackTrace();
		 }
	}
	private static void logout()
	{
		try {
			oBrowser.findElement(objmap.getLocator("homepagelogout")).click();
			Thread.sleep(2000);
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
