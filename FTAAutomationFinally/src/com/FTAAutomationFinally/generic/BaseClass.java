package com.FTAAutomationFinally.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.FTAAutomationFinally.pom.LoginPg;
import com.FTAAutomationFinally.pom.ServiceRequest;
		public class BaseClass{
		public static WebDriver d;
		 public FileLib f = new FileLib();
		 public  ServiceRequest sr;
		 @BeforeTest
		public void openBrowser() throws IOException
		{
			d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			String url = f.ReadDataFromProp("url");
			d.get(url);
			Reporter.log("openBrowser", true);}
		@BeforeMethod
		public void login() throws IOException {
			LoginPg l = new LoginPg(d);
			String un = f.ReadDataFromProp("un");
			String pwd = f.ReadDataFromProp("pwd");
			l.setlogin(un, pwd);
//			d.findElement(By.xpath("//input[@placeholder ='Enter Email']")).sendKeys(un);
//			d.findElement(By.xpath("//input[@placeholder ='Enter Password']")).sendKeys(pwd);
//			d.findElement(By.xpath("//span[text() ='Sign in']")).click();
			Reporter.log("login", true); 
		}
		@AfterMethod
		public void logout() throws InterruptedException
		{
			Thread.sleep(5000);
			d.findElement(By.xpath("//img[@role=\"button\"]")).click();
			d.findElement(By.xpath("(//div[@role='menu']//a)[3]")).click();
			Reporter.log("logout", true);
		}
		@AfterTest
		public void closebrowser() throws InterruptedException {
			Thread.sleep(5000);
			d.quit();
			Reporter.log("closeBrowser", true);
		}
		}

