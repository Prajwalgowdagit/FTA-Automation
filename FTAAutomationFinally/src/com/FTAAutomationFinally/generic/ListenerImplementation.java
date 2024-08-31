package com.FTAAutomationFinally.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener{

//	@Override
//	public void onTestStart(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
//	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String res = result.getName();
		Reporter.log(res +" has been passed", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String res = result.getName();
		Reporter.log(res +" has been failed", true);
		TakesScreenshot ts = (TakesScreenshot)d;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshot/"+res+".png");
		 try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
		}
	}

//	@Override
//	public void onTestSkipped(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestSkipped(result);
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
//	}
//
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
//	}
//
//	@Override
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onStart(context);
//	}
//
//	@Override
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onFinish(context);
//	}

}
