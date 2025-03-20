package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import baseclass.base;
import pages.AlertsPage;
import pages.MainPage;

public class TC01_Handle_Alerts extends base {
	
	public Logger logger;
	
	@Test(priority=1)
	public void Handle_Alerts() throws InterruptedException {
		logger = LogManager.getLogger(this.getClass());
		logger.info("********** Starting TC001 Handling Alerts ***********");
		MainPage mp = new MainPage(driver);
		mp.Click_on_Alerts();
		logger.info("Navigating to Alert page");
		Thread.sleep(1000);
		
		AlertsPage ap = new AlertsPage(driver);
		ap.Select_Alert();
		logger.info("Clicked on Alert Options");
		Thread.sleep(1000);
		
		ap.SimpleAlert();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		
		ap.TimerAlert();
		Thread.sleep(5000);
		alert.accept();
		Thread.sleep(1000);
		
		ap.ConfirmAlert();
		alert.dismiss();
		Thread.sleep(1000);
		
		ap.PromptAlert();
		alert.sendKeys("Vinod");
		alert.accept();
		
		logger.info("******Successfully Completed Alerts TestCases********");
		
	}

}
