package selenium_page_factory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import com.demo.selenium_page_factory.base.BasePage;

import selenium_page_factory.object_repository.OverviewObject;

public class OverviewPage extends BasePage {
    public OverviewObject overviewObject;

    public OverviewPage(WebDriver webDriver, Wait<WebDriver> wait) {
        super(webDriver, wait);
        this.overviewObject = new OverviewObject(webDriver);
    }

    public void clickFinishButton() {
        wait.until(d -> overviewObject.finishButton.isDisplayed());
        this.overviewObject.finishButton.click();
    }
    
}
