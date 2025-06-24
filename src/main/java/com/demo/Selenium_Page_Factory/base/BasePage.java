package com.demo.Selenium_Page_Factory.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class BasePage {
    public WebDriver webDriver;
    public Wait<WebDriver> wait;

    public BasePage(WebDriver webDriver, Wait<WebDriver> wait) {
        this.webDriver = webDriver;
        this.wait = wait;
    }
}
