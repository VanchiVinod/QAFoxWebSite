package testcases;

import java.time.Duration;
import org.testng.annotations.Test;
import baseclass.base;
import pages.BookStoreAppPage;
import pages.MainPage;

public class TC02_LoginToBookStore extends base{
	

	@Test()
	public void LoginToStore() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		MainPage mp = new MainPage(driver);
		mp.Click_BootStore();
		
		BookStoreAppPage bs = new BookStoreAppPage(driver);
		bs.Click_Login();
		Thread.sleep(1000);
		
		bs.Enter_UserName();
		Thread.sleep(1000);
		bs.Enter_Password();
		Thread.sleep(1000);
		bs.Click_Loginbtn();
		Thread.sleep(1000);
	}

}
