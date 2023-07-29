package org.nopcommerce.product1.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ActionUtils {
    private WebDriver driver;






    public ActionUtils(WebDriver driver ) {
        this.driver = driver;


    }
    public void loginpage(String url){
        driver.get(url);

    }
    public void findandclick(By element){
        driver.findElement(element).click();
    }

  public void findandclick1(By element){
        driver.findElement(element).click();
    }

public void findandsend(By element){
        driver.findElement(element).sendKeys("Adobe Photoshop CS4");
}

public void wait(By element){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

}
public void gettext(By element){
        driver.findElement(element).getText();
}
/*public void Scroll(By element){
        executor.executeScript("arguments[0].scrollIntoView(true)");
    }
    public void scroll1(By element){
        executor.executeScript("arguments[0].scrollIntoView(false)");
    }*/

}
