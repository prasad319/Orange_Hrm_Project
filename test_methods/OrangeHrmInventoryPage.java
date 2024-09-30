package test_methods;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmInventoryPage {
 WebDriver driver;
 @BeforeMethod
 public void beforeMethod() {
	try {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test_objects.OrangeHrmInventoryPage page = new test_objects.OrangeHrmInventoryPage(driver);
		FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Orange Hrm Project Input Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int totalRows = sheet.getLastRowNum();
		short totalColumns = sheet.getRow(totalRows).getLastCellNum();
		System.out.println("Total Rows-"+totalRows+"||"+"Total Columns-"+totalColumns);
		String Username = sheet.getRow(3).getCell(1).getStringCellValue();
		String password = sheet.getRow(4).getCell(1).getStringCellValue();
		page.loginToAccount(Username, password);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} 
 }
 @AfterMethod
 public void afterMethod() {
	try {
		driver.manage().window().minimize();
		driver.quit();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} 
 }
 @Test(priority = 1)
 public void verifyLogoutUserSuccessfully() {
	 try {
		test_objects.OrangeHrmInventoryPage page = new test_objects.OrangeHrmInventoryPage(driver);
		page.verifyLogoutUserSuccessfully();
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 2)
 public void validateDropdownOption() {
	 try {
		test_objects.OrangeHrmInventoryPage page = new test_objects.OrangeHrmInventoryPage(driver);
		FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Orange Hrm Project Input Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int totalRows = sheet.getLastRowNum();
		short totalColumns = sheet.getRow(totalRows).getLastCellNum();
		System.out.println("Total Rows-"+totalRows+"||"+"Total Columns-"+totalColumns);
		String currentPassword = sheet.getRow(5).getCell(1).getStringCellValue();
		String newPassword = sheet.getRow(6).getCell(1).getStringCellValue();
		String confirmPassword = sheet.getRow(7).getCell(1).getStringCellValue();
		page.validateDropdownOption(currentPassword, newPassword, confirmPassword);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 3)
 public void validateDashboard() {
	 try {
		test_objects.OrangeHrmInventoryPage page = new test_objects.OrangeHrmInventoryPage(driver);
		FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Orange Hrm Project Input Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int totalRows = sheet.getLastRowNum();
		short totalColumns = sheet.getRow(totalRows).getLastCellNum();
		System.out.println("Total Rows-"+totalRows+"||"+"Total Columns-"+totalColumns);
		String searchInput = sheet.getRow(8).getCell(1).getStringCellValue();
		page.validateDashboard(searchInput);
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 4)
 public void validateTimeAtWorkOption() {
	 try {
		test_objects.OrangeHrmInventoryPage page = new test_objects.OrangeHrmInventoryPage(driver);
		page.validateTimeAtWorkOption();
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 5)
 public void validateMyActionOption() {
	 try {
		test_objects.OrangeHrmInventoryPage page = new test_objects.OrangeHrmInventoryPage(driver);
		page.validateMyActionOption();
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 6)
 public void validateQuickLaunchOption() {
	 try {
		test_objects.OrangeHrmInventoryPage page = new test_objects.OrangeHrmInventoryPage(driver);
		page.validateQuickLaunchOption();
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 7)
 public void validateBuzzLatestPostsOption() {
	 try {
		 test_objects.OrangeHrmInventoryPage page = new test_objects.OrangeHrmInventoryPage(driver);
		 page.validateBuzzLatestPostsOption();
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 8)
 public void validateEmployeesOnLeaveTodayOption() {
	 try {
		test_objects.OrangeHrmInventoryPage page = new test_objects.OrangeHrmInventoryPage(driver);
		page.validateEmployeesOnLeaveTodayOption();
	 } catch (Exception e) {
	   System.out.println(e.getMessage());
	}
 }
 @Test(priority = 9)
 public void validateEmployeesDistributionBySubUnit() {
	 try {
		test_objects.OrangeHrmInventoryPage page = new test_objects.OrangeHrmInventoryPage(driver);
		page.validateEmployeesDistributionBySubUnit();
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 10)
 public void validateEmployeesDistributionByLocation() {
	 try {
		test_objects.OrangeHrmInventoryPage page = new test_objects.OrangeHrmInventoryPage(driver);
		page.validateEmployeesDistributionByLocation();
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }	
}
