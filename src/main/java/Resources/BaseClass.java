package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public WebDriver driver;

	public void InitializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Jagdish\\eclipse-workspace\\Atomationframework\\src\\main\\java\\Resources\\Data.Properties");

		Properties prop = new Properties();

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
}
