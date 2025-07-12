package selenium_page_factory.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.selenium_page_factory.base.BaseObject;

public class CheckoutObject extends BaseObject{

    
    @FindBy(xpath = "//input[@id='first-name']")
    public WebElement firstNameField;

    @FindBy(xpath = "//input[@id='last-name']")
    public WebElement lastNameField;

    @FindBy(xpath = "//input[@id='postal-code']")
    public WebElement postalCodeField;  

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueButton;

    public CheckoutObject(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

   
    
    
}