package selenium_page_factory.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.demo.selenium_page_factory.base.BaseObject;

public class LoginObject extends BaseObject {  
    @FindBy (xpath = "//input[@id='user-name']")
    public WebElement usernameField;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordField;

    @FindBy (xpath = "//input[@id='login-button']")
    public WebElement loginButton;
    
    public LoginObject(WebDriver webDriver){
    super(webDriver);

    PageFactory.initElements(webDriver, this);
}    

}





    


