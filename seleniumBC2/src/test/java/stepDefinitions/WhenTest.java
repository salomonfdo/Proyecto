package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.Purchasing;

public class WhenTest {
	LoginPage lg;
	Purchasing purch;
	public static WebDriver driver = GivenTest.driver;

	@When("User enter userame as {string}")
	public void user_enter_userame_as(String email) {
		lg = new LoginPage(driver);
		lg.sendEmail(email);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		lg.sendPass(password);

	}

	@When("User click on Sign in button")
	public void user_click_on_Sign_in_button() {
		lg.clickSubmit();
	}

	@When("User click on Forgot your password link")
	public void user_click_on_Forgot_your_password_link() {
		WebElement linkFP = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"));
		linkFP.click();

	}

	@When("User click on Woman")
	public void user_click_on_Woman() {
		purch = new Purchasing(driver);
		purch.clickWomanbtn();
		WebElement lblHeading = driver.findElement(By.className("cat-name"));
		Assert.assertTrue(driver.getCurrentUrl()
				.equals("http://automationpractice.com/index.php?id_category=3&controller=category"));

	}

	@When("User click on Add product")
	public void user_click_on_Add_product() {
		Actions actions = new Actions(driver);
		WebElement divadd = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div"));
		actions.moveToElement(divadd).perform();
		purch.clickAdd();
		WebElement imgProd = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/div[1]/img"));
		Assert.assertTrue(imgProd.isDisplayed());

	}
	
	@When("User click on proceed to checkout")
	public void user_click_on_proceed_to_checkout() {
		purch.proceed();
		WebElement img2prod = driver.findElement(By.xpath("//*[@id=\"product_1_1_0_222244\"]/td[1]/a/img"));
		Assert.assertTrue(img2prod.isDisplayed());
		purch.proceed2();
		WebElement checkDom = driver.findElement(By.xpath("//*[@id=\"addressesAreEquals\"]"));
		Assert.assertTrue(checkDom.isSelected());
		purch.proceed3();
		WebElement checkTerm = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
		Assert.assertFalse(checkTerm.isSelected());
		purch.AcceptTerms();
		purch.proceed4();
		WebElement checkOrd = driver.findElement(By.xpath("//*[@id=\"cart_summary\"]"));
		Assert.assertTrue(checkOrd.isDisplayed());
		
	}

	@When("User click on payment methode")
	public void user_click_on_payment_methode() {
		
		purch.SelectMethodePay();		
		Assert.assertTrue(driver.getCurrentUrl().equals("http://automationpractice.com/index.php?fc=module&module=bankwire&controller=payment"));
		
	}
}
