package Steps;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.com.newme.cucumber.Testcontext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    Testcontext testcontext;
    public  Hooks(Testcontext testcontext){
       this.testcontext=testcontext;
    }
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        testcontext.setDriver(new ChromeDriver(options));
    }
}
