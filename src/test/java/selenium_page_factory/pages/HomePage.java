package selenium_page_factory.pages;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import com.demo.selenium_page_factory.base.BasePage;
import selenium_page_factory.object_repository.HomePageObject;

public class HomePage extends BasePage {
    public HomePageObject homePageObject;

    public HomePage(WebDriver webDriver, Wait<WebDriver> wait) {
        super(webDriver, wait);
        this.homePageObject = new HomePageObject(webDriver);
    }
    public void addToCartBackpackButton() throws InterruptedException
    {
        wait.until(d-> homePageObject.addToCartButton.isDisplayed());
        this.homePageObject.addToCartButton.click();

        Thread.sleep(Duration.ofSeconds(3));
    }

    public void clickCart() throws InterruptedException {

        wait.until(d -> homePageObject.cartLink.isDisplayed());
        this.homePageObject.cartLink.click();

    }
}


