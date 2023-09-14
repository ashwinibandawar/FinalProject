package Resources;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonMethod {

	public static void HandleSoftAssert(String Actual, String Expected) {

		SoftAssert softAssert = new SoftAssert();
		
		String Actual_PageText =Actual;
		String Expected_PageText = Expected;
		
		softAssert.assertEquals(Actual_PageText, Expected_PageText);
		softAssert.assertAll();
	}
	
	public static void  handleDropdown(List<WebElement> a, String text) {
		
		
		List<WebElement> obj = a;
		for (WebElement k : obj) {
			if (k.getText().equalsIgnoreCase(text)) {
				k.click();
				break;
			}
		}
		
		/*public static void handleDropdown1(List<WebElement> s, String Text) {
			
			

		List<WebElement> obj1 = s;
		for (WebElement b : obj1) {
			
			if (b.getText().equalsIgnoreCase(Text)) {
          b.click();
          break;
			}
		
		}*/
	
		
	}
		
		public  static void expwait(WebDriver driver,WebElement xpath,int timeout) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.elementToBeClickable(xpath));
		
	
}
	
}
