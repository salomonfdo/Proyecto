package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchasing {

	public Purchasing(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement womanbtn;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]")
	WebElement divproduct;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
	WebElement btnadd;

	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement proceedbtn;

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement proceedbtn2;

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	WebElement proceedbtn3;

	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	WebElement proceedbtn4;

	@FindBy(xpath = "//*[@id=\"cgv\"]")
	WebElement Terms;

	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement payment;

	
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	WebElement confirm;
	
	
	public void clickWomanbtn() {
		womanbtn.click();
	}

	public void clickAdd() {
		btnadd.click();
	}

	public void proceed() {
		proceedbtn.click();
	}

	public void proceed2() {
		proceedbtn2.click();
	}

	public void proceed3() {
		proceedbtn3.click();
	}

	public void proceed4() {
		proceedbtn4.click();
	}

	public void AcceptTerms() {
		Terms.click();
	}

	public void SelectMethodePay() {
		payment.click();
	}
	
	public void Confirm() {
		confirm.click();
	}
}
