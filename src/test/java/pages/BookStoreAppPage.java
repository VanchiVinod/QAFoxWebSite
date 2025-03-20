package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.base;

public class BookStoreAppPage extends base {
	
	WebDriver driver;
	
	//constructor	
	public BookStoreAppPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(xpath = "//span[text()='Login']") WebElement BookStoreLogin;
	@FindBy(xpath = "//button[@id='newUser']") WebElement NewUser_button;
	@FindBy(xpath = "//input[@id='userName']") WebElement UserName;
	@FindBy(xpath = "//input[@id='password']") WebElement Password;
	@FindBy(xpath = "//button[@id='login']") WebElement Login_button;
	
	
	//Methods
	public void Click_Login() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", BookStoreLogin);
	}
	
	public void Click_NewUser() {
		NewUser_button.click();
	}
	
	public void Enter_UserName() {
		UserName.sendKeys("Meenu");
	}
	
	public void Enter_Password() {
		Password.sendKeys("Meenu@1996");
	}
	
	public void Click_Loginbtn() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Login_button);
	}

}
