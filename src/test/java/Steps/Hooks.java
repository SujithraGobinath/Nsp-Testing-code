package Steps;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.nopcommerce.product1.cucumber.Testcontext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

         Testcontext testContext;

        public Hooks(Testcontext testContext) {
            this.testContext = testContext;
        }

        @Before
        public void Setup() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            testContext.setDriver(new ChromeDriver(options));
        }


    }


