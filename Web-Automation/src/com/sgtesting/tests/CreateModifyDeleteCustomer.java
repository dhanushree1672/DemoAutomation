package com.sgtesting.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateModifyDeleteCustomer {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyPutWindow();
		createCustomer();
		modifyCustomer();
		deleteCustomer();
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
    private static void createCustomer()
    {
    	try {
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[1]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Dhanushree");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Dhanushree is a Customer");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
    		Thread.sleep(2000);
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void modifyCustomer()
    {
    	try {
    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//div[text()='Archived']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void deleteCustomer()
    {
    	try {
    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
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

		