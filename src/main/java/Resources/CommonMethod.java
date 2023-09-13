package Resources;

import java.time.temporal.WeekFields;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		
		public static void handleDropdown1(List<WebElement> s, String Text) {
			
			

		List<WebElement> obj1 = s;
		for (WebElement b : obj1) {
			if (b.getText().equalsIgnoreCase(Text)) {
          b.click();
          break;
			}
		
		}
	
		}
	}
}
	

