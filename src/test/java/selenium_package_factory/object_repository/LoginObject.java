package selenium_package_factory.object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObject {
@FindBy(xpath = "//input[@id='username']")
public WebElement  username;

@FindBy(xpath = "//input[@id='password']")
public WebElement password;

@FindBy(xpath = "//button[@id='login-button']")
public WebElement loginButton;
    

}
