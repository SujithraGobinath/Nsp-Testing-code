package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.com.newme.cucumber.Testcontext;
import org.com.newme.pages.Home;
import org.openqa.selenium.WebDriver;

public class Homesteps {
    Testcontext testcontext;
    private WebDriver driver;
    Home home;
    public Homesteps(Testcontext testcontext){
      this.testcontext=testcontext;
      home= new Home(testcontext.getDriver());
    }
    @Given("enter url {string}")
    public void enter_url(String url) {
        home.homepage(url);
    }
    @Then("click enroll now")
    public void click_enroll_now() {
       home.traineepage();
    }
    @Then("Enter the details {string} ,{string},{string},{string},{string}")
    public void enter_the_details(String Name, String EmailAddress, String MobileNumber, String ReferredBy, String Message) {
home.details(Name,EmailAddress,MobileNumber,ReferredBy,Message);
    }
    @Then("click submit and validate the success message")
    public void click_submit_and_validate_the_success_message() {
      home.submit();
    }


}
