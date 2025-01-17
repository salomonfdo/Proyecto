package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Purchasing;

public class ThenTest {
	Purchasing purch;
	WebDriver driver = WhenTest.driver;

	@Then("User should be logged correctly")
	public void user_should_be_logged_correctly() {
		WebElement lblHeading = driver.findElement(By.className("page-heading"));
		Assert.assertTrue(
				driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=my-account"));
		driver.quit();
	}

	@Then("User should see an error message")
	public void user_should_see_an_error_message() {
		WebElement lblAlert = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/p"));
		Assert.assertTrue(lblAlert.getText().equals("There is 1 error"));
		driver.quit();
	}

	@Then("User should be sent to a page to change password")
	public void user_should_be_sent_to_a_page_to_change_password() {
		WebElement lblAlert = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/h1"));
		Assert.assertTrue(lblAlert.getText().equals("FORGOT YOUR PASSWORD?"));
		driver.quit();
	}

	@Then("User confirm order")
	public void user_confirm_Order() {
		purch = new Purchasing(driver);
		purch.Confirm();
		WebElement lblAlert = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p"));
		Assert.assertTrue(lblAlert.getText().equals("Your order on My Store is complete."));
		driver.quit();
	}

}
