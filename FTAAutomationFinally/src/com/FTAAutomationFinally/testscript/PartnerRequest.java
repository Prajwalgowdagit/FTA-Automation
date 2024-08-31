package com.FTAAutomationFinally.testscript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.FTAAutomationFinally.generic.BaseClass;
import com.FTAAutomationFinally.pom.ServiceRequest;

@Listeners(com.FTAAutomationFinally.generic.ListenerImplementation.class)
public class PartnerRequest extends BaseClass{

	@Test
public void PartnerReq() throws InterruptedException {
		Thread.sleep(3000);
		sr=new ServiceRequest(d);
	//	WebDriverUtility w = new WebDriverUtility();
		sr.getReqTkr().click();
		sr.getPendingStatus().click();
		WebElement editRequest = sr.getEditReqBtn();
			boolean res = editRequest.isEnabled();
			System.out.println(res);
//			if(res == true) {
//			System.out.println("The edit request btn is enabled");
//			}
//			else {
//				System.out.println("The edit request btn is disabled");
//			}
			SoftAssert s =  new SoftAssert();
			s.assertEquals(res, true);
			s.assertAll();
		Thread.sleep(5000);
			}
	
	@Test
	public void PartnerReqTwo() throws InterruptedException
	{
		sr=new ServiceRequest(d);
		Thread.sleep(3000);
		sr.getReqTkr().click();
		sr.getCLosedStatus().click();
		WebElement editRequest = sr.getEditReqBtn();
			boolean res = editRequest.isEnabled();
			System.out.println(res);
			SoftAssert s =  new SoftAssert();
			s.assertEquals(res, false);
			s.assertAll();
	}
	
	@Test
	public void PartnerReqThree() throws InterruptedException
	{
		sr=new ServiceRequest(d);
		Thread.sleep(3000);
		sr.getReqTkr().click();
		sr.getInProgressStatus().click();
		WebElement editRequest = sr.getEditReqBtn();
			boolean res = editRequest.isEnabled();
			System.out.println(res);
			SoftAssert s =  new SoftAssert();
			s.assertEquals(res, false);
			s.assertAll();
	}
}
