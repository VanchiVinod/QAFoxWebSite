package testcases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import baseclass.base;
import pages.AlertsPage;
import pages.MainPage;

public class TC01_Handle_Alerts extends base {
	
	@Test(priority=1)
	public void Handle_Alerts() throws InterruptedException {
		MainPage mp = new MainPage(driver);
		mp.Click_on_Alerts();
		Thread.sleep(1000);
		AlertsPage ap = new AlertsPage(driver);
		ap.Select_Alert();
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
		
	}

}
