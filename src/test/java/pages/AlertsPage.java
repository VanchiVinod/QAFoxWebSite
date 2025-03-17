package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AlertsPage {
	
	WebDriver driver;
	
	public AlertsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Elements
	@FindBy(xpath = "//span[text()='Alerts']") WebElement Alerts;
	@FindBy(xpath = "//button[@id='alertButton']") WebElement Simple_Alert_button;
	@FindBy(xpath = "//button[@id='timerAlertButton']") WebElement Timer_Alert_button;
	@FindBy(xpath = "//button[@id='confirmButton']") WebElement Confirm_button;
	@FindBy(xpath = "//button[@id='promtButton']") WebElement Prompt_button;
	
	//Methods
	public void Select_Alert() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Alerts);
	}
	
	public void SimpleAlert() {
		Simple_Alert_button.click();
	}
	
	public void TimerAlert() {
		Timer_Alert_button.click();
	}
	
	public void ConfirmAlert() {
		Confirm_button.click();
	}
	
	public void PromptAlert() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Prompt_button);
	}

}
