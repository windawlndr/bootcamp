package selenium_page_factory.test_suite_cucumber.definitions;
import com.demo.selenium_page_factory.base.BaseTestSuite;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium_page_factory.pages.CartPage;
import selenium_page_factory.pages.CheckOutPage;
import selenium_page_factory.pages.HomePage;
import selenium_page_factory.pages.LoginPage;
import selenium_page_factory.pages.OverviewPage;

public class CheckoutFlow  extends BaseTestSuite{
public String url;
public LoginPage loginPage;
public HomePage homePage;
public CartPage cartPage;
public CheckOutPage checkOutPage;
public OverviewPage overviewPage;

@Given("the url {string} for checkout flow")
public void setUrl(String url) {
    this.url = url;
}
@Then("Open the browser for checkout flow")
public void openBrowser() {
    super.setup();
    this.openUrl(url);
}
@And("init all pages for run automation for checkout flow")
public void initPages() {
    this.loginPage = new LoginPage(webDriver, wait);
    this.homePage = new HomePage(webDriver, wait);
    this.cartPage = new CartPage(webDriver, wait);
    this.checkOutPage = new CheckOutPage(webDriver, wait);
    this.overviewPage = new OverviewPage(webDriver, wait);
}
@When("Input username {string} and {string} in login page for checkout flow")
public void login(String username, String password) {
    loginPage.fillUsername(username);
    loginPage.fillPassword(password);
}
@Then("click login button for checkout flow")
public void clickLoginButton() {
    loginPage.clickLoginButton();
}
@Then("click button add to cart")
public void addToCart() throws InterruptedException {
    homePage.addToCartBackpackButton();

}

@Then("click cart button for checkout flow")
public void clickCart() throws InterruptedException {
    homePage.clickCart();
}

@Then("click checkout button for checkout flow")
public void clickCheckoutButton() throws InterruptedException {
    cartPage.clickCheckoutButton();
}
@Then("Input first name {string} and last name {string} and zip code {string} in checkout page for checkout flow")
public void inputcheckoutInfo(String firstName, String lastName, String postal) {
    checkOutPage.fillFirstName(firstName);
    checkOutPage.fillLastName(lastName);
    checkOutPage.fillPostalCode(postal);
}
@Then("click continue button for checkout flow")
public void clickContinueButton() {
    checkOutPage.clickContinueButton();
}
@Then ("click finish button for checkout flow")
public void clickFinishButton() {
    overviewPage.clickFinishButton();
}

}
