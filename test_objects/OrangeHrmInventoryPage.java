package test_objects;

import static org.testng.Assert.assertEquals;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Duration;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class OrangeHrmInventoryPage {
 WebDriver driver;
 @FindBy(xpath = "//input[@placeholder='Username']")
 WebElement usernameField;
 @FindBy(xpath = "//input[@placeholder='Password']")
 WebElement passwordField;
 @FindBy(xpath = "//button[normalize-space()='Login']")
 WebElement loginBtn;
 @FindBy(xpath = "//a[normalize-space()='Logout']")
 WebElement logoutOption;
 @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
 WebElement dropdownOption;
 @FindBy(xpath = "//a[normalize-space()='About']")
 WebElement aboutOption;
 @FindBy(xpath = "//div[@class='oxd-grid-2 orangehrm-about']//div[2]//p[1]")
 WebElement companyNameText;
 @FindBy(xpath ="//p[@class='oxd-text oxd-text--p orangehrm-about-text'][normalize-space()='OrangeHRM OS 5.6.1']" )
 WebElement versionText;
 @FindBy(xpath = "//button[normalize-space()='×']")
 WebElement cancelBtn1;
 @FindBy(xpath = "//a[normalize-space()='Support']")
 WebElement supportOption;
 @FindBy(xpath = "//a[normalize-space()='ossupport@orangehrm.com']")
 WebElement customerSupportLink;
 @FindBy(xpath = "//a[normalize-space()='Change Password']")
 WebElement changePasswordOption;
 @FindBy(xpath = "//h6[normalize-space()='Update Password']")
 WebElement updatePasswordText;
 @FindBy(xpath = "(//input[@type='password'])[1]")
 WebElement currentPasswordField;
 @FindBy(xpath = "(//input[@type='password'])[2]")
 WebElement newPasswordField;
 @FindBy(xpath = "(//input[@type='password'])[3]")
 WebElement confirmPasswordField;
 @FindBy(xpath="//button[normalize-space()='Cancel']")
 WebElement cancelBtn2;
 @FindBy(xpath = "//button[normalize-space()='Save']")
 WebElement saveBtn;
 @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-user-name']")
 WebElement usernameAdminText;
 @FindBy(xpath = "//p[@class='oxd-text oxd-text--p user-password-hint']")
 WebElement passwordHintText;
 @FindBy(xpath = "(//img[@alt='client brand banner'])[1]")
 WebElement orangeHrmLogo;
 @FindBy(xpath = "//input[@placeholder='Search']")
 WebElement searchBar;
 @FindBy(xpath = "//span[text()=\"Admin\"]")
 WebElement adminOption;
 @FindBy(xpath = "//span[normalize-space()='PIM']")
 WebElement pimOption;
 @FindBy(xpath = "//span[normalize-space()='Leave']")
 WebElement leaveOption;
 @FindBy(xpath = "//span[normalize-space()='Time']")
 WebElement timeOption;
 @FindBy(xpath = "//span[normalize-space()='Recruitment']")
 WebElement recruitmentOption;
 @FindBy(xpath = "//span[normalize-space()='My Info']")
 WebElement myInfoOption;
 @FindBy(xpath = "//span[normalize-space()='Performance']")
 WebElement performanceOption;
 @FindBy(xpath = "//span[normalize-space()='Directory']")
 WebElement directoryOption;
 @FindBy(xpath = "//span[normalize-space()='Maintenance']")
 WebElement maintenanceOption;
 @FindBy(xpath = "//span[normalize-space()='Claim']")
 WebElement claimOption;
 @FindBy(xpath = "//span[normalize-space()='Buzz']")
 WebElement buzzOption;
 @FindBy(xpath = "//i[@class='oxd-icon bi-chevron-left']")
 WebElement dashboardCloseOption;
 @FindBy(xpath = "//p[normalize-space()='Time at Work']")
 WebElement timeAtWorkOption;
 @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-attendance-card-state']")
 WebElement punchedOutText;
 @FindBy(xpath="//i[@class='oxd-icon bi-stopwatch']")
 WebElement stopwatchIcon;
 @FindBy(xpath = "//p[normalize-space()='This Week']")
 WebElement thisWeekText;
 @FindBy(xpath = "//div[@class='emp-attendance-chart']//canvas")
 WebElement attendanceChart;
 @FindBy(xpath = "//p[normalize-space()='My Actions']")
 WebElement myActionOption;
 @FindBy(xpath = "//p[normalize-space()='(1) Pending Self Review']")
 WebElement pendingSelfReview;
 @FindBy(xpath = "//p[normalize-space()='(1) Candidate to Interview']")
 WebElement candidateToInterview;
 @FindBy(xpath = "//p[normalize-space()='Quick Launch']")
 WebElement quickLaunchText;
 @FindBy(xpath = "//button[@title='Assign Leave']//*[name()='svg']")
 WebElement assignLeave;
 @FindBy(xpath = "//button[@title='Leave List']//*[name()='svg']")
 WebElement leaveList;
 @FindBy(xpath = "//button[@title='Timesheets']//*[name()='svg']")
 WebElement timesheet;
 @FindBy(xpath ="//button[@title='Apply Leave']//*[name()='svg']//*[name()='g' and contains(@fill,'currentCol')]//*[name()='path' and contains(@class,'cls-1')]" )
 WebElement applyLeave;
 @FindBy(xpath ="//button[@title='My Leave']//*[name()='svg']" )
 WebElement myLeave;
 @FindBy(xpath = "//button[@title='My Timesheet']//*[name()='svg']//*[name()='g' and contains(@fill,'currentCol')]//*[name()='path' and contains(@class,'cls-1')]")
 WebElement myTimesheet;
 @FindBy(xpath = "//p[normalize-space()='Buzz Latest Posts']")
 WebElement buzzLatestPostText;
 @FindBy(xpath = "//p[normalize-space()='Employees on Leave Today']")
 WebElement employeesOnLeaveToday;
 @FindBy(xpath = "//i[@class='oxd-icon bi-gear-fill orangehrm-leave-card-icon']")
 WebElement configurationIcon;
 @FindBy(xpath = "//img[@alt='No Content']")
 WebElement noContentImage;
 @FindBy(xpath = "//p[normalize-space()='No Employees are on Leave Today']")
 WebElement noEmployeesOnLeaveTodayText;
 @FindBy(xpath = "//label[contains(text(),'Only show accessible employees on leave for other ')]")
 WebElement configurationText;
 @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
 WebElement switchBtn;
 @FindBy(xpath = "//button[normalize-space()='Cancel']")
 WebElement cancelBtn3;
 @FindBy(xpath = "//button[normalize-space()='Save']")
 WebElement saveBtn2;
 @FindBy(xpath = "//p[normalize-space()='Employee Distribution by Sub Unit']")
 WebElement employeeDistributionBySubUnit;
 @FindBy(xpath = "//span[@title='Engineering']")
 WebElement engineering;
 @FindBy(xpath = "//span[@title='Human Resources']")
 WebElement humanResources;
 @FindBy(xpath = "//span[@title='Administration']")
 WebElement administration;
 @FindBy(xpath = "//span[@title='Client Services']")
 WebElement clientServices;
 @FindBy(xpath = "(//span[@title=\"Unassigned\"])[1]")
 WebElement unassigned;
 @FindBy(xpath = "//p[normalize-space()='Employee Distribution by Location']")
 WebElement employeeDistributionByLocation;
 @FindBy(xpath = "//span[@title='Texas R&D']")
 WebElement texasRnD;
 @FindBy(xpath = "//span[@title='New York Sales Office']")
 WebElement newYorkSalesOffice;
 @FindBy(xpath = "(//span[@title=\"Unassigned\"])[2]")
 WebElement unassigned2;
 public OrangeHrmInventoryPage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 public void loginToAccount(String usernameInput,String passwordInput) {
	 try {
		usernameField.sendKeys(usernameInput);
		passwordField.sendKeys(passwordInput);
		loginBtn.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void verifyLogoutUserSuccessfully() {
	 try {
		 dropdownOption.click();
		 logoutOption.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void validateDropdownOption(String currentpassInput,String newpassInput,String confirmpassInput) {
	 try {
		dropdownOption.click();
		aboutOption.click();
		String actualText1 = companyNameText.getText();
		String expectedText1="OrangeHRM";
		assertEquals(actualText1,expectedText1,"Text Mismatched");
		String actualText2 = versionText.getText();
		String expectedText2="OrangeHRM OS 5.6.1";
		assertEquals(actualText2,expectedText2,"Text Mismatched");
		cancelBtn1.click();
		dropdownOption.click();
		supportOption.click();
		customerSupportLink.click();
		driver.navigate().back();
		dropdownOption.click();
		changePasswordOption.click();
		String actualText3 = updatePasswordText.getText();
		String expectedText3="Update Password";
		assertEquals(actualText3, expectedText3,"Text Mismatched");
		cancelBtn2.click();
		dropdownOption.click();
		changePasswordOption.click();
		String actualText4 = usernameAdminText.getText();
		String expectedText4="Admin";
		assertEquals(actualText4, expectedText4,"Text Mismatched");
		currentPasswordField.click();
		currentPasswordField.sendKeys(currentpassInput);
		newPasswordField.click();
		newPasswordField.sendKeys(newpassInput);
		confirmPasswordField.click();
		confirmPasswordField.sendKeys(confirmpassInput);
		String actualText5 = passwordHintText.getText();
		String expectedText5="For a strong password, please use a hard to guess combination of text with upper and lower case characters, symbols and numbers";
		assertEquals(actualText5, expectedText5,"Text Mismatched");
		saveBtn.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void validateDashboard(String searchInput) {
	try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		Screenshot orangeHrmLogoImage = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,wait.until(ExpectedConditions.visibilityOf(orangeHrmLogo)));
		ImageIO.write(orangeHrmLogoImage.getImage(), "png", new File("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Screenshot\\OrangehrmLogo3.png"));
		BufferedImage actualImage = orangeHrmLogoImage.getImage();
		BufferedImage expectedImage = ImageIO.read(new File("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Screenshot\\OrangehrmLogo3.png"));
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);
		if (diff.hasDiff()==true) {
			System.out.println("Image same");
		}else {
			System.out.println("Image not same");
		}
		String actualText1 = searchBar.getAttribute("placeholder");
		String expectedText1="Search";
		assertEquals(actualText1, expectedText1,"Text Mismatched");
		searchBar.click();
		searchBar.sendKeys(searchInput);
		driver.navigate().refresh();
		String actualText2 = adminOption.getText();
		String expectedText2="Admin";
		assertEquals(actualText2, expectedText2,"Text Mismatched");
		adminOption.click();
		driver.navigate().back();
		String actualText3 = pimOption.getText();
		String expectedText3="PIM";
		assertEquals(actualText3, expectedText3,"Text Mismatched");
		pimOption.click();
		driver.navigate().back();
		String actualText4 = leaveOption.getText();
		String expectedText4="Leave";
		assertEquals(actualText4, expectedText4,"Text Mismatched");
		leaveOption.click();
		driver.navigate().back();
		String actualText5=timeOption.getText();
		String expectedText5="Time";
		assertEquals(actualText5, expectedText5,"Text Mismatched");
		timeOption.click();
		driver.navigate().back();
		String actualText6 = recruitmentOption.getText();
		String expectedText6="Recruitment";
		assertEquals(actualText6, expectedText6,"Text Mismatched");
		recruitmentOption.click();
		driver.navigate().back();
		String actualText7 = myInfoOption.getText();
		String expectedText7="My Info";
		assertEquals(actualText7, expectedText7,"Text Mismatched");
		myInfoOption.click();
		driver.navigate().back();
		String actualText8 = performanceOption.getText();
		String expectedText8="Performance";
		assertEquals(actualText8, expectedText8,"Text Mismatched");
		performanceOption.click();
		driver.navigate().back();
		String actualText10 = directoryOption.getText();
		String expectedText10="Directory";
		assertEquals(actualText10, expectedText10,"Text Mismatched");
		directoryOption.click();
		driver.navigate().back();
		String actualText11 = maintenanceOption.getText();
		String expectedText11="Maintenance";
		assertEquals(actualText11, expectedText11,"Text Mismatched");
		maintenanceOption.click();
		driver.navigate().back();
		String actualText12 = claimOption.getText();
		String expectedText12="Claim";
		assertEquals(actualText12, expectedText12,"Text Mismatched");
		claimOption.click();
		driver.navigate().back();
		String actualText13 = buzzOption.getText();
		String expectedText13="Buzz";
		assertEquals(actualText13, expectedText13,"Text Mismatched");
		buzzOption.click();
		driver.navigate().back();
		dashboardCloseOption.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}  
 }
 public void validateTimeAtWorkOption() {
	 try {
		String actualText1 = timeAtWorkOption.getText();
		String expectedText1="Time at Work";
		assertEquals(actualText1, expectedText1,"Text Mismatched");
		String actualText2 = punchedOutText.getText();
		String expectedText2="Punched Out";
		assertEquals(actualText2, expectedText2,"Text Mismatched");
		stopwatchIcon.click();
		driver.navigate().back();
		String actualText3 = thisWeekText.getText();
		String expectedText3="This Week";
		assertEquals(actualText3, expectedText3,"Text Mismatched");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Screenshot attendanceChartScreenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, wait.until(ExpectedConditions.visibilityOf(attendanceChart)));
		ImageIO.write(attendanceChartScreenshot.getImage(), "png", new File("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Screenshot\\Attendance chart.png"));
		File f = new File("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Screenshot\\Attendance chart.png");
		if (f.exists()) {
			System.out.println("Image captured");
		}else {
			System.out.println("Image not captured ");
		}
		BufferedImage actualImage = attendanceChartScreenshot.getImage();
		BufferedImage expectedImage = ImageIO.read(new File("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Screenshot\\Attendance chart.png"));
		ImageDiffer imageDiff = new ImageDiffer();
		ImageDiff diff = imageDiff.makeDiff(expectedImage, actualImage);
		if (diff.hasDiff()==true) {
			System.out.println("Image same");
		}else {
			System.out.println("Image not same");
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void validateMyActionOption() {
	 try {
		String actualText1 = myActionOption.getText();
		String expectedText1="My Actions";
		assertEquals(actualText1, expectedText1,"Text Mismacthed");
		String actualText2 = pendingSelfReview.getText();
		String expectedText2="(1) Pending Self Review";
		assertEquals(actualText2, expectedText2,"Text Mismatched");
		pendingSelfReview.click();
		driver.navigate().back();
		String actualText3 = candidateToInterview.getText();
		String expectedText3="(1) Candidate to Interview";
		assertEquals(actualText3, expectedText3,"Text Mismatched");
		candidateToInterview.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void validateQuickLaunchOption() {
	 try {
		String actualText1 = quickLaunchText.getText();
		String expectedText1="Quick Launch";
		assertEquals(actualText1, expectedText1,"Text Mismatched");
		assignLeave.click();
		driver.navigate().back();
		leaveList.click();
		driver.navigate().back();
		timesheet.click();
		driver.navigate().back();
		applyLeave.click();
		driver.navigate().back();
		myLeave.click();
		driver.navigate().back();
		myTimesheet.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void validateBuzzLatestPostsOption() {
	 try {
		String actualText1 = buzzLatestPostText.getText();
		String expectedText1="Buzz Latest Posts";
		assertEquals(actualText1, expectedText1,"Text Mismatched");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void validateEmployeesOnLeaveTodayOption() {
	 try {
		String actualText1 = employeesOnLeaveToday.getText();
		String expectedText1="Employees on Leave Today";
		assertEquals(actualText1, expectedText1,"Text Mismatched");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Screenshot noContentImageScreenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,wait.until(ExpectedConditions.visibilityOf(noContentImage)));
		ImageIO.write(noContentImageScreenshot.getImage(), "png", new File("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Screenshot\\No Content Image.png"));
		BufferedImage actualImage = noContentImageScreenshot.getImage();
		BufferedImage expectedImage = ImageIO.read(new File("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Screenshot\\No Content Image.png"));
		ImageDiffer imageDiff = new ImageDiffer();
		ImageDiff diff = imageDiff.makeDiff(expectedImage, actualImage);
		if (diff.hasDiff()==true) {
			System.out.println("Image Same");
		}else {
			System.out.println("Image Not Same");
		}
		String actualText2 = noEmployeesOnLeaveTodayText.getText();
		String expectedText2="No Employees are on Leave Today";
		assertEquals(actualText2, expectedText2,"Text Mismatched");
		configurationIcon.click();
		cancelBtn3.click();
		configurationIcon.click();
		String actualText3 = configurationText.getText();
		String expectedText3="Only show accessible employees on leave for other users";
		assertEquals(actualText3, expectedText3,"Text Mismatched");
		switchBtn.click();
		saveBtn2.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void validateEmployeesDistributionBySubUnit() {
	 try {
		String actualText1 = employeeDistributionBySubUnit.getText();
		String expectedText1="Employee Distribution by Sub Unit";
		assertEquals(actualText1, expectedText1,"Text Mismatched");
		String actualText2 = engineering.getText();
		String expectedText2="Engineering";
		assertEquals(actualText2, expectedText2,"Text Mismatched");
		engineering.click();
		String actualText3 = humanResources.getText();
		String expectedText3="Human Resources";
		assertEquals(actualText3, expectedText3,"Text Mismatched");
		humanResources.click();
		String actualText4= administration.getText();
		String expectedText4="Administration";
		assertEquals(actualText4, expectedText4,"Text Mismatched");
		administration.click();
		String actualText5= clientServices.getText();
		String expectedText5="Client Services";
		assertEquals(actualText5, expectedText5,"Text Mismatched");
		clientServices.click();
		String actualText6= unassigned.getText();
		String expectedText6="Unassigned";
		assertEquals(actualText6, expectedText6,"Text Mismatched");
		unassigned.click();
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void validateEmployeesDistributionByLocation() {
	try {
		String actualText1 = employeeDistributionByLocation.getText();
		String expectedText1="Employee Distribution by Location";
		assertEquals(actualText1, expectedText1,"Text Mismatched");
		String actualText2 = texasRnD.getText();
		String expectedText2="Texas R&D";
		assertEquals(actualText2, expectedText2,"Text Mismatched");
		texasRnD.click();
		String actualText3 = newYorkSalesOffice.getText();
		String expectedText3="New York Sales Office";
		assertEquals(actualText3, expectedText3,"Text Mismatched");
		newYorkSalesOffice.click();
		String actualText4 = unassigned2.getText();
		String expectedText4="Unassigned";
		assertEquals(actualText4,expectedText4,"Text Mismatched");
		unassigned2.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} 
 }
 
 
 
 
}
