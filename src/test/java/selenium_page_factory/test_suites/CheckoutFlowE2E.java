package selenium_page_factory.test_suites;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.demo.selenium_page_factory.base.BaseTestSuite;
import selenium_page_factory.pages.CartPage;
import selenium_page_factory.pages.CheckOutPage;
import selenium_page_factory.pages.HomePage;
import selenium_page_factory.pages.LoginPage;
import selenium_page_factory.pages.OverviewPage;

public class CheckoutFlowE2E extends BaseTestSuite {
    public LoginPage loginPage;
    public HomePage homePage;
    public CartPage cartPage;
    public CheckOutPage checkOutPage;
    public OverviewPage overviewPage;





    @BeforeSuite
    public void setup() {
       super.setup();
        this.openUrl("https://www.saucedemo.com/");
        this.loginPage = new LoginPage(webDriver, wait);
        this.homePage= new HomePage(webDriver,wait);
        this.cartPage = new CartPage(webDriver, wait);
        this.checkOutPage = new CheckOutPage(webDriver,wait);
        this.overviewPage = new OverviewPage(webDriver,wait);
    }
    @Test
    public void checkoutFlow() throws InterruptedException {
        //login
        loginPage.fillUsername("standard_user");
        loginPage.fillPassword("secret_sauce");
        loginPage.clickLoginButton();
        
        homePage.addToCartBackpackButton();
        homePage.clickCart();

        cartPage.clickCheckoutButton();
        
        //checkout information
        checkOutPage.fillFirstName("budi");
        checkOutPage.fillLastName("Budi");
        checkOutPage.fillPostalCode("12345");
        checkOutPage.clickContinueButton();

        // overview
        overviewPage.clickFinishButton();

    
        }

    @AfterSuite
    public void teardown() {
        super.teardown();

}
    
    
}