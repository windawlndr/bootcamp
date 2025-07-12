package com.demo.selenium_page_factory.base;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.selenium_page_factory.constant.Env;

public abstract class BaseTestSuite {
    public WebDriver webDriver;
    public Wait<WebDriver> wait;

  
      
    
    public void setup(){
        System.out.println("init base page...");
        System.setProperty("webdriver.chrome.driver", Env.DRIVER_PATH);

        System.out.println("set chrome options");
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.password_manager_leak_detection", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false); // Tambahan penting

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        webDriver = new ChromeDriver(options);  

        wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }
    public void openUrl(String url) {
        System.out.println("open url: " + url);
        webDriver.get(url);
        webDriver.manage().window().fullscreen();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    }
    

    public void teardown() {
        webDriver.close();
    }
}
