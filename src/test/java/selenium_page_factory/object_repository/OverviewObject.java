package selenium_page_factory.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.selenium_page_factory.base.BaseObject;

public class OverviewObject extends BaseObject {
    
    public OverviewObject(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

  

    @FindBy(xpath = "//button[@id='finish']")
    public WebElement finishButton;

    
}
