package Stepdef_Runner;

import Code.Global_code;
import Code.Login;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


/**
 * Created by himanshu on 06/15/2017.
 */

public class Step_def
{ public WebDriver dr1;
    Login ob2;
    Global_code ob3;
    @Before
    public void webdriver_instance() throws IOException {
        ob3=new Global_code();
        //dr1=ob3.webdriver_code();
        //driver.manage().window().maximize();

    }

    @When("^Enter Url$")
    public void enter_Url(){
        ob2=new Login();
        ob2.url();
    }

    @Then("^Enter Username and Password$")
    public void enter_Username_and_Password() throws IOException {
      //  System.out.println("User");
        ob2.Username_Password();

    }

    @Then("^Click on login button$")
    public void click_on_login_button() {
        //System.out.println("Login");
        ob2.Login();
    }
    @After
    public void close_webdriver_instance()
    {
        //driver.close();
    }
}
