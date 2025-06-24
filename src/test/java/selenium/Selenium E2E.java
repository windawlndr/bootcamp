package selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class login_selenium {
    public WebDriver webDriver;

    @BeforeSuite
    public void startBrowser() {
        System.out.println("starteuu");
        System.getProperty("webdriver.chrome.driver","/Users/dev2000325/bootcamp/Testing/winda-restassured/chromedriver-mac-x64/chromedriver");

        webDriver = new ChromeDriver();

        webDriver.get("http://saucedemo.com/");
        webDriver.manage().window().fullscreen();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
    @Test 
    public void inputUname() throws Exception {
    Thread.sleep(Duration.ofSeconds(2));

    WebElement inputUserName = webDriver.findElement(By.id("user-name"));
    inputUserName.sendKeys("windatest");
    

    }
    @Test (dependsOnMethods = "inputUname")
    public void inputPassword() throws Exception {
    Thread.sleep(Duration.ofSeconds(2));

    WebElement inputUserName = webDriver.findElement(By.xpath("//input[@id='password']"));
    inputUserName.sendKeys("windatest");

    }

    @Test(dependsOnMethods = "inputPassword")
    public void clickButton() throws Exception {
    Thread.sleep(Duration.ofSeconds(2));

    WebElement clickSignIn = webDriver
    .findElement(By.cssSelector("#login-button"));
    clickSignIn.click();


    }
    @Test(dependsOnMethods ="clickButton" )
    public void getError () throws Exception{
        Thread.sleep(Duration.ofSeconds(5));
        WebElement errorText = webDriver
        .findElement(By.xpath("//h3[@data-test='error']"));
        System.out.println("Validate: " + errorText.getText());
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", errorText.getText());
        webDriver.navigate().refresh();

    }

    @Test (dependsOnMethods = "getError")
    public void inputUnameValid() throws Exception {
    Thread.sleep(Duration.ofSeconds(2));

    WebElement inputUserName = webDriver.findElement(By.id("user-name"));
    inputUserName.sendKeys("standard_user");
    

    }

    @Test (dependsOnMethods = "inputUnameValid")
    public void inputPasswordValid() throws Exception {
    Thread.sleep(Duration.ofSeconds(2));

    WebElement inputUserName = webDriver.findElement(By.xpath("//input[@id='password']"));
    inputUserName.sendKeys("secret_sauce");

    }

    @Test(dependsOnMethods = "inputPasswordValid")
    public void clickButtonValid() throws Exception {
    Thread.sleep(Duration.ofSeconds(2));

    WebElement clickSignIn = webDriver
    .findElement(By.cssSelector("#login-button"));
    clickSignIn.click();
    
    }

    public void assertSuccess () throws Exception{
        Thread.sleep(Duration.ofSeconds(2));
        WebElement infoText = webDriver
        .findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        System.out.println("Validate: " + infoText.getText());
        Assert.assertEquals("the messeges that shows is ", infoText.getText());
    }

    public void addToCart () throws Exception{
            Thread.sleep(Duration.ofSeconds(5)); 
            WebElement addProduct = webDriver
            .findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
            addProduct.click();
        }

        public void getCart () throws Exception{
            Thread.sleep(Duration.ofSeconds(3)); 
            WebElement checkCart = webDriver
            .findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
            checkCart.click();
        }



    @AfterSuite 
    public void closeBrowser() throws Exception{
        Thread.sleep(Duration.ofSeconds(5));
        webDriver.close();
    }
    
}
