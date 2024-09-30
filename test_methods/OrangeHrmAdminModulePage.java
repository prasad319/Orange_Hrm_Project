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

public class OrangeHrmAdminModulePage {
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
 @Test
 public void validateUserManagementOption() {
	 try {
		test_objects.OrangeHrmAdminModulePage page = new test_objects.OrangeHrmAdminModulePage(driver);
		FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Orange Hrm Project Input Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int totalRows = sheet.getLastRowNum();
		short totalColumns = sheet.getRow(totalRows).getLastCellNum();
		System.out.println("Total Rows-"+totalRows+"||"+"Total Columns-"+totalColumns);
		String userName1 = sheet.getRow(3).getCell(1).getStringCellValue();
		String employeeName1 = sheet.getRow(9).getCell(1).getStringCellValue();
		page.validateSystemUserOption(userName1, employeeName1);
		String employeeName2 = sheet.getRow(9).getCell(1).getStringCellValue();
		String userName2 = sheet.getRow(3).getCell(1).getStringCellValue();
		String password = sheet.getRow(5).getCell(1).getStringCellValue();
		String confirmPassword = sheet.getRow(7).getCell(1).getStringCellValue();
		page.validateAddUserOption(employeeName2, userName2, password, confirmPassword);
	 } catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
}
