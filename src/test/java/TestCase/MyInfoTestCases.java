package TestCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageobjectModel.LoginPageObject;
import PageobjectModel.MyInfoPageObject;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

public class MyInfoTestCases extends BaseClass {

	@Test
	public void fillPersonalDetails() throws IOException, InterruptedException, AWTException {
		InitializeDriver();
         driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);
		LoginPageObject lpo = new LoginPageObject(driver);

		lpo.enterUserName().sendKeys(Constants.username);
		lpo.enterPassword().sendKeys(Constants.validPassword);
		lpo.ClickOnLogin().click();
		Thread.sleep(2000);

		MyInfoPageObject mpo = new MyInfoPageObject(driver);
		Thread.sleep(2000);

		mpo.clickOnMyInfo().click();

		Thread.sleep(2000);

		mpo.enterFirstName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterFirstName().sendKeys("Ashwini");
		Thread.sleep(2000);

		mpo.enterMiddleName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterMiddleName().sendKeys("Digambar");
		Thread.sleep(2000);

		mpo.enterLastName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterLastName().sendKeys("bandawar");
		Thread.sleep(2000);

		mpo.enterNickname().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterNickname().sendKeys("Ashu");
		Thread.sleep(2000);

		mpo.enterEmployeename().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterEmployeename().sendKeys("0045");
		Thread.sleep(2000);
		mpo.enterOtherIDname().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterOtherIDname().sendKeys("012");
		Thread.sleep(2000);
		mpo.enterDriverLicensnumber().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.enterDriverLicensnumber().sendKeys("3245");
		mpo.lincenseExpireDate().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.lincenseExpireDate().sendKeys("8/10/2020");
		mpo.SSNNumber().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mpo.SSNNumber().sendKeys("123");
		mpo.enterSINNumber().sendKeys("456");
		Thread.sleep(2000);

		mpo.NationalityDropdown().click();
		Thread.sleep(2000);
        
		CommonMethod.handleDropdown(mpo.NationalityOption(), "Indian");
		
		

		//mpo.MaritalStatus().click();
		//Thread.sleep(2000);
		
		//CommonMethod.handleDropdown(mpo.Marital_Status_Dropdown_select(), "Single");

		/*List<WebElement> obj1 = mpo.Marital_Status_Dropdown_select();
		for (WebElement b : obj1) {
			if (b.getText().equalsIgnoreCase("Single")) {
          b.click();
          break;
			}

		}*/

		mpo.clickOnfemale().click();
		Thread.sleep(2000);

		mpo.EnterMilitary_Service().sendKeys("Yes");
		Thread.sleep(2000);
		
		mpo.clickonSmoker().click();
		Thread.sleep(2000);
		
		mpo.clickonBloodGroup().click();
		Thread.sleep(2000);
		
		 List<WebElement> obj2 = mpo.SelectBloodGroupDropdown();
		 for (WebElement c : obj2) { 
			 if(c.getText().equalsIgnoreCase("O+")) { 
			 c.click(); 
			 break;
			 }
		 }
		 mpo.clickonAddButton().click();
		 Thread.sleep(2000);
			
		 mpo.clickonBrowsefile().click();
		 Thread.sleep(2000);
			
		 
		 Robot robot = new Robot(); 
		  Thread.sleep(2000); 
		 
		  // To perform CTRL + C action to copy file. 
		 
		  StringSelection stringSelection = new StringSelection("C:\\Users\\Jagdish\\Downloads\\Sample PDF file (11).pdf"); 
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null); 
		  Thread.sleep(2000); 
		 
		  // To perform CTRL + V action 
		 
		  robot.keyPress(KeyEvent.VK_CONTROL); 
		  robot.keyPress(KeyEvent.VK_V); 
		 
		  robot.keyRelease(KeyEvent.VK_CONTROL); 
		  robot.keyRelease(KeyEvent.VK_V); 
		 
		  robot.keyPress(KeyEvent.VK_ENTER); 
		  robot.keyRelease(KeyEvent.VK_ENTER); 
		  Thread.sleep(2000); 
		 
		  mpo.EnterComment().sendKeys("PDF File Attached Succesfully... "); 
		  Thread.sleep(2000); 
		 
		  // driver.close();
		 
	}
}
