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

public class OrangeHrmLoginPage {
 WebDriver driver;
 @BeforeMethod
 	public void beforeMethod() {
	 try {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
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
 public void validateUrlAndPageTitle() {
	 try {
		test_objects.OrangeHrmLoginPage page = new test_objects.OrangeHrmLoginPage(driver);
		page.validateUrlAndPageTitle();
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 2)
 public void validateImages() {
	try {
		 test_objects.OrangeHrmLoginPage page = new test_objects.OrangeHrmLoginPage(driver);
		 page.validateImages();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 3)
 public void validateTextAndTextBoxes() {
	 try {
		test_objects.OrangeHrmLoginPage page = new test_objects.OrangeHrmLoginPage(driver);
		page.validateTextAndTextBoxes();
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 4)
 public void verifyOrangehrmLink() {
	 try {
		test_objects.OrangeHrmLoginPage page = new test_objects.OrangeHrmLoginPage(driver);
		page.verifyOrangehrmLink();
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 5)
 public void verifyLinkedInLink() {
	 try {
		test_objects.OrangeHrmLoginPage page = new test_objects.OrangeHrmLoginPage(driver);
		page.verifyLinkedInLink();
	 } catch (Exception e) {
		System.out.println();
	}
 }
 @Test(priority=6)
 public void verifyFacebookLink() {
	 try {
		test_objects.OrangeHrmLoginPage page = new test_objects.OrangeHrmLoginPage(driver);
		page.verifyFacebookLink();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 7)
 public void verifyTwitterLink() {
	 try {
		test_objects.OrangeHrmLoginPage page = new test_objects.OrangeHrmLoginPage(driver);
		page.verifyTwitterLink();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 8)
 public void verifyYoutubeLink() {
	 try {
		test_objects.OrangeHrmLoginPage page = new test_objects.OrangeHrmLoginPage(driver);
		page.verifyYoutubeLink();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 9)
 public void loginWithInvalidCredenntials() {
	 try {
		test_objects.OrangeHrmLoginPage page = new test_objects.OrangeHrmLoginPage(driver);
		FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Orange Hrm Project Input Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int totalRows = sheet.getLastRowNum();
		short totalColumns = sheet.getRow(totalRows).getLastCellNum();
		System.out.println("Total Rows-"+totalRows+"||"+"Total Columns-"+totalColumns);
		String invalidUsername = sheet.getRow(1).getCell(1).getStringCellValue();
		String invalidPassword = sheet.getRow(2).getCell(1).getStringCellValue();
		page.loginWithInvalidCredenntials(invalidUsername, invalidPassword);
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 @Test(priority = 10)
 public void loginWithValidCredentials() {
	 try {
		test_objects.OrangeHrmLoginPage page = new test_objects.OrangeHrmLoginPage(driver);
		FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Orange Hrm Project Input Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int totalRows = sheet.getLastRowNum();
		short totalColumns = sheet.getRow(totalRows).getLastCellNum();
		System.out.println("Total Rows-"+totalRows+"||"+"Total Columns-"+totalColumns);
		String validUsername = sheet.getRow(3).getCell(1).getStringCellValue();
		String validPassword = sheet.getRow(4).getCell(1).getStringCellValue();
		page.loginWithValidCredentials(validUsername, validPassword);
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
}
