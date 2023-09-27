package org.com.newme.cucumber;

import org.openqa.selenium.WebDriver;

public class Testcontext {
    public WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
