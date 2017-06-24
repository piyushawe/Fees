package Code;


import Stepdef_Runner.Step_def;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Code.Runner1;

import java.io.IOException;


/**
 * Created by himanshu on 06/15/2017.
 */
public class Login extends Runner1 {
    //Step_def ob1= new Step_def();
    Global_code ob3=new Global_code();
    public WebDriver dr=ob3.webdriver_code();
    public void url()
    {

      dr.navigate().to(Url);

    }
    public void Username_Password() throws IOException {

        dr.findElement(By.id(prop.getProperty("Login.username"))).sendKeys(username);
       dr.findElement(By.id(prop.getProperty("Login.password"))).sendKeys(password);
    }
    public void Login()
    {
        dr.findElement(By.id(prop.getProperty("Login.login_button"))).click();
    }
}





























