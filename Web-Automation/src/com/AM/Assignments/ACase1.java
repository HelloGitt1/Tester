package com.AM.Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACase1
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();createUser2();createUser3();
		logout();
		Userlogin1();logout();
		Userlogin2();logout();
		Userlogin3();logout();
		loginadmin1();
		modifyUser1pass();modifyUser2pass();modifyUser3pass();
		logout();
		User1login();logout();
		User2login();logout();
		User3login();logout();
		loginadmin2();
		deleteUser1();deleteUser2();deleteUser3();
		logout();closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumAutomation\\POI\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
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
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginadmin1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("demo1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo2");
			oBrowser.findElement(By.name("lastName")).sendKeys("User2");
			oBrowser.findElement(By.name("email")).sendKeys("demo2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo3");
			oBrowser.findElement(By.name("lastName")).sendKeys("User3");
			oBrowser.findElement(By.name("email")).sendKeys("demo3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Userlogin1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Userlogin2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Userlogin3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser1pass()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User1, demo1']")).click();
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("password")).sendKeys("welcome1");
			oBrowser.findElement(By.name("passwordCopy")).clear();
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser2pass()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User2, demo2']")).click();
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("password")).sendKeys("welcome2");
			oBrowser.findElement(By.name("passwordCopy")).clear();
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome2");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser3pass()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User3, demo3']")).click();
			oBrowser.findElement(By.name("password")).clear();
			oBrowser.findElement(By.name("password")).sendKeys("welcome3");
			oBrowser.findElement(By.name("passwordCopy")).clear();
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome3");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User1login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User2login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome2");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void User3login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome3");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginadmin2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User1, demo1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User2, demo2']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='User3, demo3']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
