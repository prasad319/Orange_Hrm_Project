package test_objects;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmAdminModulePage {
 WebDriver driver;
 @FindBy(xpath = "//input[@placeholder='Username']")
 WebElement usernameField1;
 @FindBy(xpath = "//input[@placeholder='Password']")
 WebElement passwordField1;
 @FindBy(xpath = "//button[normalize-space()='Login']")
 WebElement loginBtn;
 @FindBy(xpath = "//span[text()=\"Admin\"]")
 WebElement admin;
 @FindBy(xpath = "//span[normalize-space()='User Management']")
 WebElement userManagement;
 @FindBy(xpath = "//a[normalize-space()='Users']")
 WebElement userOption;
 @FindBy(xpath = "//button[normalize-space()='Reset']")
 WebElement resetBtn1;
 @FindBy(xpath = "//h5[normalize-space()='System Users']")
 WebElement systemUserText;
 @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
 WebElement usernameField2;
 @FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
 WebElement userRoleDropdown1;
 @FindBy(xpath = "//input[@placeholder='Type for hints...']")
 WebElement employeeNameField1;
 @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]")
 WebElement statusDropdown1;
 @FindBy(xpath = "//button[normalize-space()='Search']")
 WebElement searchBtn1;
 @FindBy(xpath = "//button[normalize-space()='Add']")
 WebElement addOption;
 @FindBy(xpath = "//button[normalize-space()='Add']")
 WebElement cancelBtn1;
 @FindBy(xpath = "//h6[normalize-space()='Add User']")
 WebElement addUserText;
 @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
 WebElement userRoleDrodown2;
 @FindBy(xpath = "//input[@placeholder='Type for hints...']")
 WebElement employeeNameField2;
 @FindBy(xpath = "//div[contains(text(),'-- Select --')]")
 WebElement statusDropdown2;
 @FindBy(xpath = "//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
 WebElement usernameField3;
 @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
 WebElement passwordField2;
 @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
 WebElement confirmPasswordField;
 @FindBy(xpath = "//button[normalize-space()='Save']")
 WebElement saveBtn1;
 public OrangeHrmAdminModulePage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 public void loginToAccount(String usernameInput,String passwordInput) {
	 try {
		usernameField1.sendKeys(usernameInput);
		passwordField1.sendKeys(passwordInput);
		loginBtn.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 } 
 public void validateSystemUserOption(String usernameInput,String empnameInput) {
	 try {
		admin.click();
		userManagement.click();
		userOption.click();
		String actualText1 = systemUserText.getText();
		String expectedText1="System Users";
		assertEquals(actualText1, expectedText1,"Text Mismatched");
		resetBtn1.click();
		usernameField2.sendKeys(usernameInput);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		act.moveToElement(wait.until(ExpectedConditions.visibilityOf(userRoleDropdown1))).click().perform();
		act.pause(Duration.ofSeconds(2));
		for (int i = 0; i < 1; i++) {
			act.pause(Duration.ofSeconds(2));
			act.keyDown(Keys.DOWN).perform();
		}
		for (int i = 0; i < 1; i++) {
			act.pause(Duration.ofSeconds(2));
			act.keyDown(Keys.UP).perform();
		}
		act.keyDown(Keys.ENTER).perform();
		act.pause(Duration.ofSeconds(2));
		employeeNameField1.sendKeys(empnameInput);
		act.moveToElement(wait.until(ExpectedConditions.visibilityOf(statusDropdown1))).click().perform();
		act.pause(Duration.ofSeconds(2));
		for (int i = 0; i < 1; i++) {
			act.pause(Duration.ofSeconds(2));
			act.keyDown(Keys.DOWN).perform();
		}
		for (int i = 0; i < 1; i++) {
			act.pause(Duration.ofSeconds(2));
			act.keyDown(Keys.UP).perform();
		}
		act.keyDown(Keys.ENTER).perform();
		act.pause(Duration.ofSeconds(2));
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void validateAddUserOption(String empnameInput,String usernameInput,String passwordInput,String confirmpassInput) {
	try {
		addOption.click();
		String actualText1 = addUserText.getText();
		String expectedText1="Add User";
		assertEquals(actualText1, expectedText1,"Text Mismatched");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		act.moveToElement(wait.until(ExpectedConditions.visibilityOf(userRoleDrodown2))).click().perform();
		for (int i = 0; i < 1; i++) {
			act.pause(Duration.ofSeconds(2));
			act.keyDown(Keys.DOWN).perform();
		}
		for (int i = 0; i < 1; i++) {
			act.pause(Duration.ofSeconds(2));
			act.keyDown(Keys.UP).perform();
		}
		act.keyDown(Keys.ENTER).perform();
		act.pause(Duration.ofSeconds(2));
		employeeNameField2.sendKeys(empnameInput);
		act.moveToElement(wait.until(ExpectedConditions.visibilityOf(statusDropdown2))).click().perform();
		act.pause(Duration.ofSeconds(2));
		for (int i = 0; i < 1; i++) {
			act.keyDown(Keys.DOWN).perform();
			act.pause(Duration.ofSeconds(2));
		}
		for (int i = 0; i < 1; i++) {
			act.keyDown(Keys.UP).perform();
			act.pause(Duration.ofSeconds(2));
		}
		act.keyDown(Keys.ENTER).perform();
		act.pause(Duration.ofSeconds(2));
		usernameField3.sendKeys(usernameInput);
		passwordField2.sendKeys(passwordInput);
		confirmPasswordField.sendKeys(confirmpassInput);
		saveBtn1.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} 
 }
 public void validateJobTitleOption() {
	try {
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }	
}
