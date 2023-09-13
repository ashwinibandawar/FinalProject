package PageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	private By userName = By.xpath("//input[@name='username']");
	private By password = By.xpath("//input[@name='password']");
	private By Login = By.xpath("//button[@type='submit']");
	private By Actual_Page_Text = By.xpath("//h6[text()='Dashboard']");
	private By Error_Text_Message = By.xpath("//p[text()='Invalid credentials']");
	
	
	public WebElement enterUserName() {
		return driver.findElement(userName);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement ClickOnLogin() {
		return driver.findElement(Login);
	}
	
	public WebElement ActualText() {
		return driver.findElement(Actual_Page_Text);
		
	}
	public WebElement ErrorTextMessage() {
		return driver.findElement(Error_Text_Message);
		
	}
	
	
	

}
