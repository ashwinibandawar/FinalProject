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
		Thread.sleep(2000);
		lpo.enterUserName().sendKeys(Constants.username);
		Thread.sleep(2000);
		
		lpo.enterPassword().sendKeys(Constants.validPassword);
		Thread.sleep(2000);
		
		lpo.ClickOnLogin().click();
		
		
		
		
	}

	@Test
	public void verifyInvalidLogin() throws IOException, InterruptedException {
		

		
		LoginPageObject lpo = new LoginPageObject(driver);
		Thread.sleep(2000);
		lpo.enterUserName().sendKeys(Constants.invalidusername);
		Thread.sleep(2000);
		lpo.enterPassword().sendKeys(Constants.invalidPAssword);
		Thread.sleep(2000);
		lpo.ClickOnLogin().click();
		Thread.sleep(2000);
		CommonMethod.HandleSoftAssert(lpo.ErrorTextMessage().getText(), Constants.ExpectedErrorText);

		/*
		 * SoftAssert Assert = new SoftAssert(); String expectedErrorText =
		 * "Invalid credentials"; String actualTextError =
		 * driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		 * Assert.assertAll();
		 */
		
	}
}
