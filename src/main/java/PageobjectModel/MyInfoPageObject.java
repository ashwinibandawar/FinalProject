package PageobjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyInfoPageObject {

	public WebDriver driver;

	public MyInfoPageObject(WebDriver driver) {

		this.driver = driver;

	}

	private By myInfo = By.xpath("//span[text()='My Info']");
	private By firstName = By.xpath("//input[@name='firstName']");
	private By MiddleName = By.xpath("//input[@name='middleName']");
	private By lastName = By.xpath("//input[@name='lastName']");
	private By Nickname = By.xpath("(//div[@data-v-957b4417]/input)[4]");
	
	private By enterEmployeename = By.xpath("(//div[@data-v-957b4417]/input)[5]");
	private By enterOtherIDname = By.xpath("(//div[@data-v-957b4417]/input)[6]");
	private By enterDriverLicensnumber = By.xpath("(//div[@data-v-957b4417]/input)[7]");
	private By LicenceExpireDate = By.xpath("//div[@data-v-4a95a2e0]/input[1]");
	private By SSNNumber = By.xpath("(//div[@data-v-957b4417]/input)[8]");
	private By SINNumber = By.xpath("(//div[@data-v-957b4417]/input)[9]");
	
	
	private By NationalityDropdown = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	private By NatiotionalityOptions = By.xpath(("//div[@class='oxd-select-option']"));
	private By MaritalStatus = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
	private By Marital_Status_Dropdown = By.xpath("//div[@class='oxd-select-option']");
	private By Gender = By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]");
	private By Military_Service = By.xpath("(//div[@data-v-957b4417]/input)[10]");
	private By Smoker = By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]");
	private By bloodGroup = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]");
	private By Blood_Type_Dropdown = By.xpath("//div[@class='oxd-select-option']");
	private By AddButton =By.xpath("(//button[@type='button'])[3]");
	private By BrowseFile = By.xpath("//div[@class='oxd-file-button']");
	private By Comment = By.xpath("//textarea[@placeholder='Type comment here']");
			
	
	public WebElement clickOnMyInfo() {
		return driver.findElement(myInfo);

	}

	public WebElement enterFirstName() {
		return driver.findElement(firstName);

	}

	public WebElement enterMiddleName() {
		return driver.findElement(MiddleName);

	}

	public WebElement enterLastName() {
		return driver.findElement(lastName);

	}
	
	public WebElement enterNickname() {
		return driver.findElement(Nickname);
		
	}
	public WebElement enterEmployeename() {
		return driver.findElement(enterEmployeename);
		
	}
	public WebElement enterOtherIDname() {
		return driver.findElement(enterOtherIDname);
		
	}
	public WebElement enterDriverLicensnumber() {
		return driver.findElement(enterDriverLicensnumber);
		
	}
	public WebElement lincenseExpireDate() {
		return driver.findElement(LicenceExpireDate);
		
	}
	public WebElement SSNNumber() {
		return driver.findElement(SSNNumber);
		
	}
	public WebElement enterSINNumber() {
		return driver.findElement(SINNumber);
		
	}
	
	

	public WebElement NationalityDropdown() {
		return driver.findElement(NationalityDropdown);

	}

	public List<WebElement> NationalityOption() {
		return driver.findElements(NatiotionalityOptions);
	}

	public WebElement MaritalStatus() {
		return driver.findElement(MaritalStatus);
	}
	public List<WebElement>Marital_Status_Dropdown_select(){
		return driver.findElements(Marital_Status_Dropdown);
		
	}
	
	
	public WebElement clickOnfemale() {
		return driver.findElement(Gender);
		
	}
	public WebElement EnterMilitary_Service() {
		return driver.findElement(Military_Service);
		
	}
	public WebElement clickonSmoker() {
		return driver.findElement(Smoker);
		
	}
public WebElement clickonBloodGroup() {
	return driver.findElement(bloodGroup);
	
}
	
	public List<WebElement> SelectBloodGroupDropdown() {
		return driver.findElements(Blood_Type_Dropdown);

	}
	
	public WebElement clickonAddButton() {
		return driver.findElement(AddButton);
		
	}
	public WebElement clickonBrowsefile() {
		return driver.findElement(BrowseFile);
		
	}
	public WebElement EnterComment() {
		return driver.findElement(Comment);
		
	}
	
	

}
