package org.nopcommerce.product1.pages;

import org.junit.Assert;
import org.nopcommerce.product1.Utils.ActionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Product {
    private WebDriver driver;
    ActionUtils actions;


    String url = "https://admin-demo.nopcommerce.com/admin/";
    By loginbutton = By.xpath("//button[@class='button-1 login-button']");
    By catalogue = By.xpath("//i[@class='nav-icon fas fa-book']");
    By productmenu = By.xpath("//a[@href='/Admin/Product/List']");
    By productname = By.name("SearchProductName");
    By search = By.xpath("//button[@id='search-products']");
    By edit = By.xpath("//i[@class='fas fa-pencil-alt']");
    By producttype = By.id("ProductTypeId");
    By productypefield = By.xpath("(//option[@value='10'])[2]");
    By save = By.xpath("(//i[@class='far fa-save'])[1]");





    public Product(WebDriver driver) {
        this.driver = driver;
        actions = new ActionUtils(driver );

    }

    public void loginpage() {
        actions.loginpage(url);
    }
  public void loginpage() {
        actions.loginpage(url);
    }


    public void clicklogin() {
        actions.findandclick(loginbutton);
    }

    public void catalogue() {
        actions.findandclick(catalogue);
        actions.wait(productmenu);
        actions.findandclick(productmenu);
    }

    public void productnameandsearch() {
        actions.findandsend(productname);
        actions.findandclick(search);
    }

    public void edit() {
        actions.findandclick(edit);
    }

    public void changetype() {

        actions.findandclick(productypefield);
        actions.wait(productypefield);
    }

    public void save() {
        actions.findandclick(save);
    }

    public void check() {
        actions.findandclick(productname);
        actions.findandsend(productname);
        actions.findandclick(search);
        actions.findandclick(edit);



    }

    public void verify() {
        actions.findandclick(productypefield);
        actions.gettext(productypefield);

        Assert.assertTrue("Grouped (product with variants)", true);


    }

}
