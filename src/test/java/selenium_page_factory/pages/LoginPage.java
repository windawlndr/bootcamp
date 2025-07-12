package selenium_page_factory.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import com.demo.selenium_page_factory.base.BasePage;
import selenium_page_factory.object_repository.LoginObject;


public class LoginPage extends BasePage {
    public LoginObject loginObject;
    public LoginPage(WebDriver webDriver, Wait<WebDriver> wait) {
        super(webDriver, wait);
        this.loginObject = new LoginObject(webDriver);
    }

    public void fillUsername(String username) {
        wait.until(d -> loginObject.usernameField.isDisplayed());
        this.loginObject.usernameField.sendKeys(username);
    }

    public void fillPassword(String password){
        wait.until(d-> loginObject.passwordField.isDisplayed());
        this.loginObject.passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(d -> loginObject.loginButton.isDisplayed());
        this.loginObject.loginButton.click();
    }

}
