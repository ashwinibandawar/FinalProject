package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;

	Properties prop;

	public void InitializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Jagdish\\eclipse-workspace\\Atomationframework\\src\\main\\java\\Resources\\Data.Properties");

	     prop = new Properties();

		prop.load(fis);

		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (BrowserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		} else if (BrowserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("please choose correct browser");
		}
	}
		
		@BeforeMethod
		public void LaunchURL() throws IOException {
			
			InitializeDriver();
			driver.get(prop.getProperty("url"));
			
			
		}
		
		
	}

