package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.nopcommerce.field.cucumber.Testcontext;
import org.nopcommerce.field.pages.Customer;
import org.openqa.selenium.WebDriver;

public class CustomerSteps{
    public static WebDriver driver;
    Customer customer;

    public CustomerSteps(Testcontext testcontext) {

        customer = new Customer(testcontext.getDriver());
    }


    @Given("Given Open the login page and click login")
    public void given_open_the_login_page_and_click_login() {
        customer.login();

    }
    @Given("move to Customer page")
    public void move_to_customer_page() {
        customer.Customerpage();

    }
    @Then("enter {string} and {string} and {string} in the fields")
    public void enter_and_and_in_the_fields(String Email, String Firstname, String Lastname) {
       customer.enterdetails(Email,Firstname,Lastname);
    }
    @Then("search with given datas")
    public void search_with_given_datas() {
customer.search();
    }
}
