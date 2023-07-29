package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.nopcommerce.product1.cucumber.Testcontext;
import org.nopcommerce.product1.pages.Product;
import org.openqa.selenium.WebDriver;

public class ProductSteps {
    public static WebDriver driver;
    Product product;

    public ProductSteps(Testcontext testcontext) {
        product = new Product(testcontext.getDriver());
    }

    @Given("open the login page")
    public void open_the_login_page() {
        product.loginpage();
    }
    @Then("click login")
    public void click_login() {
product.clicklogin();
    }



    @Then("click the catalogue and click product field")
    public void click_the_catalogue_and_click_product_field() {
        product.catalogue();
    }

    @Then("Enter the product name:{string} and search")
    public void enter_the_product_name_and_search(String string) {
product.productnameandsearch();
    }

    @Then("click edit")
    public void click_edit() {
product.edit();
    }

    @Then("change product type")
    public void change_product_type() {
product.changetype();
    }

    @Then("save")
    public void save() {
        product.save();

    }

    @Then("check the product type is changed")
    public void check_the_product_type_is_changed() {

product.check();


    }
    @Then("Validate")
    public void validate() {
       product.verify();
    }



}
