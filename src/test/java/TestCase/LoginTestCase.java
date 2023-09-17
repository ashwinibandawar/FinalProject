package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageobjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

public class LoginTestCase extends BaseClass {
//Added one line for git demo purpose
	
	@Test
	public void VerifyValidLogin() throws InterruptedException {
		
		LoginPageObject lpo = new LoginPageObject(driver);
		
		lpo.enterUserName().sendKeys(Constants.username);
		Thread.sleep(2000);
		
		lpo.enterPassword().sendKeys(Constants.validPassword);
		Thread.sleep(2000);
		
		lpo.ClickOnLogin().click();
		Thread.sleep(2000);
		
		
		
	}

	@Test
	public void verifyInvalidLogin() throws IOException, InterruptedException {
		InitializeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		LoginPageObject lpo = new LoginPageObject(driver);

		lpo.enterUserName().sendKeys(Constants.invalidusername);
		lpo.enterPassword().sendKeys(Constants.invalidPAssword);
		lpo.ClickOnLogin().click();
		CommonMethod.expwait(driver, lpo.ErrorTextMessage(), 10);

		CommonMethod.HandleSoftAssert(lpo.ErrorTextMessage().getText(), Constants.ExpectedErrorText);

		/*
		 * SoftAssert Assert = new SoftAssert(); String expectedErrorText =
		 * "Invalid credentials"; String actualTextError =
		 * driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		 * Assert.assertAll();
		 */
		driver.close();
	}
}
