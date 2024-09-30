package test_objects;

import static org.testng.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

public class OrangeHrmLoginPage {
 WebDriver driver;
 @FindBy(xpath="//img[@alt='company-branding']")
 WebElement orangehrmLogo1;
 @FindBy(xpath = "//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")
 WebElement orangehrmLogo2;
 @FindBy(xpath = "//h5[normalize-space()='Login']")
 WebElement loginText;
 @FindBy(xpath = "//p[normalize-space()='Username : Admin']")
 WebElement usernameAdminText;
 @FindBy(xpath = "//p[normalize-space()='Password : admin123']")
 WebElement passwordAdmin123Text;
 @FindBy(xpath = "//label[normalize-space()='Username']")
 WebElement usernameText;
 @FindBy(xpath = "//label[normalize-space()='Password']")
 WebElement passwordText;
 @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
 WebElement forgotYourPasswordText;
 @FindBy(xpath = "//p[normalize-space()='OrangeHRM OS 5.6.1']")
 WebElement orangehrmversionText;
 @FindBy(xpath = "//div[@class='orangehrm-login-footer']//p[2]")
 WebElement orangehrmCopyrightText;
 @FindBy(xpath = "//input[@placeholder='Username']")
 WebElement usernameField;
 @FindBy(xpath = "//input[@placeholder='Password']")
 WebElement passwordField;
 @FindBy(xpath = "//button[normalize-space()='Login']")
 WebElement loginBtn;
 @FindBy(linkText = "OrangeHRM, Inc")
 WebElement orangeHrmLink;
 @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")
 WebElement linkedInLink;
 @FindBy(xpath = "//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']")
 WebElement facebookLink;
 @FindBy(xpath = "//a[@href='https://twitter.com/orangehrm?lang=en']")
 WebElement twitterLink;
 @FindBy(xpath = "//a[@href='https://www.youtube.com/c/OrangeHRMInc']")
 WebElement youtubeLink;
 @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
 WebElement invalidCredentialErroMsg;
 public OrangeHrmLoginPage(WebDriver driver){
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 } 
 public void validateUrlAndPageTitle() {
	 try {
		 String actualUrl = driver.getCurrentUrl();
		 String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		 assertEquals(actualUrl, expectedUrl,"Url mismatched");
		 System.out.println("URL-"+actualUrl);
		 String actualTitle = driver.getTitle();
		 String expectedTitle="OrangeHRM";
		 assertEquals(actualTitle,expectedTitle,"Title mismatched");
		 System.out.println("Page Title-"+actualTitle);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void validateImages() {
	 try {
		Screenshot logoImage1Screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, orangehrmLogo1);
		ImageIO.write(logoImage1Screenshot.getImage(), "png", new File("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Screenshot\\OrangehrmLogo1.png"));
		File f1 = new File("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Screenshot\\OrangehrmLogo1.png");
		if (f1.exists()) {
			System.out.println("Image file captured");
		}else {
			System.out.println("Image file not exist");
		}
		BufferedImage expectedImage1 = ImageIO.read(new File("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Screenshot\\OrangehrmLogo1.png"));
		BufferedImage actualImage1 = logoImage1Screenshot.getImage();
		ImageDiffer imageDiffer1 = new ImageDiffer();
		ImageDiff diff1 = imageDiffer1.makeDiff(expectedImage1, actualImage1);
		if (diff1.hasDiff()==true) {
			System.out.println("Image not same");
		}else {
		System.out.println("Image same");
		}
		Screenshot logoImage2Screenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,orangehrmLogo2);
		ImageIO.write(logoImage2Screenshot.getImage(), "png", new File("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Screenshot\\OrangehrmLogo2.png"));
		File f2 = new File("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Screenshot\\OrangehrmLogo2.png");
		if (f2.exists()) {
			System.out.println("Image file captured");
		}else {
			System.out.println("Image file not exist");
		}
		BufferedImage expectedImage2 = ImageIO.read(new File("D:\\Automation testing Class\\Selenium Projects\\Orange Hrm Project\\Screenshot\\OrangehrmLogo2.png"));
		BufferedImage actualImage2 = logoImage2Screenshot.getImage();
		ImageDiffer imageDiffer2 = new ImageDiffer();
		ImageDiff diff2 = imageDiffer2.makeDiff(expectedImage2, actualImage2);
		if (diff2.hasDiff()==true) {
			System.out.println("Image not same");
		}else {
			System.out.println("Image same");
		}
		
		
	 } catch (IOException e) {
		System.out.println(e.getMessage());
	}
 }
 public void validateTextAndTextBoxes() {
	 try {
		 String actualText1 = loginText.getText();
		 String expectedText1="Login";
		 assertEquals(actualText1, expectedText1,"Text Mismatched");
		 String actualText2 = usernameAdminText.getText();
		 String expectedText2="Username : Admin";
		 assertEquals(actualText2, expectedText2,"Text Mismacthed");
		 String actualText3 = passwordAdmin123Text.getText();
		 String expectedText3="Password : admin123";
		 assertEquals(actualText3, expectedText3,"Text Mismacthed");
		 String actualText4 = usernameText.getText();
		 String expectedText4= "Username";
		 assertEquals(actualText4, expectedText4,"Text Mismatched");
		 String actualText5 = passwordText.getText();
		 String expectedText5="Password";
		 assertEquals(actualText5, expectedText5,"Text Mismatched");
		 String actualText6 = forgotYourPasswordText.getText();
		 String expectedText6="Forgot your password?";
		 assertEquals(expectedText6, actualText6,"Text Mismatched");
		 String actualText7 = orangehrmversionText.getText();
		 String expectedText7="OrangeHRM OS 5.6.1";
		 assertEquals(actualText7, expectedText7,"Text Mismatched");
		 String actualText8 = orangehrmCopyrightText.getText();
		 String expectedText8="© 2005 - 2024 OrangeHRM, Inc. All rights reserved.";
		 assertEquals(actualText8, expectedText8,"Text Mismacthed");
		 String actualText9 = usernameField.getAttribute("name");
		 String expectedText9="username";
		 assertEquals(actualText9, expectedText9,"Text Mismacthed");
		 String actualText10 = passwordField.getAttribute("type");
		 String expectedText10="password";
		 assertEquals(actualText10, expectedText10,"Text Mismacthed");
		 String actualBorder1 = usernameField.getCssValue("border");
		 String expectedBorder1="0.8px solid rgb(146, 155, 170)";
		 assertEquals(actualBorder1, expectedBorder1,"Usernamefield Border Mismacthed");
		 String actualBorder2 = passwordField.getCssValue("border");
		 String expectedBorder2="0.8px solid rgb(232, 234, 239)";
		 assertEquals(actualBorder2, expectedBorder2,"PasswordField Border Mismacthed");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}	 
 }
 public void verifyOrangehrmLink() {
	 try {
		orangeHrmLink.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void verifyLinkedInLink() {
	 try {
		linkedInLink.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void verifyFacebookLink() {
	 try {
		facebookLink.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void verifyTwitterLink() {
	 try {
		twitterLink.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void verifyYoutubeLink() {
	 try {
		 youtubeLink.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void loginWithInvalidCredenntials(String usernameInput,String passwordInput) {
	 try {
		usernameField.sendKeys(usernameInput);
		passwordField.sendKeys(passwordInput);
		loginBtn.click();
		String actualText = invalidCredentialErroMsg.getText();
		String expectedText="Invalid credentials";
		assertEquals(actualText, expectedText,"Text Mismatched");
		System.out.println("Error message-"+actualText);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
 public void loginWithValidCredentials(String usernameInput,String passwordInput) {
	 try {
		usernameField.sendKeys(usernameInput);
		passwordField.sendKeys(passwordInput);
		loginBtn.click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
 }
}
