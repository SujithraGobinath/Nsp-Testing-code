package org.com.newme.pages;

import org.com.newme.utils.Actionutils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    public WebDriver driver;
    Actionutils actions;

   String url=" ";
//By trainee=By.linkText("Become A Trainer");
   By trainee= By.xpath("//a[@href=\"https://newmetech.in/become-a-trainer/\"][1]");
    By enroll=By.xpath("//a[@class='et_pb_button et_pb_button_0 et_pb_bg_layout_light']");
    By name = By.xpath("//label[text()='Name']/./following::input[1]");
    By mailid=By.xpath("//label[text()='Email Address']/./following::input[1]");
    By mobile=By.xpath("//label[text()='Mobile Number']/./following::input[1]");
    By referred=By.xpath("//label[text()='Referred by']/./following::input[1]");
    By message =By.xpath("//label[text()='Message']/./following::textarea[1]");
    By submit= By.xpath("//button[@type='submit']");

    public Home(WebDriver driver){
        this.driver=driver;
        actions=new Actionutils(driver);
    }


    public void homepage(String url){
       actions.openurl(url);
    }
    public void traineepage(){
       // actions.wait(trainee);
        actions.findandclick(trainee);
       // actions.wait(enroll);
        actions.findandclick(enroll);
    }
    public void details(String Name,String EmailAddress,String MobileNumber,String ReferredBy,String Message){
       // actions.wait(name);
        actions.findandsend(name,Name);
        //actions.wait(mailid);
        actions.findandsend(mailid,EmailAddress);
        //actions.wait(mobile);
        actions.findandsend(mobile,MobileNumber);
        actions.wait(referred);
        actions.findandsend(referred,ReferredBy);
        actions.wait(message);
        actions.findandsend(message,Message);
        actions.ScrolltoElement(message);
    }
    public void submit(){
        actions.wait(submit);
actions.findandclick(submit);
    }

}
