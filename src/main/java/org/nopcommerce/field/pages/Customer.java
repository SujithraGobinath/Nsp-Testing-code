package org.nopcommerce.field.pages;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en_old.Ac;
import org.nopcommerce.field.Utils.Actions;
import org.nopcommerce.field.cucumber.Testcontext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Customer {
    private WebDriver driver;
    Actions actions;
    DataTable datatable;

    String url = "https://admin-demo.nopcommerce.com/login";
    By loginbutton = By.xpath("//button[@class='button-1 login-button']");

    By Customermenu = By.xpath(" //p[text()=' Customers']");

    By customermodule=By.xpath("//i[@class='nav-icon far fa-user']");

    By EmailId = By.id("SearchEmail");
    By firstname = By.id("SearchFirstName");

    By lastName=By.id("SearchLastName");
    By search=By.id("search-customers");


    public Customer(WebDriver driver){
        this.driver=driver;
        actions = new Actions(driver);

    }
    public void login() {
        actions.loginurl(url);
        actions.findandclick(loginbutton);
    }
    public void Customerpage(){
        actions.findandclick(customermodule);
        actions.findandclick(Customermenu);
    }
    public void enterdetails(String Email,String Firstname,String Lastname){
        actions.findandsend(EmailId,Email);
        actions.findandsend(firstname,Firstname);
        actions.findandsend(lastName,Lastname);
    }
public void search(){
        actions.findandclick(search);
}



}
