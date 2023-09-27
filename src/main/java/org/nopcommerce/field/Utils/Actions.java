package org.nopcommerce.field.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Actions {

    private WebDriver driver;

    public Actions(WebDriver driver){
        this.driver=driver;
    }


    public void loginurl(String url) {
        driver.get(url);
    }

    public void findandclick(By element) {
        driver.findElement(element).click();
    }
    public void findandsend(By element, String field){
        driver.findElement(element).sendKeys(field);

    }



}
