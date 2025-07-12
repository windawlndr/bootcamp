package selenium_page_factory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import com.demo.selenium_page_factory.base.BasePage;

import selenium_page_factory.object_repository.CheckoutObject;

public class CheckOutPage extends BasePage{
    public CheckoutObject checkoutObject;

    public CheckOutPage(WebDriver webDriver, Wait<WebDriver> wait) {
        super(webDriver, wait);
        this.checkoutObject = new CheckoutObject(webDriver);
    }
    public void fillFirstName(String firstName) {
        wait.until(d -> checkoutObject.firstNameField.isDisplayed());
        this.checkoutObject.firstNameField.sendKeys(firstName);
    }
    public void fillLastName(String lastName) {
        wait.until(d -> checkoutObject.lastNameField.isDisplayed());
        this.checkoutObject.lastNameField.sendKeys(lastName);
    }
    public void fillPostalCode(String postalCode) {
        wait.until(d -> checkoutObject.postalCodeField.isDisplayed());
        this.checkoutObject.postalCodeField.sendKeys(postalCode);   

    }

    public void clickContinueButton() {
        wait.until(d -> checkoutObject.continueButton.isDisplayed());
        this.checkoutObject.continueButton.click();
    }

}
