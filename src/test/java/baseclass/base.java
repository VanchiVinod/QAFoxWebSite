package baseclass;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	protected WebDriver driver;
	public Logger logger;
		
		
		@BeforeClass
		public void Setup() {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			logger = LogManager.getLogger(this.getClass());
			driver.get("https://demoqa.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().deleteAllCookies();
		}
		
		
		@AfterClass
		public void tearDown() {
			driver.quit();
		}

	}

