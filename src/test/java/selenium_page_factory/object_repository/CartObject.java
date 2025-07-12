package selenium_page_factory.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.selenium_page_factory.base.BaseObject;

public class CartObject extends BaseObject {
    

    @FindBy(xpath = "//button[@id='checkout']")
    public WebElement checkoutButton;
    
    public CartObject(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }
    
}
