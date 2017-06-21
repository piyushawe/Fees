package Stepdef_Runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by himanshu on 06/15/2017.
 */

public class Step_def
{ WebDriver driver;
    @Before
    public void webdriver_instance()
    {
        System.setProperty("webdriver.chrome.driver","D:\\selenium drivers\\chromedriver_win32new\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @When("^Enter Url$")
    public void enter_Url(){
        System.out.println("URL");

    }

    @Then("^Enter Username and Password$")
    public void enter_Username_and_Password() {
        System.out.println("User");

    }

    @Then("^Click on login button$")
    public void click_on_login_button() {
        System.out.println("Login");
    }
    @After
    public void close_webdriver_instance()
    {
        driver.close();
    }
}
