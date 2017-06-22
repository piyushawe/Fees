package Code;


import Stepdef_Runner.Step_def;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Code.Runner1;

/**
 * Created by himanshu on 06/15/2017.
 */
public class Login extends Runner1 {
    public WebDriver driver;
    Step_def ob1= new Step_def();
    Global_code ob3;
    public void url()
    {
        ob3.webdriver_code();
      driver.navigate().to(Url.toString());

    }
    public void Username_Password()
    {
        //driver.findElement(By.id(ob1.prop.getProperty("Login.username"))).sendKeys("");
      //  driver.findElement(By.id(ob1.prop.getProperty("Login.password"))).sendKeys("");
    }
    public void Login()
    {
        //driver.findElement(By.id(ob1.prop.getProperty("Login.login_button"))).sendKeys("");
    }
}





























