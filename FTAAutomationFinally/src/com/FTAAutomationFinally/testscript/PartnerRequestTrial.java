package com.FTAAutomationFinally.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartnerRequestTrial   {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("https://qa-rims-k8s.blubirch.com/");
	d.findElement(By.xpath("//input[@placeholder ='Enter Email']")).sendKeys("dscmumbai2@yopmail.com");
	d.findElement(By.xpath("//input[@placeholder ='Enter Password']")).sendKeys("blubirch123");
	d.findElement(By.xpath("//span[text() ='Sign in']")).click();
	Thread.sleep(3000);
	d.findElement(By.linkText("Request Tracker")).click();
	d.findElement(By.xpath("//span[text()='pending']/../../..//i[@aria-hidden=\"true\"]")).click();
	WebElement editRequest = d.findElement(By.xpath("//span[text()='Edit Request']"));
		boolean res = editRequest.isEnabled();
		if(res== true) {
			System.out.println("The edit request btn is enabled");
		}
		else {
			System.out.println("The edit request btn is disabled");
		}
	Thread.sleep(5000);
	d.findElement(By.xpath("//img[@role=\"button\"]")).click();
	d.findElement(By.xpath("//span[text()='Logout']")).click();
	d.quit();
}
}



//span[text()='Repair Request']
//span[text()='rs-00fd3f']/../../..//span[text()='Repair Request']
//i[@aria-hidden="true"]
//span[text()='rs-00fd3f']/../../..//span[text()='Repair Request']/../../..//i[@aria-hidden="true"]
//span[text()='pending']/../../..//i[@aria-hidden="true"] ===use this
//span[text()='Edit Request']

