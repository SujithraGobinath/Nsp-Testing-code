package org.nopcommerce.product1.cucumber;

import org.openqa.selenium.WebDriver;

public class Testcontext {
private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
