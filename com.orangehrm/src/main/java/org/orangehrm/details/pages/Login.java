package org.orangehrm.details.pages;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.orangehrm.details.Utils.ActionUtils;

import java.util.List;

public class Login {
    private WebDriver driver;
    Scenario scenario;
    ActionUtils actions;
    DataTable datatable;

    String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    By user= By.xpath("//label[text()='Username']/following::input[1]");
    By pass=By.xpath("//label[text()='Password']/following::input[1]");
    By button= By.xpath("//button[text()=' Login ']");
    //By   alert = By.xpath("");

    public Login (WebDriver driver, Scenario scenario){
        this.driver=driver;
        this.scenario=scenario;
        actions = new ActionUtils(driver);

    }

    public void login(){
        actions.loginurl(url);
    }

    public void enterdatas(String username,String password) {
        actions.wait(user);
        actions.findandsend(user,username);
        actions.wait(pass);
        actions.findandsend(pass,password);
    }

    public void click(){
        actions.findandclick(button);
    }












}
