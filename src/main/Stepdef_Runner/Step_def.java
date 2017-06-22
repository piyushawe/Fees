package Stepdef_Runner;

import Code.Login;
import Code.Runner1;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


/**
 * Created by himanshu on 06/15/2017.
 */

public class Step_def
{ WebDriver driver;
    public Properties prop;
    Login ob2=new Login();
    @Before
    public void webdriver_instance() throws IOException {
        System.setProperty("webdriver.chrome.driver","D:\\selenium drivers\\chromedriver_win32new\\chromedriver.exe");
        driver=new ChromeDriver();
        prop= new Properties();
        FileInputStream fl1=new FileInputStream("C:\\Users\\himanshu\\IdeaProjects\\Fees\\prop.properties");
        prop.load(fl1);
    }
    @When("^Enter Url$")
    public void enter_Url(){

        ob2.url();
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
        //driver.close();
    }
}
