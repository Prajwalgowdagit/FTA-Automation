package com.FTAAutomationFinally.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceRequest {
	@FindBy(linkText = "Request Tracker")
	private WebElement ReqTkr;
	
	@FindBy(xpath = "//span[text()='pending']/../../..//i[@aria-hidden=\"true\"]")
	private	WebElement	PendingStatus;
	
	@FindBy(xpath = "//span[text()='closed']/../../..//i[@aria-hidden=\"true\"]")
private WebElement ClosedStatus;
	
	@FindBy(xpath = "//span[text()='in_progress']/../../..//i[@aria-hidden=\"true\"]")
	private WebElement InProgressStatus;
	
	@FindBy(xpath = "//span[text()='Edit Request']/..")
	private	WebElement	EditReqBtn;
	
	public ServiceRequest(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	public WebElement getReqTkr() {
		return ReqTkr;
	}

	public WebElement getPendingStatus() {
		return PendingStatus;
	}
	public WebElement getCLosedStatus() {
		return ClosedStatus;
	}
	public WebElement getInProgressStatus() {
		return InProgressStatus;
	}
	
	public WebElement getEditReqBtn() {
		return EditReqBtn;
	}
	
	}
