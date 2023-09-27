package org.com.newme.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Actionutils {
    private WebDriver driver;

    public Actionutils(WebDriver driver) {
        this.driver = driver;
    }
    public void openurl(String url){
        driver.get(url);
    }

    public void findandclick(By element) {
        driver.findElement(element);
    }
    public void wait(By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.of(20, ChronoUnit.SECONDS));
        wait.until(ExpectedConditions.presenceOfElementLocated(element));

    }

    public void findandsend(By element, String field) {
        driver.findElement(element).sendKeys(field);
    }

    public void ScrolltoElement( By field) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        driver.findElement(field);

    }
}