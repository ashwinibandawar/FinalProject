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

	@Test

	public void verifyValidLogin() throws IOException, InterruptedException {

		InitializeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);
		LoginPageObject lpo = new LoginPageObject(driver);

		lpo.enterUserName().sendKeys(Constants.username);
		lpo.enterPassword().sendKeys(Constants.validPassword);
		lpo.ClickOnLogin().click();
		Thread.sleep(2000);
		
		CommonMethod.HandleSoftAssert(lpo.ActualText().getText(),Constants.ExpectedText );

		

		driver.close();
	}

	@Test
	public void verifyInvalidLogin() throws IOException, InterruptedException {
		InitializeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);
		LoginPageObject lpo = new LoginPageObject(driver);

		lpo.enterUserName().sendKeys(Constants.invalidusername);
		lpo.enterPassword().sendKeys(Constants.invalidPAssword);
		lpo.ClickOnLogin().click();
		Thread.sleep(2000);
		
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
