package com.AM.Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACase2 {
	public static WebDriver browser=null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		loginadmin();
		createuser1();
		logout();
		loginuser1();
		createuser2();
		logout();
		loginuser2();
		createuser3();
		logout();
		loginuser3();
		logout();
		loginuser22();
		Modifyuser3(); 
		logout();
		loginuser33(); 
		logout();
		loginuser11(); 
		Modifyuser2(); 
		logout();
		loginuser222(); 
		logout1();
		loginadmin(); 
		Modifyuser1(); 
		logout();
		loginuser111(); 
		Deleteuser3(); 
		Deleteuser2(); 
		logout();
		loginadmin(); 
		Deleteuser1(); 
		logout(); 
		closebrowser();
	}
	private static void launchbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\POI\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			browser = new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			browser.get("http://localhost:82/login.do");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginadmin()
	{
		try {
			browser.findElement(By.name("username")).sendKeys("admin");
			browser.findElement(By.name("pwd")).sendKeys("manager");
			browser.findElement(By.xpath("//div[text()='Login ']")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createuser1() {
		try {
			browser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			browser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			browser.findElement(By.name("firstName")).sendKeys("Sample");
			browser.findElement(By.name("lastName")).sendKeys("Account1");
			browser.findElement(By.name("email")).sendKeys("Sampleaccount@gmail.com");
			browser.findElement(By.name("username")).sendKeys("Sampleuser1");
			browser.findElement(By.name("password")).sendKeys("Sampleuser1");
			browser.findElement(By.name("passwordCopy")).sendKeys("Sampleuser1");
			browser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			browser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser1()
	{
		try {
			browser.findElement(By.name("username")).sendKeys("Sampleuser1");
			browser.findElement(By.name("pwd")).sendKeys("Sampleuser1");
			browser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			browser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createuser2()
	{
		try {
			browser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			browser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			browser.findElement(By.name("firstName")).sendKeys("Sample");
			browser.findElement(By.name("lastName")).sendKeys("Account2");
			browser.findElement(By.name("email")).sendKeys("sampleaccount2@gmail.com");
			browser.findElement(By.name("username")).sendKeys("Sampleuser2");
			browser.findElement(By.name("password")).sendKeys("Sampleuser2");
			browser.findElement(By.name("passwordCopy")).sendKeys("Sampleuser2");
			browser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser2()
	{
		try {browser.findElement(By.name("username")).sendKeys("Sampleuser2");
		browser.findElement(By.name("pwd")).sendKeys("Sampleuser2");
		browser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		browser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createuser3()
	{
		try {
			browser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			browser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			browser.findElement(By.name("firstName")).sendKeys("Sample");
			browser.findElement(By.name("lastName")).sendKeys("Account3");
			browser.findElement(By.name("email")).sendKeys("sampleaccount3@gmail.com");
			browser.findElement(By.name("username")).sendKeys("Sampleuser3");
			browser.findElement(By.name("password")).sendKeys("Sampleuser3");
			browser.findElement(By.name("passwordCopy")).sendKeys("Sampleuser3");
			browser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser3()
	{
		try {browser.findElement(By.name("username")).sendKeys("Sampleuser3");
		browser.findElement(By.name("pwd")).sendKeys("Sampleuser3");
		browser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		browser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser22()
	{
		try {browser.findElement(By.name("username")).sendKeys("Sampleuser2");
		browser.findElement(By.name("pwd")).sendKeys("Sampleuser2");
		browser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Modifyuser3()
	{
		try {
			browser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			browser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			browser.findElement(By.name("password")).clear();
			browser.findElement(By.name("password")).sendKeys("Sampleuser33");
			browser.findElement(By.name("passwordCopy")).sendKeys("Sampleuser33");
			browser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser33()
	{
		try {browser.findElement(By.name("username")).sendKeys("Sampleuser3");
		browser.findElement(By.name("pwd")).sendKeys("Sampleuser33");
		browser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser11()
	{
		try {
			browser.findElement(By.name("username")).sendKeys("Sampleuser1");
			browser.findElement(By.name("pwd")).sendKeys("Sampleuser1");
			browser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Modifyuser2()
	{
		try {
			browser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			browser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			browser.findElement(By.name("password")).clear();
			browser.findElement(By.name("password")).sendKeys("Sampleuser22");
			browser.findElement(By.name("passwordCopy")).clear();
			browser.findElement(By.name("passwordCopy")).sendKeys("Sampleuser22");
			browser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser222()
	{
		try {browser.findElement(By.name("username")).sendKeys("Sampleuser2");
		browser.findElement(By.name("pwd")).sendKeys("Sampleuser22");
		browser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void  logout1()
	{
		try {
			browser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Modifyuser1()
	{
		try {
			browser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			browser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			browser.findElement(By.name("password")).clear();
			browser.findElement(By.name("password")).sendKeys("Sampleuser11");
			browser.findElement(By.name("passwordCopy")).clear();
			browser.findElement(By.name("passwordCopy")).sendKeys("Sampleuser11");
			browser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginuser111()
	{
		try {
			browser.findElement(By.name("username")).sendKeys("Sampleuser1");
			browser.findElement(By.name("pwd")).sendKeys("Sampleuser11");
			browser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deleteuser3()
	{
		try {
			browser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			browser.findElement(By.xpath("//span[text()='Account3, Sample']")).click();
			Thread.sleep(2000);
			browser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=browser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deleteuser2()
	{
		try {
			browser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			browser.findElement(By.xpath("//span[text()='Account2, Sample']")).click();
			Thread.sleep(2000);
			browser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=browser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deleteuser1() {
		try {
			browser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			browser.findElement(By.xpath("//span[text()='Account1, Sample']")).click();
			Thread.sleep(2000);
			browser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=browser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closebrowser()
	{
		try {
			browser.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
