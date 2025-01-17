package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 public LoginPage(WebDriver driver) {
  PageFactory.initElements(driver, this);
 }
 @FindBy(id = "email")
 WebElement emaillbl;
 
 @FindBy(id = "passwd")
 WebElement passwdlbl;
 
 @FindBy(id = "SubmitLogin")
 WebElement submitBtn;
 
 public void sendEmail(String email) {
  emaillbl.sendKeys(email);
 }
 
 public void sendPass(String pass) {
  passwdlbl.sendKeys(pass);
 }
 
 public void clickSubmit() {
  submitBtn.click();
 }
 
 /*public void Login(String email, String pass) {
	 sendEmail(email);
	 sendPass(pass);
	 clickSubmit();
 }*/
 
}

